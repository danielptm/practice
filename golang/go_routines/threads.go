package go_routines

import (
	"fmt"
	"math/rand"
	"os"
	"sync"
	"time"
)

func run1() {
	println("before sleep")
	time.Sleep(2000)
	println("after sleep")
}

func run2(c chan string) {
	println("before sleep")
	time.Sleep(3000 * time.Millisecond)
	println("after sleep")
	c <- "from run2(c)"
	println("after  c <- ")
	time.Sleep(3000 * time.Millisecond)

}

func run3() {
	for i := 0; i < 5; i++ {
		println(i)
	}
}

func run4() {
	var wg = sync.WaitGroup{}
	wg.Add(3)
	go DoStuff(&wg, 3000)
	go DoStuff(&wg, 4000)
	go DoStuff(&wg, 5000)
	wg.Wait()
	println("🎉🎉🎉 Success! 🎉🎉🎉")

}

func DoStuff(wg *sync.WaitGroup, t int) {
	println("Doing stuff")
	time.Sleep(time.Duration(t) * time.Millisecond)
	wg.Done()
}

type Hi struct {
	Greet string
}

// Channel - Is used to communicate data between threads. Any data type can be passed in a channel. It is important to
// Note that invoking channels are a blocking operationg. Closing a channel is optional.
func Chan1() {
	c := make(chan Hi)
	go Greet(c)
	x := <-c
	fmt.Println(x.Greet)
	close(c)

}

func Greet(c chan Hi) {
	time.Sleep(5000 * time.Millisecond)
	c <- Hi{Greet: "hola"}
}

var wg = &sync.WaitGroup{}
var mu = sync.Mutex{}

// WaitGroup example
func WaitGroup() {
	wg.Add(5)
	for i := 0; i < 5; i++ {
		go Greet2(wg)
	}
	wg.Wait()
	fmt.Println("exiting")
	os.Exit(1)
}

func Greet2(group *sync.WaitGroup) {
	defer group.Done()
	time.Sleep(3000 * time.Millisecond)
	fmt.Println("hi")
}

// Mutex example
func MutextTest() {
	wg.Add(3)
	go Greet3(wg, "1")
	go Greet3(wg, "2")
	go Greet3(wg, "3")
	wg.Wait()
}

func Greet3(group *sync.WaitGroup, i string) {
	mu.Lock()
	time.Sleep(3000 * time.Millisecond)
	fmt.Println("hi: " + i)
	mu.Unlock()
	wg.Done()
}

// Select example
func SelectTest() {
	runAFunc := func(x string, c chan string) {
		time.Sleep(1000 * time.Millisecond)
		c <- fmt.Sprintf("%s", x)
	}

	c1 := make(chan string)
	c2 := make(chan string)
	go runAFunc("hi", c1)
	go runAFunc("hola", c2)

	select {
	case res1 := <-c1:
		fmt.Println(res1)
	case res2 := <-c2:
		fmt.Println(res2)
	}
	fmt.Println("end...")
}

func Chan2() {
	c := make(chan string)
	myfunc := func() {
		for {
			time.Sleep(2000 * time.Millisecond)
			fmt.Println("sending...")
			x := rand.Float32()
			println(fmt.Sprintf("x: %f", x))
			if x > 0.75 {
				fmt.Println("closing...")
				// Only writers should close channels
				close(c)
				break
			}

			c <- "hi"
		}
	}

	go myfunc()

	for {
		fmt.Println("receiving...")
		z, o := <-c
		if !o {
			fmt.Println("finishing...")
			break
		}
		fmt.Println(z)
	}

}

func BufferedChannel() {
	// Buffered channels allow sending if there is no receiving channel ready yet, can send a to the maxiumum number
	// provided by the third arg
	c := make(chan string, 3)

	myfunc := func() {
		for {
			time.Sleep(1000 * time.Millisecond)
			println("sending...")
			c <- "hi"
		}
	}

	go myfunc()

	for {
		time.Sleep(10000 * time.Millisecond)
		fmt.Println("receiving...")
		fmt.Println(<-c)
	}

}

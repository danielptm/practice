package go_routines

import (
	"fmt"
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

func Chan1() {
	c := make(chan Hi)
	go Greet(c)
	x := <-c
	fmt.Println(x.Greet)
	close(c)

}

var wg = &sync.WaitGroup{}
var mu = sync.Mutex{}

func Greet(c chan Hi) {
	time.Sleep(5000 * time.Millisecond)
	c <- Hi{Greet: "hola"}
}

func Greet2(group *sync.WaitGroup) {
	defer group.Done()
	time.Sleep(3000 * time.Millisecond)
	fmt.Println("hi")
}

func Greet3(group *sync.WaitGroup, i string) {
	mu.Lock()
	time.Sleep(3000 * time.Millisecond)
	fmt.Println("hi: " + i)
	mu.Unlock()
	wg.Done()
}

func WaitGroup() {
	wg.Add(5)
	for i := 0; i < 5; i++ {
		go Greet2(wg)
	}
	wg.Wait()
	fmt.Println("exiting")
	os.Exit(1)
}

func MutextTest() {
	wg.Add(3)
	go Greet3(wg, "1")
	go Greet3(wg, "2")
	go Greet3(wg, "3")
	wg.Wait()
}

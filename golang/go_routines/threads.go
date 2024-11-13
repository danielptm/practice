package go_routines

import (
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

package go_routines

import "time"

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
}

func run3() {
	for i := 0; i < 5; i++ {
		println(i)
	}
}

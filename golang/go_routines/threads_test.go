package go_routines

import "testing"

// basic goroutine example
func TestRun(t *testing.T) {
	go run1()
	println("In test, after call to run()")
}

// goroutine with channel and blocking
func TestRun2(t *testing.T) {
	c := make(chan string)
	go run2(c)
	println("In test, after call to run()")
	println(<-c)
}

func TestRun3(t *testing.T) {
	run3()
}

func TestRun4(t *testing.T) {
	run4()
}
func TestRun5(t *testing.T) {
	Chan1()
}

func TestRun6(t *testing.T) {
	WaitGroup()
}

func TestMutextTest(t *testing.T) {
	MutextTest()
}

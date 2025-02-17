package interfaces

import "fmt"

type bot interface {
	getGreeting() string
}

type englishBot struct{}
type spanishBot struct{}

func (englishBot) getGreeting() string {
	return "Hi!"
}

func (spanishBot) getGreeting() string {
	return "Hola!"
}

func printGreeting(b bot) {
	fmt.Println(b.getGreeting())
}

func Interfaces() {
	eb := spanishBot{}
	printGreeting(eb)
}

type TestInterface interface {
	SayHi()
}

type Demo struct{}
type Demo2 struct{}

func (Demo) SayHi() {
	println("hi")
}

func (dm *Demo2) SayHi() {
	println("hi2")

}

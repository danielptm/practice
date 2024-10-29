package udemy_course

import (
	"fmt"
	"testing"
)

func TestEx1(t *testing.T) {
	first, last := ex1()
	println("&&")
	println(first + " " + last)
}

func TestEx2(t *testing.T) {
	res := ex2()
	fmt.Printf("%+v", res)
}

func TestEx3(t *testing.T) {
	ms := MyStruct{Text: "Hi"}
	res := ex3(ms)
	fmt.Printf("%+v", res)
}

func TestGetS(t *testing.T) {
	res := getS()
	println(res)
}

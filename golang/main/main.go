package main

import "fmt"

func main() {
	sliceExample()
}

func sliceExample() {
	cards := newDeck()
	_, e := getError()
	if e != nil {
		print(e)
	}
	fmt.Println(cards)
	first2 := cards.getFirst2()
	println("First 2: ", first2)
	last2 := cards.getLast2()
	println("Last 2: ", last2)
	cards.print()
}

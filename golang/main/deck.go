package main

import (
	"errors"
	"fmt"
)

// Here we are creating a deck which is a slice of strings. We are doing this so we can add functionality to the []string type
type deck []string

func newDeck() deck {
	suits := []string{"Spades", "Diamonds", "Hearts", "Clubs"}
	values := []string{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}
	cards := deck{}

	for _, s := range suits {
		for _, v := range values {
			val := v + " " + s
			cards = append(cards, val)
		}
	}
	return cards
}

func (d deck) print() {
	for i, card := range d {
		fmt.Println(i, card)
	}
}

func (d deck) getFirst2() []string {
	return d[0:2]
}

func (d deck) getFirst3() []string {
	return d[0:3]
}

func (d deck) getLast2() []string {
	return d[2:]
}

func deal(d deck, handSize int) (deck, deck) {
	return d[:handSize], d[handSize:]
}

// For demo purpose
func getError() (string, error) {
	return "", errors.New("my test error")
}

package main

import "testing"

func TestNewDeck(t *testing.T) {
	d := newDeck()
	if len(d) != 52 {
		t.Errorf("Exepected deck length of 20 but got: %d", len(d))
	}
}

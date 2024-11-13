package leetcode

import "testing"

func TestKthFactor(t *testing.T) {
	res := kthFactor(12, 3)
	expected := 3
	if res != expected {
		t.Error("error")
	}
}

func TestKthFactor2(t *testing.T) {
	res := kthFactor(7, 2)
	expected := 7
	if res != expected {
		t.Error("error")
	}
}

func TestKthFactor3(t *testing.T) {
	res := kthFactor(4, 4)
	expected := -1
	if res != expected {
		t.Error("error")
	}
}

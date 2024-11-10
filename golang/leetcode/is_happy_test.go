package leetcode

import "testing"

func TestIsHappy(t *testing.T) {
	res := isHappy(19)
	expected := true
	if res != expected {
		t.Error("expected res to be true")
	}
}

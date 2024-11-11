package leetcode

import (
	"fmt"
	"testing"
)

func TestIsPalindrome1(t *testing.T) {
	res := isPalindrome(121)
	expected := true
	if res != expected {
		t.Error(fmt.Sprintf("res %t does not equal expected %t", res, expected))
	}
}

func TestIsPalindrome2(t *testing.T) {
	res := isPalindrome(-10)
	expected := false
	if res != expected {
		t.Error(fmt.Sprintf("res %t does not equal expected %t", res, expected))
	}
}

func TestIsPalindrome3(t *testing.T) {
	res := isPalindrome(10)
	expected := false
	if res != expected {
		t.Error(fmt.Sprintf("res %t does not equal expected %t", res, expected))
	}
}

func TestIsPalindrome4(t *testing.T) {
	res := isPalindrome(100)
	expected := false
	if res != expected {
		t.Error(fmt.Sprintf("res %t does not equal expected %t", res, expected))
	}
}

func TestIsPalindrome5(t *testing.T) {
	res := isPalindrome(1000021)
	expected := false
	if res != expected {
		t.Error(fmt.Sprintf("res %t does not equal expected %t", res, expected))
	}
}

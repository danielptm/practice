package leetcode

import "testing"

func TestLengthOfLongestSubstring(t *testing.T) {
	res := lengthOfLongestSubstring("abcabcbb")
	expected := 3
	if res != expected {
		t.Error("error")
	}
}

func TestLengthOfLongestSubstring2(t *testing.T) {
	res := lengthOfLongestSubstring("au")
	expected := 2
	if res != expected {
		t.Error("error")
	}
}

func TestTesting(t *testing.T) {
	s := "abc"
	println(s[0:3])
}

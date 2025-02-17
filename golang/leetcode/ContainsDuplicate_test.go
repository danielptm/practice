package leetcode

import "testing"

func TestContainsDuplicate(t *testing.T) {
	res := containsDuplicate([]int{1, 2, 3, 1})
	expected := true

	if res != expected {
		t.Error("error")
	}
}

func TestContainsDuplicate2(t *testing.T) {
	res := containsDuplicate([]int{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})
	expected := true

	if res != expected {
		t.Error("error")
	}
}

func TestContainsDuplicate3(t *testing.T) {
	res := containsDuplicate([]int{3, 3})
	expected := true

	if res != expected {
		t.Error("error")
	}
}

func TestMapTesting(t *testing.T) {
	MapTesting()
}

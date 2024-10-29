package leetcode

import "testing"

func TestTwoSum(t *testing.T) {
	nums := []int{2, 7, 11, 15}
	target := 9
	expected := []int{0, 1}
	res := twoSum(nums, target)
	if res[0] != expected[0] && res[1] != expected[1] {
		t.Error("res did not equal expected")
	}

}

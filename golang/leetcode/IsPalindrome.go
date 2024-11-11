package leetcode

import "strconv"

func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	converted := strconv.FormatInt(int64(x), 10)
	if len(converted) == 2 {
		if converted[0] == converted[1] {
			return true
		} else {
			return false
		}
	}
	if len(converted) == 1 {
		return true
	}
	res := false
	r := len(converted) - 1
	for i := 0; i < len(converted); i++ {
		if i == r {
			break
		}
		left := converted[i]
		right := converted[r]
		if left == right {
			res = true
		} else {
			res = false
			break
		}
		r = r - 1
	}
	return res
}

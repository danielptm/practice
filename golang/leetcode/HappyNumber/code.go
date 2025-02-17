package HappyNumber

import (
	"math"
	"strconv"
	"strings"
)

// https://leetcode.com/problems/happy-number/
func isHappy(n int) bool {

	curr := n
	keepGoing := true
	for keepGoing {
		strC := strconv.FormatInt(int64(curr), 10)
		splitItems := strings.Split(strC, "")
		newNum := 0
		for _, v := range splitItems {
			n, _ := strconv.Atoi(v)
			res := math.Pow(2, float64(n))
			newNum = newNum + int(res)
		}
		curr = newNum
	}
	return true
}

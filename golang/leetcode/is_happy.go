package leetcode

import (
	"math"
	"strconv"
	"strings"
)

// https://leetcode.com/problems/happy-number/description/
func isHappy(n int) bool {
	nums := strconv.FormatInt(int64(n), 10)
	numsSplit := strings.Split(nums, "")

	res := 0.0
	for i := 0; i < len(numsSplit); i++ {
		in, _ := strconv.Atoi(numsSplit[i])
		res = res + math.Pow(float64(in), 2)
	}
	return true
}

package leetcode

import (
	"cmp"
	"slices"
	"strings"
)

func lengthOfLongestSubstring(s string) int {
	if len(s) == 0 {
		return 0
	}
	if len(s) == 1 {
		return 1
	}

	substrings := make([]string, 0)

	for i := 0; i < len(s); i++ {
		var currSubs strings.Builder
		currSubs.WriteString("")
		currSubs.WriteString(s[i : i+1])
		for j := i; j < len(s); j++ {
			if i == j {
				continue
			}

			js := s[j : j+1]
			if !strings.Contains(currSubs.String(), js) {
				currSubs.WriteString(js)
				substrings = append(substrings, currSubs.String())
			} else {
				substrings = append(substrings, currSubs.String())
				break
			}
		}
		if i == len(s)-2 {
			break
		}
	}

	slices.SortFunc(substrings, func(a string, b string) int {
		return cmp.Compare(len(a), len(b))
	})
	return len(substrings[len(substrings)-1])
}

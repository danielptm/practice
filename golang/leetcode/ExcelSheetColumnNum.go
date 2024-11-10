package leetcode

import (
	"math"
	"strings"
	"unicode/utf8"
)

// https://leetcode.com/problems/excel-sheet-column-number/description/
func getMap() map[string]int {
	dMap := make(map[string]int)
	alph := "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	split_alph := strings.Split(alph, "")
	for i := 0; i < len(split_alph); i++ {
		r, _ := utf8.DecodeRuneInString(split_alph[i])
		dMap[split_alph[i]] = int(r) - 64
	}
	return dMap
}

func titleToNumber(columnTitle string) int {
	dmap := getMap()
	res := 0.0
	splitCol := strings.Split(columnTitle, "")
	if len(splitCol) == 1 {
		return dmap[splitCol[0]]
	}
	pow := float64(len(splitCol)) - 1
	for i := 0; i < len(splitCol); i++ {
		if i < (len(splitCol) - 1) {
			res = res + math.Pow(float64(dmap[splitCol[i]]*26), pow)
			pow = pow - 1
		} else {
			res = res + float64(dmap[splitCol[i]])
		}
	}

	return int(res)
}

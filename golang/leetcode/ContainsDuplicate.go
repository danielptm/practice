package leetcode

// https://leetcode.com/problems/contains-duplicate/submissions/1449152163/
func containsDuplicate(nums []int) bool {
	countMap := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		if countMap[nums[i]] == 0 {
			countMap[nums[i]] = 1
		} else {
			countMap[nums[i]] = countMap[nums[i]] + 1
		}
		if countMap[nums[i]] > 1 {
			return true
		}
	}
	return false
}

type Hi struct {
	text string
}

func MapTesting() {
	m := make(map[string]Hi)
	m["1"] = Hi{text: "hi"}
	println("*")
	if item, exists := m["1"]; exists {
		println(item.text)
	}
	for k, v := range m {
		println(k)
		println(v.text)

	}

}

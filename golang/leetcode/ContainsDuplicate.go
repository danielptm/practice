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

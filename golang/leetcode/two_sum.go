package leetcode

func twoSum(nums []int, target int) []int {
	for i := 0; i < len(nums); i++ {
		for j := 0; j < len(nums); j++ {
			if i == j {
				continue
			} else {
				s := nums[i] + nums[j]
				if s == target {
					return []int{i, j}
				}
			}
		}
	}
	return []int{}
}

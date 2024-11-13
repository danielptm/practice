package leetcode

func kthFactor(n int, k int) int {
	cache := make([]int, 0)
	for i := 1; i <= n; i++ {
		if len(cache) == k {
			return cache[k-1]
		}
		if n%i == 0 {
			cache = append(cache, i)
		}
	}
	if k > len(cache) {
		return -1
	}
	return cache[k-1]
}

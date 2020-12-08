from typing import List

class TwoSortedArrays:

    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        comb_arrays = nums1 + nums2
        comb_arrays.sort()
        is_even = len(comb_arrays) % 2 == 0

        result = None
        if len(comb_arrays) == 1:
            return comb_arrays[0]
        if is_even:
            midTwo = len(comb_arrays) // 2
            result = (comb_arrays[midTwo - 1] + comb_arrays[midTwo]) / 2
        else:
            result = comb_arrays[(len(comb_arrays) // 2)]
        return float(result)
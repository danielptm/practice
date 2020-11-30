class PalinedromeNumber:

    def isPalindrome(self, x: int) -> bool:
        str_val = str(x)
        str_len = len(str_val)
        half = str_len // 2
        is_even = True if str_len % 2 == 0 else False

        first_half = ''
        second_half = ''

        second_half_corrected = ''

        if is_even:
            first_half = str_val[0: half]
            second_half = str_val[half: str_len]
        else:
            first_half = str_val[0: half]
            second_half = str_val[half + 1: str_len]

        i = len(second_half) - 1
        while i >= 0:
            second_half_corrected += second_half[i]
            i -= 1
        second_half_corrected = second_half_corrected
        result = True if first_half == second_half_corrected else False
        return result
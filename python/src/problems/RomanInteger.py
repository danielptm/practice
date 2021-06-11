class RomanInteger:
    def romanToInt(self, s: str) -> int:
        nums = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        four_exists = self.four_exists(s)
        return_sum = 0
        if four_exists:
            if len(s) == 2:
                return_sum = nums[s[1:2]] - 1
            else:
                ss = s[0:len(s) - 2]
                for ch in ss:
                    return_sum = return_sum + nums[ch]
                return_sum = return_sum + 4
        else:
            for ch in s:
                return_sum = return_sum + nums[ch]
        return return_sum

    def four_exists(self, s) -> bool:
        if (len(s) < 2):
            return False

        sub_str = s[len(s) - 2:]
        result = (sub_str == "IV") | (sub_str == "IX") | (sub_str == "IL") | (sub_str == "IC") | (sub_str == "ID") | (sub_str == "IM")
        return result


    # Read this for how to read roman numeral
    # https://www.google.com/search?rlz=1C5CHFA_enUS917US917&sxsrf=ALeKk01fGIe7ychO4bqVauu8rNeOa3p6pg:1623295529785&q=how+to+read+roman+numeral&spell=1&sa=X&ved=2ahUKEwja86uLj4zxAhXC454KHcbfCagQBSgAegQIARA1&biw=1416&bih=691
    def calculate(self,s):
        nums = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
        return_sum = 0
        for i in range(len(s) - 1):
            if i == 0:
                return_sum = return_sum + nums[s[i]]
            else:
                if



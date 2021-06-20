class RomanInteger:
    nums = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}
    result = 0

    def romanToInt(self, s: str) -> int:
        if len(s) == 0:
            return self.result
        ch1 = s[0]
        if len(s) == 1:
            self.result = self.result + self.nums[ch1]
            return self.result
        if len(s) == 2 and self.four_exists(s):
            x = (self.nums[s[1]])
            self.result = self.result + (x - 1)
            return self.romanToInt(s[2:])
        else:
            ch2 = s[1]

            if self.nums[ch1] < self.nums[ch2]:
                self.result = self.result + (self.nums[ch1] - self.nums[ch2])
            else:
                self.result = self.result + self.nums[ch1] + self.nums[ch2]
            return self.romanToInt(s[2:])


    def four_exists(self, s) -> bool:
        sub_str = s
        res = (sub_str == "IV") | (sub_str == "IX") | (sub_str == "IL") | (sub_str == "IC") | (sub_str == "ID") | (sub_str == "IM")
        return res


    # Read this for how to read roman numeral
    # https://www.google.com/search?rlz=1C5CHFA_enUS917US917&sxsrf=ALeKk01fGIe7ychO4bqVauu8rNeOa3p6pg:1623295529785&q=how+to+read+roman+numeral&spell=1&sa=X&ved=2ahUKEwja86uLj4zxAhXC454KHcbfCagQBSgAegQIARA1&biw=1416&bih=691

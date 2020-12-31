import re


class Atoi:
    def myAtoi(self, s: str) -> int:
        # If s is a positive or negative number, then return it as an int.
        if self.is_num(s):
            result = int(s)
            if result < -2147483648:
                return -2147483648
            if result > 2147483647:
                return 2147483647
            else:
                return result
        if len(s) == 0:
            return 0
        first_char = s[0]
        sec_char = None
        if len(s) > 1:
            sec_char = s[1]
        is_char = False
        if first_char is ' ' or (first_char is '0' and sec_char is not ' ' and '-' not in s and '+' not in s):
            return self.myAtoi(s[1:len(s)])
        elif first_char is '0' and '-' in s or '+' in s or first_char is '0' and sec_char is ' ':
            return 0
        if first_char != '+' and first_char != '-' and bool(re.match(r"\D", first_char)):
            is_char = True
        if is_char:
            return 0
        if first_char is '+' or first_char is '-':
            if len(s) == 1:
                return 0
            sub = s[1: len(s)]
            if len(s) > 2:
                if s[0] == '+' or s[0] == '-' and s[1] == '+' or s[1] == '-':
                    return 0
            if sub[0] == '0':
                new = first_char + sub[1: len(sub)]
                return self.myAtoi(new)
            num = re.search(r"\D", sub)
            num = num.start()
            comb = first_char + sub[0:num]
            if num is None:
                return self.myAtoi(comb)
            else:
                return self.myAtoi(comb)
        else:
            sub = s[1: len(s)]
            num = re.search(r"\D", sub)
            num = num.start()
            comb = first_char + sub[0:num]
            return self.myAtoi(comb)

    def is_num(self, s):
        try:
            int(s)
            return True
        except:
            return False

import string
from copy import deepcopy


class PalinedromeNumber:

    def isSpecialSequence(self, dna_sequence):
        ss = list(dna_sequence)
        if self.isPalindrome(ss) == True:
            return "YES"
        for i in range(len(dna_sequence)):
            copy = deepcopy(ss)
            joinedS = ''.join(copy)
            str1 = joinedS[0: i]
            str2 = joinedS[i: len(joinedS)]
            loop1res = False
            loop2res = False
            for j in range(len(str1)):
                str3 = deepcopy(str1)
                str3.replace(str3[j],"", 1)
                if self.isPalindrome(str3):
                    return "YES"
            for j in range(len(str2)):
                str4 = deepcopy(str2)
                str4.replace(str4[j],"", 1)
                if self.isPalindrome(str4):
                    return "YES"
        return "NO"


    def isPalindrome(self, x: str) -> bool:
        str_len = len(x)
        half = str_len // 2
        is_even = True if str_len % 2 == 0 else False

        first_half = ''
        second_half = ''

        second_half_corrected = ''

        if is_even:
            first_half = x[0: half]
            second_half = x[half: str_len]
        else:
            first_half = x[0: half]
            second_half = x[half + 1: str_len]

        i = len(second_half) - 1
        while i >= 0:
            second_half_corrected += second_half[i]
            i -= 1
        result = True if first_half == second_half_corrected else False
        return result
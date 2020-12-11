from typing import List

class LongestPalindromeSubstring:
    def longestPalindrome(self, s: str) -> str:
        result = 'a'

        if s == s[::-1]:
            result = s
        if len(s) == 1:
            result = s
        elif len(s) == 2:
            if s[0] != s[1]:
                result = s[0]
            else:
                result = s
        else:
            # Put all letters into a hashmap with letter
            # as key and an array with the indexes of all ocurrences as value
            # loop through hashmap if the length of the array is 2 or greater
            # then do the palindrome search
            # In the palindrome search double loop
            # through all ocurrences match every index with every index
            # and get that substring. If forwards == backwards then add it to found_pal

            letters = {}
            i = 0
            while i < len(s):
                if s[i] in letters:
                    letters[s[i]].append(i)
                else:
                    letters[s[i]] = [i]
                i = i + 1
            i = 0
            for key, value in letters.items():
                if len(value) > 1:
                    i = 0
                    while i < len(value):
                        j = len(value) - 1
                        while j > 0:
                            sub = s[value[i]:value[j] + 1]
                            length = len(sub)
                            if(len(sub) > len(result)):
                                s_rev = sub[::-1]
                                if sub == s_rev:
                                    result = sub
                            j = j - 1
                        i = i + 1
        return result



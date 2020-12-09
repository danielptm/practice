from typing import List

class LongestPalindromeSubstring:
    def longestPalindrome(self, s: str) -> str:
        found_pal = []


        if s == s[::-1]:
            return s
        if len(s) == 1:
            found_pal.append(s)
        elif len(s) == 2:
            found_pal.append(s[0])
        else:
            # Put all letters into a hashmap with letter
            # as key and an array with the indexes of all ocurrences as value
            # loop through hashmap if the length of the array is 2 or greater
            # then do the palindrome search
            # In the palindrome search double loop
            # through all ocurrences match every index with every index
            # and get that substring. If forwards == backwards then add it to found_pal
            x = 's'

        return found_pal[len(found_pal) - 1]



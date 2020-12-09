class LongestPalindromeSubstring:
    def longestPalindrome(self, s: str) -> str:
        found_pal = []
        i = 0
        j = len(s)

        if s == s[::-1]:
            return s
        if len(s) == 1:
            found_pal.append(s)
        elif len(s) == 2:
            found_pal.append(s[0])
        else:
            while i < len(s):
                while j >= 0:
                    substr1 = s[i:j - 1]
                    substr2 = s[i + 1: j]
                    if substr1 == substr1[::-1]:
                        found_pal.append(substr1)
                    if substr2 == substr2[::-1]:
                        found_pal.append(substr2)
                    j = j - 1
                i = i + 1
        found_pal.sort(key=len)
        return found_pal[len(found_pal) - 1]

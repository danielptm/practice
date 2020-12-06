

# Given a string s, find the length of the longest substring without repeating characters.
class LongestSubstring:

    def lengthOfLongestSubstring(self, s: str) -> int:
        sub_strs = []
        found_chars = []

        s_length = len(s)

        i = 0
        j = None

        while i < s_length:
            j = i + 1
            new_s = s[i]
            found_chars.append(new_s)
            if new_s not in sub_strs:
                while j < s_length:
                    char = s[j]
                    if char not in found_chars:
                        new_s += char
                        found_chars.append(char)
                        bs = None
                    else:
                        i = j
                        break
                    j += 1
                sub_strs.append(new_s)
            i += 1
            sub_strs.sort()
        return sub_strs[0]
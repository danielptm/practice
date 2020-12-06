

# Given a string s, find the length of the longest substring without repeating characters.
class LongestSubstring:

    def lengthOfLongestSubstring(self, s: str) -> int:
        sub_strs = []
        found_chars = []

        s_length = len(s)

        i = 0
        j = None

        if s is '':
            return 0

        while i < s_length:
            found_chars = []
            j = i + 1
            new_s = s[i]
            found_chars.append(new_s)
            while j < s_length:
                char = s[j]
                if char not in found_chars:
                    new_s += char
                    found_chars.append(char)
                    bs = None
                else:
                    last_appended_char = new_s[len(new_s) - 1]
                    if char == last_appended_char:
                        i = j - 1
                    else:
                        i = j
                    break
                j += 1
            sub_strs.append(new_s)
            i += 1
            sub_strs.sort(key=len)
        return len(sub_strs[len(sub_strs) - 1])
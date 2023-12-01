import math
import unittest
from typing import List


class TestHashing(unittest.TestCase):

    def checkIfPangram(self, sentence: str) -> bool:
        """
        A pangram is a sentence where every letter of the English alphabet appears at least once.
        :type sentence: str
        :rtype: bool
        """
        s = set()
        for c in sentence:
            s.add(c)
        l = len(s)
        if l == 26:
            return True
        return False

    def test_checkIfPangram(self):
        sentence = "thequickbrownfoxjumpsoverthelazydog"
        res = self.checkIfPangram(sentence)
        self.assertEqual(True, res)

    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums) + 1
        for i in range(n):
            if i in nums:
                continue
            else:
                return i

    def test_misingNumber(self):
        nums = [3, 0, 1]
        e = 2
        res = self.missingNumber(nums)
        self.assertEqual(e, res)

    def test_missinNumber2(self):
        nums = [0, 1]
        e = 2
        res = self.missingNumber(nums)
        self.assertEqual(e, res)

    def countElements(self, arr: List[int]) -> int:
        count = 0
        for n in arr:
            c = n + 1
            if c in arr:
                count += 1
        return count

    def test_countElements(self):
        arr = [1, 2, 3]
        e = 2
        res = self.countElements(arr)
        self.assertEqual(e, res)

    def test_countElements2(self):
        arr = [1, 1, 3, 3, 5, 5, 7, 7]
        e = 0
        res = self.countElements(arr)
        self.assertEqual(e, res)

    def findWinners(self, matches: List[List[int]]) -> List[List[int]]:
        lost_match_records = {}
        result = [[], []]
        winners = set()
        for m in matches:
            winners.add(m[0])
            if m[1] not in lost_match_records.keys():
                lost_match_records[m[1]] = 1
            else:
                lost_match_records[m[1]] = lost_match_records[m[1]] + 1
        for w in winners:
            if w not in lost_match_records.keys():
                result[0].append(w)
        for k,v in lost_match_records.items():
            if v == 1:
                result[1].append(k)
        result[0] = sorted(result[0])
        result[1] = sorted(result[1])
        return result

    def test_findWinners(self):
        matches = [[1, 3], [2, 3], [3, 6], [5, 6], [5, 7], [4, 5], [4, 8], [4, 9], [10, 4], [10, 9]]
        e = [[1, 2, 10], [4, 5, 7, 8]]
        res = self.findWinners(matches)
        self.assertListEqual(sorted(e[0]), sorted(res[0]))
        self.assertListEqual(sorted(e[1]), sorted(res[1]))


    def largestUniqueNumber(self, nums: List[int]) -> int:
        largest_n = -1
        nums_counts = {}
        for n in nums:
            if n not in nums_counts.keys():
                nums_counts[n] = 1
            else:
                nums_counts[n] = nums_counts[n] + 1
        for k,v in nums_counts.items():
            if k > largest_n and v == 1:
                largest_n = k
        return largest_n

    def test_largestUniqueNumber(self):
        nums = [5, 7, 3, 9, 4, 9, 8, 3, 1]
        e = 8
        res = self.largestUniqueNumber(nums)
        self.assertEqual(e, res)

    def test_maxNumberOfBalloons(self):
        text = "nlaebolko"
        e = 1
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)

    def test_maxNumberOfBalloons2(self):
        text = "leetcode"
        e = 0
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)

    def test_maxNumberOfBalloons3(self):
        text = "loonbalxballpoon"
        e = 2
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)

    def test_maxNumberOfBalloons4(self):
        text = "balon"
        e = 0
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)

    def test_maxNumberOfBalloons5(self):
        text = "balllllllllllloooooooooon"
        e = 1
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)


    def maxNumberOfBalloons(self, text: str) -> int:
        counts = {"b":0, "a": 0, "l": 0, "o": 0, "n": 0}
        for n in text:
            if n in counts.keys():
                counts[n] = counts[n] + 1
        large_n = 0
        for k,v in counts.items():
            if v > large_n:
                large_n = v
        b = counts["b"]
        a = counts["a"]
        l = counts["l"]
        o = counts["o"]
        n = counts["n"]

        if o < 2 or l < 2:
            return 0

        arr_counts = [b, a, l, o, n]
        min_arr_counts = min(arr_counts)

        result = math.floor(large_n / 2)

        if min_arr_counts < result:
            return min_arr_counts
        else:
            return result

    def test_maxNumberOfBalloons5(self):
        text = "krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw"
        e = 10
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)

    def test_maxNumberOfBalloons6(self):
        text = "lloo"
        e = 0
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)


    def test_maxNumberOfBalloons7(self):
        text = "ballon"
        e = 0
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)

    def test_maxNumberOfBalloons7(self):
        text = "mbetypbpefxvviadqaodrbjeoacfomepmzymiudltgnvnpbowwmjgpzzhtiismearuwocsgbiimiqqzaozgeizikrlxmupfzjzmlfttqqbpfblqfkecsdfbsceqjhubfxksivrfwvukapxmuciybfhzlmpeamdxziptxregymqtmgcsujmugissgnlbhxbcxxeoumcqyulvahuianbaaxgzrtmshjguqdaxvxndzoqvwmcjfhpevavnrciqbymnlylbrfkkiceienoarfrzzxtuaqapaeqeqolozadmtgjyhfqzpuaskjuawxqkdqyjqcmbxtvshzrquvegcuyuckznspmrxvqdassidcmrajedsnuuumfwqzvasljlyvfefktiqgvzvdzojtjegsyhbepdkuwvgrfscezvswywmdavpxlekbrlkfnbyvlobazmvgulxrfdranuhomkrlpbfeagfxxxuhjuqhbkhznixquxrxngwimdxdhqbdaouitsvcdmbwxbbaomkgxsqwnexbjjyhtxvkjfqkrrxjghvzqsattubphryqxxdyjkihfnzvjhohnhdlfwoqiwtmwzfgcyhyqtcketvgnbchcxvnhcsoosirfqgdgcsitegzlxdfijzmxnvhrulmgvoqfpzesootscnxenokmmozmoxpaverydbsnimwacjqhrtxkqtvghjyushoctxphxzztukgmnoeycqaeukymvwxcsyvvctflqjhtcvjtxncuvhkptkjnzaetwbzkwnseovewuhpkaxiphdicgacszzdturzgjkzwgkmzzavykancvvzaafgzjhcyicorrblmhsnnkhfkujttbkuuedhwguuaapojmnjdfytdhrepjwcddzsoeutlbbljlikghxefgbqenwamanikmynjcupqpdjnhldaixwygcvsgdkzszmsptqqnroflgozblygtiyaxudwmooiviqcosjfksnevultrf"
        e = 14
        res = self.maxNumberOfBalloons(text)
        self.assertEqual(e, res)

# https://leetcode.com/problems/nim-game/

class NimGame:

    def canWinNim(self, n):
        if (n < 4):
            return True
        else:
            result = n % 4 != 0 if True else False
            return result
class ReverseInteger:

    def reverse(self, x: int) -> int:
        i = len(str(x)) - 1
        str_x = str(x)
        result = ''
        while i >= 0:
            if i == 0 and str_x[i] == '-':
                result = str_x[i] + result
            else:
                result += str_x[i]
            i -= 1
        result = int(result)
        if ((-2 ** 31) <= result) and (result <= ((2 ** 31) - 1)):
            return result
        else:
            return 0

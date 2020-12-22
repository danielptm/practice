
class ZigZagConversion:

    '''
    Algorithm:

    n = number of rows
    col = 0
    load_row = 0

    Each inner array is a column of characters.
    col_chars = []

    Step1
    when load_row = 0 add a new column add character and increment load_row add new character to column
    and repeat while low_row while < n. If end of string then break loop. If load_row == n then take step2.

    Step 2
    If load_row = n.
    Decrement load row add new column and 1 character to columnt and repeat until load_row = 0.
    If load_row = 0 then take step_1.
    '''


    def convert(self, s: str, numRows: int) -> str:
        org_len = len(s)
        col = 0
        col_chars = [[]]

        prev_full_col = None
        next_full_col = None

        result = ''

        if numRows == 1 or len(s) == 2:
            return s

        if numRows == 2:
            i = 0
            while i < len(s):
                if i != 0 and not ((i - 1) % 2 != 0) and i < len(s) - 2:
                    result = result + s[i + 1]
                    result = result + s[i]
                    if len(s) - 2 > i:
                        i = i + 2
                else:
                    result = result + s[i]
                    i = i + 1
            return result

        while len(s) > 0:
            if col == 0 or (col != 1 and (col % (numRows - 1) == 0 or (numRows - 1) % col == 0)):
                prev_full_col = col
                next_full_col = prev_full_col + numRows
            if col == prev_full_col:
                i = 0
                if len(s) == 0:
                    break
                while i < numRows:
                    if len(s) == 0:
                        break
                    curr_char = s[0]
                    col_chars[col].append(curr_char)
                    s = s[1: len(s)]
                    i = i + 1
                col_chars.append([])
                col = col + 1

            if prev_full_col < col & col < next_full_col:
                j = 0
                while j < numRows:
                    col_chars[col].append(None)
                    j = j + 1
                if len(s) == 0:
                    break
                curr_char = s[0]
                place = (next_full_col - 1) - col
                col_chars[col][place] = curr_char
                s = s[1: len(s)]
                col_chars.append([])
                col = col + 1
        i = 0
        while i < numRows:
            for item in col_chars:
                if org_len == len(result):
                    break
                if i < len(item):
                    if item[i] is not None:
                        result += item[i]
                else:
                    continue
            i += 1
        return result

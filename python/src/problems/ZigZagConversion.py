
class ZigZagConversion:

    #TODO This function is really ugly. It is inefficient and has different implementations based on input.
    # https://leetcode.com/problems/zigzag-conversion/
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

            top_row = []
            bottom_row = []

            col = 0
            while i < len(s):
                if i == 0 or i % 2 == 0:
                    top_row.append(s[i])
                else:
                    bottom_row.append(s[i])
                i = i + 1
            j = 0
            result = ''
            while j < len(top_row):
                result = result + top_row[j]
                j = j + 1

            j = 0
            while j < len(bottom_row):
                result = result + bottom_row[j]
                j = j + 1

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

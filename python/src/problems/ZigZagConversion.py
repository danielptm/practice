
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
        n = numRows
        col = 0
        load_row = 0
        col_chars = [[]]

        is_full_col = True

        while len(s) > 0:
            if col == 0 or ((n - 1) % col == 0 and (col != 1)):
                is_full_col = True
            else:
                is_full_col = False
            curr_char = s[0]
            if load_row < n and is_full_col:
                col_chars[col].append(curr_char)
                load_row = load_row + 1
                s = s[1: len(s)]
            if load_row < n and not is_full_col:
                if abs((n - 1) - col) == load_row:
                    col_chars[col].append(curr_char)
                    load_row = load_row + 1
                    s = s[1: len(s)]
                else:
                    col_chars[col].append(None)
                    load_row = load_row + 1
                    continue
            if load_row == numRows:
                col = col + 1
                load_row = 0
                col_chars.append([])

        return None
class NumberOfRectangles():

    def countGoodRectangles(self, rectangles):
        new_min = 234234234234234
        mins = []
        count = 0
        new_max = -1
        for r in rectangles:
            mins.append(min(r))
        new_max = max(mins)
        for n in mins:
            if n == new_max:
                count = count + 1
        return count

class FirstUniqueChar:

    '''

    Some solutions that I have thought of but don't want to do because they seem
    not efficient

    Solution 1:
    Brute force this. Do a double loop and for each character loop through the array to see
    if it exists again. If it doesnt, then return that index. If it does then iterate
    character and repeat.

    Solution 2:
    Use a hashmap to store characters as key and number of occurences as value.
    Loops through string and increment the value of its corresponding character.
    After loop put all map items into


    '''

    def firstUniqChar(self, s):
        chars = {}
        for i in range(len(s)):
            curr = s[i]
            if curr not in chars:
                chars[curr] = {"value": 1, "index": i}
            else:
                chars[curr]["value"] = chars[curr]["value"] + 1

        for k, v in  chars.items():
            if v["value"] == 1:
                return v["index"]

        return -1


class Ds:

    def list_operation(self):
        my_list = [1, 2, 3]
        print("*")

        # length
        print(len(my_list))
        print("*")

        my_list = ["one", "two", "three"]

        # slice
        print(my_list[1:3])

        another_list = ["four", "five", "six"]
        new_list = my_list + another_list

        # concat lists
        print(new_list)

        # append
        new_list.append("seven")
        print(new_list)

        #remove
        popped = new_list.pop()
        print(popped)
        print(new_list)
        print(new_list.pop(0))
        print(new_list)

        # sort
        n_list = [2, 3, 1, 6, 4]
        n_list.sort()
        print(n_list)

        # reverse
        n_list.reverse()
        print(n_list)

    def dict_operation(self):
        # basic
        d = {"one": 1, "two": 2, "three": 3}

        #get
        print(d["one"])

        #no exist
        if "z" not in d:
            print("z does not exist")

        # add
        d["four"] = 4
        print(d)

        # all keys
        keys = d.keys()
        print(keys)

        #all values
        print(d.values())

        #all items
        print(d.items())

    def loops_operation(self):
        my_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        print("** for each list")
        # for each list
        for num in my_list:
            print(num)

        print("** for each string")
        cat = "kitty"
        #for each string
        for c in cat:
            print(c)

        print("** for each dictionary")
        # for each dictionary
        d = {"one": 1, "two": 2, "three": 3}
        # tuple unpacking
        for k, v in d.items():
            print(k, v)

        print("** while loop")
        # while
        i = 0;
        keepGoing = True
        while keepGoing:
            i+=1
            if i <= 3:
                print(f'still going... {i}')
            else:
                break

    def files(self):
        f = open("/Users/danieltuttle/projects/practice/python/src/ds/ds.txt")
        # read contents from file as string
        contents = f.read()
        print(contents)
        f.seek(0)
        # read contents from file into list of lines
        lines = f.readlines()
        print(lines)








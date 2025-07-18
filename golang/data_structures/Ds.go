package data_structures

import (
	"fmt"
	"slices"
	"strconv"
)

func Arrays() {
	var y [2]string
	x := [2]string{}

	fmt.Println(y)
	fmt.Println(x)

	fmt.Println(len(x))

	x[0] = "a"
	x[1] = "b"

	//Does not compile, because it knows its index out of bounds
	//x[2] = "c"

	fmt.Println(x)

}

func SlicesBasics() {
	x := make([]string, 0)

	x = append(x, "a")
	x = append(x, "b")

	// How many elements are in the slice
	fmt.Println(len(x))

	// The capacity of the slice before a resize happens
	fmt.Println(cap(x))

	fmt.Println("How to manually delete....")
	fmt.Println(deleteIthFromSlice(x, 1))
	fmt.Println("But next time use a the slices package, see SlicesPackage()")

}

func SlicesPackage() {
	x := make([]string, 0)

	x = append(x, "a")
	x = append(x, "b")
	x = append(x, "c")

	// Delete
	slices.Delete(x, 1, 2)
	fmt.Println(x)

	// Contains
	fmt.Println(slices.Contains(x, "c"))

	//Replace
	fmt.Println(slices.Replace(x, 0, 1, "zzz"))
}

func HashMap() {
	x := make(map[string]string)

	x["a"] = "A"
	x["b"] = "B"

	// Get something from a hashmap if it's there
	val, ok := x["d"]
	if ok {
		println("😀")
		println(val)
	} else {
		println("💥")
		println(ok)
	}

	// Delete from map
	delete(x, "a")
	fmt.Println(x)
}

func StringConvert() {
	x := "1"
	y, err := strconv.Atoi(x)
	if err == nil {
		fmt.Println("😀")
		fmt.Println(y)
	} else {
		fmt.Println("💥")
		fmt.Println(err)
	}
}

func deleteIthFromSlice(slice []string, index int) []string {
	// Create a new slice with everything to the ith index + everything that is over +1 of the ith index.
	// The variadic operator can be performed here because the second argument in the append function is variadic
	return append(slice[:index], slice[index+1:]...)
}

type Greet struct {
	hi string
}

func (g *Greet) Set(item string) {
	g.hi = item
}

func StructTest() *Greet {
	x := Greet{hi: "hola"}
	return &x
}

func StructTest2() {
	x := Greet{hi: "hola"}
	print(x)
}

func print(x Greet) {
	x.Set("hej")
	fmt.Println(x)
}

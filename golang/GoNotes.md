# Go notes

#### data structures
- array:  Fixed length list of things
- slice: An array that can grow or shrink
- Both slice and array must have ad ata type: string, int etc.
- See the example `sliceExample()` for a demo with slices.
- `[]byte` is a string that is represented as a slice. The number in it correspond to Ascii characters. 
- Go is pass by value by default for many types. This is apparent when working with structs. Use pointers to reference an objects properties to update. However this does not work quite the same with slices.
- However like structs there are some types that are pass by reference. The data types where you pass by value, you have to worry about pointers, the reference types, no need to worry about pointers.
- Difference between maps and structs: All values must be the same time. We can iterate over a map. A map is a reference type a struct is a value type. 



##### Values types
- int
- float
- string
- bool
- structs

##### Reference types
- slices
- maps
- channels
- pointers
- functions



#### OO approach vs golang
- `type`: You can use the type keyword and declare it along with a primitive type to add functionality. It is very similar to extending something in java.
- `receiver` See the `print()` method in the deck.go file. This has a receiver `(d deck)` this references the type that we attach this method to. When we do this the type gets the print() method

#### slice syntax
- `deck[0:2]` is an example of how to do this. This returns the first 2 items of a slice. See the `getFirst()` functions for example

#### testing
- See the deck_test.go file. Testing in golang is very simple. Best practice is to do it like it is in this file. Notice, there are no external libaries or anything, the test itself is very simple go code.
- 
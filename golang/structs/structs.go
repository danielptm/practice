package structs

import "fmt"

type person struct {
	firstName string
	lastName  string
}

func (p person) print() {
	println(p.firstName, p.lastName)
}

// GO is pass my value so we have to create a pointer to the object
// for this function to work as expected.
// *person means that the type is a pointer to a person
func (p *person) updateName(newFirstname string) {
	// (*p) takes the pointer and gets the actual value
	(*p).firstName = newFirstname
}

func StructsMain() {
	p := person{
		firstName: "Daniel",
		lastName:  "Tuttle",
	}

	// explicitly get the pointer
	p_p := &p
	p_p.updateName("Scott")

	p.print()

	p2 := person{
		firstName: "Adam",
		lastName:  "Jones",
	}

	//Alternative to the above for updating, no need to get the pointer explictly
	p2.updateName("Sammy")
	p2.print()

	mySlice := []string{"Hi", "there"}
	updateSlice(mySlice)

	fmt.Print(mySlice)

}

func Maps() {
	colors := map[string]string{
		"red":   "#ff0000",
		"green": "#4234sj",
	}

	colors2 := make(map[string]string)
	colors2["blue"] = "asdf"
	colors2["white"] = "#fffffff"

	delete(colors2, "blue")

	fmt.Println(colors)
	fmt.Println(colors2)

	colors2["nocolor"] = "asdf"

	for color, hex := range colors2 {
		fmt.Println("**")
		fmt.Println(color, hex)
	}
}

func updateSlice(s []string) {
	s[0] = "Bye"
}

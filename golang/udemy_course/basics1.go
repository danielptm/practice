package udemy_course

import "fmt"

type Parent struct {
	First    string
	Last     string
	Relation string
}

type Person struct {
	First string
	Last  string
	Parent
}

func (p Person) Print() {
	println("***")
	fmt.Printf("%+v", p)
	println("***")

}

func (p Person) SetName(name string) {
	p.First = name
}

func (p *Person) SetParent(first string, last string, relation string) {
	p.Parent.First = first
	p.Parent.Last = last
	p.Parent.Relation = relation
}

func ex1() (string, string) {
	p := Person{First: "Billy", Last: "Tuttle"}
	p.Print()
	p.SetName("Daniel")
	p.SetParent("John", "Tuttle", "Dad")
	p.Print()
	p.SetParent("Dave", "Tuttle", "Dad")
	p.Print()

	return p.First, p.Last
}

type MyStruct struct {
	Text string
}

func (ms *MyStruct) Update(t string) {
	ms.Text = t
}

func ex2() MyStruct {
	ms := MyStruct{Text: "Hi"}
	ms.Update("Bye")
	return ms
}

func ex3(ms MyStruct) MyStruct {
	ms.Update("Bye")
	return ms
}

func getS() *string {
	s := "Cat"
	println("####")
	println(&s)
	return &s
}

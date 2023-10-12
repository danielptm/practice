package shapesex

import "fmt"

type Triangle struct {
	height float64
	base   float64
}

type Square struct {
	sideLength float64
}

func (s Square) getArea() float64 {
	return s.sideLength * s.sideLength
}

func (s Square) printArea() {
	fmt.Println(s.getArea())
}

func (t Triangle) getArea() float64 {
	return 0.5 * t.base * t.height
}

func (t Triangle) printArea() {
	fmt.Println(t.getArea())
}

type shape interface {
	printArea()
}

func Shapes() {
	items := []shape{Square{5}, Triangle{10, 10}}

	for _, v := range items {
		print("value: ")
		v.printArea()
	}
}

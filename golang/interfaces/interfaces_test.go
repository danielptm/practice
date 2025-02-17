package interfaces

import "testing"

func TestInterfaces(t *testing.T) {
	Interfaces()
}

func TestInterfaces2(t *testing.T) {
	d1 := Demo{}
	d2 := Demo2{}

	l := make([]TestInterface, 0)
	l = append(l, d1)
	l = append(l, &d2)

	for _, e := range l {
		e.SayHi()
	}

}

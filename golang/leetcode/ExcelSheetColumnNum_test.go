package leetcode

import "testing"

func TestTitleToNumber(t *testing.T) {
	res := titleToNumber("ZY")
	expected := 701

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber2(t *testing.T) {
	res := titleToNumber("AB")
	expected := 28

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber3(t *testing.T) {
	res := titleToNumber("BL")
	expected := 64

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber4(t *testing.T) {
	res := titleToNumber("DX")
	expected := 128

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber5(t *testing.T) {
	res := titleToNumber("ML")
	expected := 350

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber6(t *testing.T) {
	res := titleToNumber("ALL")
	expected := 1000

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber7(t *testing.T) {
	res := titleToNumber("ALLL")
	expected := 26012

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber8(t *testing.T) {
	res := titleToNumber("ATL")
	expected := 1208

	if res != expected {
		t.Error("res != expected")
	}
}

func TestTitleToNumber100(t *testing.T) {
	res := titleToNumber("FXSHRXW")
	expected := 2147483647

	if res != expected {
		t.Error("res != expected")
	}
}

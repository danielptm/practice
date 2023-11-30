package employee

import (
	"go_practice/hexagonal_architecture/models"
	"testing"
)

type ErMock struct {}

func (er ErMock) Create(employee models.Employee)(models.Employee, error) {
	
}

func (er ErMock) Read(id string)(models.Employee, error) {

}

func (er ErMock) Update(employee models.Employee) (models.Employee, error) {

}

func (er ErMock) Delete(employee models.Employee) (models.Employee, error) {

}


func TestEmployeeServiceCreate(t *testing.T) {
	er :=
}
package employee

import "go_practice/hexagonal_architecture/models"

type EmployeeCrudService struct{}

func (e EmployeeCrudService) Create(employee models.EmployeeCreate) error {
	print("hello from employee service")
	return nil
}

func (e EmployeeCrudService) Read(id string) error {
	return nil
}

func (e EmployeeCrudService) Update(employee models.EmployeeCreate) error {
	return nil
}

func (e EmployeeCrudService) Delete(id string) error {
	return nil
}

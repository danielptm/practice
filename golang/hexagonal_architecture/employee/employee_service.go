package employee

import "go_practice/hexagonal_architecture/models"

type EmployeeCrudService struct {
	EmployeeRepositoryInterface
}

func (e EmployeeCrudService) Create(employee_dto models.EmployeeDto) (*models.Employee, error) {
	employee := models.TransformEmployeeDtoToEmployee(employee_dto)
	e_persisted, err := e.EmployeeRepositoryInterface.Create(employee)
	if err != nil {
		return nil, err
	}
	return &e_persisted, nil
}

func (e EmployeeCrudService) Read(id string) error {
	return nil
}

func (e EmployeeCrudService) Update(employee models.Employee) error {
	return nil
}

func (e EmployeeCrudService) Delete(id string) error {
	return nil
}

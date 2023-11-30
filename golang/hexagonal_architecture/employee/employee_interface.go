package employee

import "go_practice/hexagonal_architecture/models"

type EmployeeServiceCrudInterface interface {
	Create(employee models.Employee) error
	Read(id string) error
	Update(employee models.Employee)
	Delete(id string) error
}

type EmployeeRepositoryInterface interface {
	Create(employee models.Employee) (models.Employee, error)
	Read(id string) (models.Employee, error)
	Update(employee models.Employee) (models.Employee, error)
	Delete(id string) (string, error)
}

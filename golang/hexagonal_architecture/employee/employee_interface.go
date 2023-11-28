package employee

import "go_practice/hexagonal_architecture/models"

type EmployeeServiceCrudInterface interface {
	Create(employee models.EmployeeCreate) error
	Read(id string) error
	Update(employee models.EmployeeCreate)
	Delete(id string) error
}

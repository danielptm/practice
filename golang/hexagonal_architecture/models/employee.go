package models

type EmployeeDto struct {
	FirstName string `json:firstName`
	LastName  string `json:lastName`
}

type Employee struct {
	FirstName string
	LastName  string
	Id        string
}

func TransformEmployeeDtoToEmployee(employee_dto EmployeeDto) Employee {
	return Employee{}
}

package models

type EmployeeCreate struct {
	FirstName string `json:firstName`
	LastName  string `json:lastName`
}

package hexagonal_architecture

import (
	"github.com/gorilla/mux"
	"go_practice/hexagonal_architecture/company"
	"go_practice/hexagonal_architecture/employee"
	"net/http"
)

func start() {
	router := mux.NewRouter()
	employee.StartEmployeeRoutes(router)
	company.StartCompanyRoutes(router)
	err := http.ListenAndServe("localhost:8000", router)
	if err != nil {
		return
	}
}

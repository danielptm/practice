package employee

import (
	"encoding/json"
	"github.com/gorilla/mux"
	"net/http"
)

func StartEmployeeRoutes(router *mux.Router) {
	router.HandleFunc("/employee", sayHi).Methods(http.MethodGet)
}

func sayHi(writer http.ResponseWriter, r *http.Request) {
	err := json.NewEncoder(writer).Encode("hello employee resource...")
	if err != nil {
		print("error")
		return
	}
}

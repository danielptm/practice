package company

import (
	"encoding/json"
	"github.com/gorilla/mux"
	"net/http"
)

func StartCompanyRoutes(router *mux.Router) {
	router.HandleFunc("/company", sayHi).Methods(http.MethodGet)
}

func sayHi(writer http.ResponseWriter, r *http.Request) {
	err := json.NewEncoder(writer).Encode("hello company resource...")
	if err != nil {
		print("error")
		return
	}
}

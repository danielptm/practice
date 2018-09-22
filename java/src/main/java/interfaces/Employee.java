package interfaces;

public interface Employee {

    public String getEmployeeName();

    default String getEmployeeCompany(){
        return "TARGET";
    }


}

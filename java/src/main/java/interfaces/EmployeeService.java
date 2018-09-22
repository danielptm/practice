package interfaces;

public class EmployeeService implements Employee{
    public EmployeeService(){ }

    @Override
    public String getEmployeeName() {
        return "JOHN";
    }

    @Override
    public String getEmployeeCompany(){
        return "NIKE";
    }
}

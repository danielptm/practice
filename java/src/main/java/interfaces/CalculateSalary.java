package interfaces;

@FunctionalInterface
public interface CalculateSalary {
    int calculate(int x);

    default String createNickName(String name){
        return "Amazing " + name;
    }
}

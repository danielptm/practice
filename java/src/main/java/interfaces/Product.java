package interfaces;

public interface Product {

    public String getProduct();

    default String getProductCompany(){
        return "TARGET";
    }
}

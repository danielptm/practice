package practice;

import interfaces.*;
import org.junit.Test;

public class InterfacePractice {

    /**
     * Create an interface reference for a class that implements that interface and call the method.
     *
     * Why is this cool/important? The main advantage of doing it like this, instead of creating
     * an object of EmployeeService is that it makes the system more flexible and loose coupled.
     * You can easily change out the EmployeeService for another class that implements Employee
     * and expect the program to work. While in this trivial example there is no real advantage, one
     * possible real life situation where this could be very nice to use is with regards to database repositories.
     * For example if you have a class that implements an interface designed to do CRUD operations on
     * an employee in a mysql database and then sombody wants to do a data migration from the mysql database to
     * a mongodb then you could create a new mongodb repo that implements employee and simply change out a few lines
     * of code to operate on the mongodb instead of the mysql.
     */
    @Test
    public void employee(){
        Employee employeeService = new EmployeeService();
        System.out.println(employeeService.getEmployeeName());
    }

    /**
     * Define a default method of an interface and have it called.
     */
    @Test
    public void testOverridingDefaultMethod(){
        Employee employeeService = new EmployeeService();
        System.out.println(employeeService.getEmployeeCompany());
    }

    @Test
    public void testDefaultDefaultMethod(){
        Product productService = new ProductService();
        System.out.println(productService.getProductCompany());
    }

    /**
     * Create and use a functional interface.
     *
     * Why is this cool/important? Functional interfaces allow the developer to redefine a function
     * that adheres to a function contract in different places in the code. This could create more flexibility
     * and possibly reduce boiler plate code.
     */
    @Test
    public void functionalInterface(){
        CalculateSalary cs = (int x) -> x * 2;
        System.out.println(cs.calculate(4));
        System.out.println(cs.createNickName("Joseph"));

        CalculateSalary cs2 = (int x) -> x * 4;
        System.out.println(cs2.calculate(4));
    }
}

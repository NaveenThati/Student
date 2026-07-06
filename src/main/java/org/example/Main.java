package org.example;

public class Main {
    public static void main(String [] agrs){
        Employee emp = new Employee();
        EmployeeDetails details = new EmployeeDetails();
        EmployeAddress empadd = new EmployeAddress();
        details.changedetails(emp);
        empadd.addressofemp(emp);
        System.out.println(emp.name = "sai");
        System.out.println(emp.age = 21);
        System.out.println(emp.id = 56237);
        System.out.println(emp.address = 58.43);
        System.out.println(emp.street = "ragavastreet");
        System.out.println(emp.doornum = 44f);
    }
}

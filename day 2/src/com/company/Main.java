package com.company;

public class Main {

    public static void main(String[] args) {

        employee e1= new employee();
        employee e2= new employee();

        e1.ename= "Rohan";
        e1.eage= 19;
        e1.ecity= "Surat";

        e2.ename= "Rahul";
        e2.eage= 18;
        e2.ecity= "Delhi";

        e1.displayDetails();
        System.out.println("-----------------------------------");
        e2.displayDetails();
    }
}

package com.company;
import java.util.Scanner;
public class tax {
    Scanner sc= new Scanner(System.in);
    String empname, tax_perc;
    int d_date, d_month, d_year, age;
    int salary, annual_salary;
    float tax_amt;
    int c_month=11, c_date=01, c_year=2020;


    public void getDetails(){
        System.out.println("Enter Name:");
        empname=sc.nextLine();
        System.out.println("Enter Birth Date: ");
        d_date= sc.nextInt();
        System.out.println("Enter Month Of Birth: ");
        d_month= sc.nextInt();
        System.out.println("Enter Year Of Birth: ");
        d_year= sc.nextInt();
        System.out.println("Enter Monthly Salary: ");
        salary= sc.nextInt();
    }


    public void showDetails(){
        annual_salary= salary*12;
        if (annual_salary>=500000){
            tax_perc="20%";
            tax_amt= (float) (annual_salary*0.2);
        }
        else if (annual_salary>=400000 && annual_salary<500000){
            tax_perc="15%";
            tax_amt= (float) (annual_salary*0.15);
        }
        else if (annual_salary>=300000 && annual_salary<400000){
            tax_perc="10%";
            tax_amt= (float) (0.1*annual_salary);
        }
        else if (annual_salary>=200000 && annual_salary<300000){
            tax_perc="5%";
            tax_amt= (float) (0.05 * annual_salary);
        }
        else{
            tax_perc="0%";
            tax_amt=annual_salary*0;
        }
//age calculate

        if(d_month<c_month){
            age=c_year-d_year;
        }
        else{
            if (c_date<d_date || c_month<d_month){
                age=c_year-d_year-1;
            }
            else {
                age=c_year-d_year;
            }
        }
        System.out.println("Employee Name is: "+ empname);
        System.out.println("Employee Age: "+age);
        System.out.println("Annual Salary= "+annual_salary);
        System.out.println("Tax percentage="+ tax_perc);
        System.out.println("Tax Amount= "+tax_amt);

    }

}

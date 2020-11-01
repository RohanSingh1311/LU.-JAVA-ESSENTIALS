package com.company;
import java.util.Scanner;
public class avengers {
    Scanner sc= new Scanner(System.in);
    String aname;
    int age;
    String apower;
    String aweapon;
    String aplanet;

    public void getAvenger(){
        System.out.println("Enter Name: ");
        aname=sc.nextLine();
        System.out.println(" Enter Age: ");
        age =sc.nextInt();
        sc.nextLine();
        System.out.println(" Enter Power: ");
        apower=sc.nextLine();

        System.out.println(" Enter Weapon: ");
        aweapon=sc.nextLine();
        System.out.println(" Enter Planet:");
        aplanet=sc.nextLine();
    }
    public void displayAvenger(){
        System.out.println("Name is: "+aname+"; Avengers age is: "+age+"; Power is: "+apower+"; Weapon is: "+aweapon+"; Lives on: "+aplanet);
    }


}

package com.company;
import java.util.Scanner;
public class grade {

    Scanner sc=new Scanner(System.in);
    int maths;
    int english;
    int sst;
    int science;
    int computer;


    public void getDetails(){
        System.out.println("Enter Marks of Mathematics: ");
        maths=sc.nextInt();

        System.out.println("Enter Marks of English: ");
        english=sc.nextInt();

        System.out.println("Enter Marks of SST: ");
        sst=sc.nextInt();

        System.out.println("Enter Marks of Science: ");
        science=sc.nextInt();

        System.out.println("Enter Marks of Computer: ");
        computer=sc.nextInt();
    }

    public void grade(){
        float percentagee;
        int total_marks= maths+english+sst+science+computer;
        double fract;
        percentagee= (float) (total_marks*0.2);

        String grade;

        if (percentagee<=100 && percentagee>=90){
            grade="A1";
        }
        else if (percentagee>=80 && percentagee<90){
            grade="A2";
        }
        else if (percentagee>=70 && percentagee<80){
            grade="B1";
        }
        else if (percentagee>=60 && percentagee<70){
            grade="B2";
        }
        else if (percentagee>=50 && percentagee<60){
            grade="C1";
        }
        else if (percentagee>=40 && percentagee<50){
            grade="C2";
        }
        else if (percentagee>=35 && percentagee<40){
            grade="D";
        }
        else if(percentagee>=0 && percentagee<35){
            grade="you nee to study hard you have failed";
        }
        else{
            grade="please enter marks b/w 0 to 100 only";
        }
        System.out.println("your total marks= "+total_marks);

        System.out.println("Your percentage= "+ percentagee);
        System.out.println("Grade: "+grade);
    }

}

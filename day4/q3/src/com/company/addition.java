package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class addition {

    public void printt() {
        Scanner sc = new Scanner(System.in);
        int num;


        System.out.println("Enter 5 to run: ");
        int a = sc.nextInt(), input[] = new int[5], sum = 0, i;
        for (i = 0; i < 5; ++i) {
            Scanner s = new Scanner(System.in);
            System.out.println("Add data no: ");
            input[i] = s.nextInt();
        }
        for (i = 0; i < a; ++i) sum += input[i];
        System.out.println("sum of numbers: " + sum);
        System.out.println("display Array: " + Arrays.toString(input));
    }


}

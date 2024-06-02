package org.Day1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String [] args){
        var sc = new Scanner(System.in);

        System.out.println("Enter fullMark and Mark");
        double fullMark = sc.nextDouble();
        double mark = sc.nextDouble();

        double pct = MyMethods.pctCalc(fullMark, mark);
        String status = MyMethods.getStatus(pct);
        System.out.println("Your Status:" + status);
    }
}
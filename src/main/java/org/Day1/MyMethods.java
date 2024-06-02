package org.Day1;

public class MyMethods {

    public static double pctCalc (double fullMark , double mark) {
     return (  fullMark / mark ) * 100;
    }


    public  static String getStatus(double pct) {
        if (pct > 85) return "Exellent";
        else if (pct > 75) return "V.Good";
        else if (pct > 65) return "Good";
        else  if (pct >= 50) return "Pass";
        else return "Fail";
    }
}

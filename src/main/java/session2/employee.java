package session2;

import java.time.Year;

public class employee {

    String name;
    double salary;
    int hireYear;



    public employee (String n, double s , int h){
        name = n;
        salary = s;
        hireYear = h;
    }

    public double calculateSalary(){
        return (salary * 12 );


    }

    public double calculateYear(){

        int currentYear= Year.now().getValue();
        return currentYear-hireYear;
    }
}

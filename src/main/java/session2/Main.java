package session2;

public class Main {

    public static void main(String [] args){
       employee x = new employee("sara" , 234000 , 2020);
        System.out.println(x.name);
        System.out.println(x.calculateSalary());
        System.out.println(x.calculateYear());

    }
}

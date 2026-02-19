package Lab1;


import Lab1.MyLibrary;
public class MyApp {

    public static void main(String[] args) {

        int num1 = 2;
        int exp = 4;

        System.out.println("HELLOOOOOO");


        System.out.println(" Factorial of " + num1 + ": " + MyLibrary.factorial(num1));
        System.out.println(" " + num1 + " power of " + exp + " will be " + MyLibrary.Power(num1, exp));
        System.out.println("DONE!");
    }

}

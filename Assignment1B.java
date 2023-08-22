/*
Class: CSE 1321L
Section: J03
Term: Fall 2023
Instructor: Mourya
Name: Garrett Cook
Lab#: 202*/
import java.util.Scanner;

public class Assignment1B {
    public static void main(String[] args) {
        //Alot of variables for our decomal dollar amounts. "Probably could've shorted them somehow."
        float total, taxr,tax, charge, subtotal,tipa,tipb;
        //These Data Type doubles used. Depending on the user could turn out to be whole numbers.
        double totala, totalb;

        System.out.print(" Meal Price Total:");
        Scanner sc = new Scanner(System.in);
        total = sc.nextFloat();

        System.out.print("Enter Local Tax Rate:");
        taxr = sc.nextFloat();

        System.out.print("Enter Service Charge:");
        charge = sc.nextFloat();

        //Made formula for subtotal, 10 and 25 % tips. as floats.
        subtotal = total + charge;
        //Formula for Tax. *0.10f + *0.25f. floats for percentages.
        tax = total * taxr;
        tipa = (subtotal *0.10f);
        tipb = (subtotal *0.25f);
        totala = (tipa+subtotal+tax);
        totalb = (tipb+subtotal+tax);
        System.out.printf("The Subtotal is : $"+"%.2f",subtotal);
        System.out.println();

        System.out.print("A 10% tip would be $");
        System.out.printf("%.2f",tipa);
        System.out.println();

        System.out.printf("The total would be $" + "%.2f",totala);
        System.out.println();

        System.out.print("A 25% tip would be $");
        System.out.printf("%.2f",tipb);
        System.out.println();


        System.out.printf("The total would be $" + "%.2f",totalb);


    }
}
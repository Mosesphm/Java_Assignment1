package Xup;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Energy energy = new Energy();
        System.out.println("1. period");
        System.out.println("2. potential energy");
        System.out.println("3. force");
        System.out.println("4. work");
        System.out.println("5. Height");
        System.out.print("Enter formula to use:");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        switch(input){
            case "1":
                System.out.print("Enter length:");
                int length = sc.nextInt();
                System.out.println("Period = " + energy.Period(length));

            case "2":
                System.out.print("Enter mass:");
                int mass = sc.nextInt();
                System.out.print("Enter height:");
                int height = sc.nextInt();
                System.out.println("Potential Energy = " + energy.potentialEnergy(mass,height));
            case "3":
                System.out.print("Enter mass:");
                int mas = sc.nextInt();
                System.out.println("Force = " + energy.Force(mas));
            case "4":
                System.out.print("Enter Force:");
                int Force = sc.nextInt();
                System.out.print("Enter Displacement:");
                int Displacement = sc.nextInt();
                System.out.println("Work = " + energy.Work(Force,Displacement));
            case "5":
                System.out.print("Enter time:");
                int time = sc.nextInt();
                System.out.println("height = " + energy.Height(time));
        }

    }
}




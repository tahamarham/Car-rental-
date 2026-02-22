import java.util.Scanner;

import Car.Car;
import Car.GearboxType;
import Forms.Form;

public class CarCare {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("Hello, and welcome to Car care Application");
        System.out.println(
                "To test the implementaion of our application we will be creating two objects of any two cLasses");
        System.out.println("---------------------------------------------------");
        System.out.println("So first of all let's make a Form");
        System.out.println("---------------------------------------------------");


        System.out.println("Please enter the duration for which you will be using this car");
        int duraiton = sc.nextInt();
        sc.nextLine(); // for the scanner glitch
        System.out.println("Now please enter why you will be using a car");
        String use = sc.nextLine();
        Form f = new Form(duraiton, use);

        System.out.println("---------------------------------------------------");

        System.out.println("Now let's make a car");
        System.out.println("Enter the model of your car");
        String model = sc.nextLine();

        System.out.println("Enter the make of your car");
        String make = sc.nextLine();

        System.out.println("Enter the number of doors in your car");
        int number_of_doors = sc.nextInt();
        sc.nextLine(); // for the scanner glitch
        System.out.println("Enter the type of your car");
        String type = sc.nextLine();
        System.out.println("Enter the year of your car");
        int year = sc.nextInt();
        sc.nextLine(); // for the scanner glitch

        System.out.println("Following is a list of gearboxes");
        for (GearboxType g : GearboxType.values())
            System.out.println(g + ", ");
        System.out.println();
        System.out.print("Your pick in numbers: ");
        int no = sc.nextInt();
        sc.nextLine(); // for the scanner glitch
        GearboxType gearbox_type = (GearboxType.values()[no - 1]);

        Car car = new Car(model, make, gearbox_type, number_of_doors, type, year);
        System.out.println("---------------------------------------------------");

        System.out.println("Your created the following form\n " + f);
        System.out.println("You created the following car\n " + car);
        System.out.println("---------------------------------------------------");

        System.out.println("Thank you and take care");
        sc.close();
    }
}

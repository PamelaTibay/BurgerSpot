package tibaysGroup;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            Person person = getValidPersonInput(scanner);

            System.out.println("\n************************************");
            System.out.println("*     Welcome to Burger Spot   *");
            System.out.println("************************************\n");

            System.out.print("Do you want to order a burger? (yes/no): ");
            String orderBurger = scanner.nextLine();

            if (orderBurger.equalsIgnoreCase("yes")) {
                Burger burger = getValidBurgerInput(scanner, person);

                System.out.println("\n******** Your Information ******");
                System.out.println(person.getInformation());

                System.out.println("\n******** Your Burger Info ******");
                System.out.println(burger.getInformation());
            } else {
                System.out.println("\n******** Your Information ******");
                System.out.println(person.getInformation());
            }

            // Additional prompt
            System.out.print("\nDo you want to order another burger or exit the program? (order/exit): ");
        } while (scanner.nextLine().equalsIgnoreCase("order"));

        System.out.println("\n*******************************");
        System.out.println("       Exiting program. Thank you!");
        System.out.println("*****************************");
    }

    private static Person getValidPersonInput(Scanner scanner) {
        boolean validInput = false;
        Person person = null;

        do {
            try {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();

                System.out.print("Enter your gender: ");
                String gender = scanner.nextLine();

                System.out.print("Enter your age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter your program: ");
                String program = scanner.nextLine();

                person = new Customer(name, age, gender, program);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format. Please enter a number.");
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please try again.");
            }
        } while (!validInput);

        return person;
    }

    private static Burger getValidBurgerInput(Scanner scanner, Person person) {
        boolean validInput = false;
        Burger burger = null;

        do {
            try {
                System.out.print("Enter the name of the burger: ");
                String burgerName = scanner.nextLine();

                System.out.print("Enter the size of the burger: ");
                String size = scanner.nextLine();

                System.out.print("Enter the type of the burger: ");
                String type = scanner.nextLine();

                burger = new Burger(person.getName(), person.getAge(), person.getGender(), burgerName, size, type);
                validInput = true;
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println("Invalid input. Please try again.");
            }
        } while (!validInput);

        return burger;
    }
}

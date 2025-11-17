package com.pluralsight.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner = new Scanner(System.in);

    public int homeScreen() {
        System.out.println("=================================================");
        System.out.println("            Welcome to Deli-Shop                 ");
        System.out.println("=================================================");
        System.out.println("1) Start a new choice");
        System.out.println("2) Exit Application");
        System.out.println("Please Enter your choice: ");

        String input = scanner.nextLine();

        switch (input) {
            case "1":
                return 1;
            case "2":
                return 2;
            default:
                System.out.println("Invalid Option");
                return -1;
        }
    }

    private int orderMenu() {
            System.out.println("\n---Order Menu---");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println("Please enter your Choice: ");

            String orderMenuChoice = scanner.nextLine();

            switch (orderMenuChoice) {
                case "1":
                    return 1;
                case "2":
                    return 2;
                case "3":
                    return 3;
                case "4":
                    return 4;
                case "0":
                    return 0;
                default:
                    System.out.println("Invalid Option");
                    return -1;

            }
        }


        public String breadType() {
            System.out.println("\nPlease choose bread type:");
            System.out.println("white, wheat, rye, wrap");
            System.out.println("Enter bread type: ");
            return scanner.nextLine().toLowerCase();
        }

        public String size() {
            System.out.println("Please choose a size:");
            System.out.println("4, 8, 12");
            return scanner.nextLine();
        }
        public boolean toasted() {
            System.out.println("Toasted? (yes or no):");

            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "yes":
                    return true;
                case "no":
                default:
                    return false;
            }
        }


        public List<String> meatList() {
        List<String> meats = new ArrayList<>();

            System.out.println("\nAdd meats (Type 'done' to finish): ");
            System.out.println("steak, ham, salami, roast beef, chicken, bacon");

            while (true) {
                System.out.println("Enter meat: ");
                String choice = scanner.nextLine().toLowerCase().trim();

                switch (choice) {
                    case "done":
                        return meats;

                    default:
                        meats.add(choice);
                        break;
                }
            }
        }

        public boolean extraMeat() {
            System.out.println("Would you like extra meat on your sandwich? (yes/no): ");

            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "yes":
                    return true;
                case "no":
                default:
                    return false;

            }
        }

        public List<String> cheese() {
        List<String> cheeses = new ArrayList<>();

            System.out.println("\nAdd cheese (type 'done' when finished):");
            System.out.println("american, provolone, cheddar, swiss");

            while (true) {
                System.out.println("Enter cheese: ");
                String choice = scanner.nextLine().toLowerCase();

                switch (choice) {
                    case "done":
                        return cheeses;
                    default:
                        cheeses.add(choice);
                        break;
                }
            }
        }
        public boolean extraCheese() {
            System.out.println("Did you want Extra cheese? (yes/no): ");

            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "yes":
                    return true;
                case "no":
                default:
                    return false;
            }
        }

        public List<String> regularToppings() {
        List<String> toppings = new ArrayList<>();

            System.out.println("\nAdd regular toppings (type 'done' when finished):");
            System.out.println("lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, muchrooms");

            while (true) {
                System.out.println("Enter topping: ");
                String choice = scanner.nextLine().toLowerCase().trim();

                switch (choice) {
                    case "done":
                        return toppings;
                    default:
                        toppings.add(choice);
                        break;
                }
            }
        }

        public List<String> sauce() {
        List<String> sauces = new ArrayList<>();

            System.out.println("\nAdd sauces (type 'done' when finished):");
            System.out.println("mayo, mustard, ketchup, ranch, thousand islands, vinaigrette, au jus");

            while (true) {
                System.out.println("Enter sauce: ");
                String choice = scanner.nextLine().toLowerCase();

                switch (choice) {
                    case "done":
                        return sauces;
                    default:
                        sauces.add(choice);
                        break;
                }
            }
        }

    public boolean extraSauce() {
        System.out.println("Did you want Extra cheese? (yes/no): ");

        String choice = scanner.nextLine().toLowerCase();

        switch (choice) {
            case "yes":
                return true;
            case "no":
            default:
                return false;
        }
    }

        //Drink
    public String drinkSize() {
        System.out.println("\nDrink sizes: small, medium, large, Xlarge");
        System.out.println("Please enter drink size: ");
        return scanner.nextLine().toLowerCase();
    }
    public String drinkFlavor() {
        System.out.println("We are a pepsi only company");
        System.out.println("Enter pepsi product: ");
        return scanner.nextLine().toLowerCase();
    }

    //Chips

    public String chipsType() {
        System.out.println("\nAvailable chips: cheetos, doritos, lays original, cool ranch doritos");
        System.out.println("\nEnter chips type: ");
        return scanner.nextLine().toLowerCase();
    }
}

package com.bridgelabz;

import java.util.*;

public class AddressBook {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);


        List<info> book = new ArrayList<>();

        int exitCode = 0;
        while (exitCode != 5) {
            System.out.println("Select the action ");
            System.out.println("1. Add contact.\n2. Edit contact. \n3. display contact. \n4. Delete contact. \n5. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    book.add(getAllDetails());
                    break;
                case 2:
                    editDetails(book);
                    break;
                case 3:
                    displayAllDetails(book);
                    break;
                case 4:
                    deletContact(book);
                    break;
                default:
                    exitCode = 5;
                    break;
            }
        }

    }

    public static info getAllDetails() {
        info details = new info();
        System.out.println("Enter First name: ");
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        System.out.println("Enter Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter Address: ");
        String add = scanner.nextLine();
        System.out.println("Enter City: ");
        String city = scanner.nextLine();
        System.out.println("Enter Status: ");
        String state = scanner.nextLine();
        System.out.println("Enter PineCode: ");
        String pineCode = scanner.nextLine();
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter Email ID: ");
        String emailID = scanner.nextLine();

        details.setAllDetails(firstName, lastName, add, city, state, pineCode, phoneNumber, emailID);
        return details;
    }

    public static void editDetails(List<info> book) {
        System.out.println("Please enter number you want to edit: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice > book.size()) {
            System.out.println("Invalid choice");
        } else {
            System.out.println("Please enter field you want to edit: 1.firstName\n2. lastName\n3. add\n4.city\n5. state\n6. pineCode\n7. phoneNumber\n8. emailID");
            int field = scanner.nextInt();
            System.out.println("Enter Value: ");
            String value = scanner.nextLine();
            switch (field) {
                case 1:
                    value = scanner.nextLine();
                    book.get(choice - 1).setFirstName(value);
                    break;
                case 2:
                    value = scanner.nextLine();
                    book.get(choice - 1).setLastName(value);
                    break;
                case 3:
                    value = scanner.nextLine();
                    book.get(choice - 1).setAdd(value);
                    break;
                case 4:
                    value = scanner.nextLine();
                    book.get(choice - 1).setCity(value);
                    break;
                case 5:
                    value = scanner.nextLine();
                    book.get(choice - 1).setState(value);
                    break;
                case 6:
                    value = scanner.nextLine();
                    book.get(choice - 1).setPineCode(value);
                    break;
                case 7:
                    value = scanner.nextLine();
                    book.get(choice - 1).setPhoneNumber(value);
                    break;
                default:
                    value = scanner.nextLine();
                    book.get(choice - 1).setEmailID(value);
                    break;
            }
        }
    }

    public static void displayAllDetails(List<info> book) {
        System.out.println("Sr.No\tFirstName\tLastName\tAddress\tCityState\tPinCode\tPhoneNumber\tEmailID");
        for (int i = 0; i < book.size(); i++) {
            System.out.print(i + 1);
            System.out.print("\t" + book.get(i).getFirstName());
            System.out.print("\t" + book.get(i).getLastName());
            System.out.print("\t" + book.get(i).getAdd());
            System.out.print("\t" + book.get(i).getCity());
            System.out.print("\t" + book.get(i).getState());
            System.out.print("\t" + book.get(i).getPineCode());
            System.out.print("\t" + book.get(i).getPhoneNumber());
            System.out.println("\t" + book.get(i).getEmailID());
        }
    }

    public static void deletContact(List<info> book) {
        displayAllDetails(book);
        System.out.println("Enter the number you want to remove: ");
        Scanner scanner = new Scanner(System.in);
        int delete = scanner.nextInt();
        book.remove(delete - 1);
    }
}
//package com.bridgelabz;
//
//import java.util.Scanner;
//
///* user info
// */
//public class userInfo {
//    private String firstName;
//    private String lastName;
//    private String add;
//    private String city;
//    private String state;
//    private String pineCode;
//    private String phoneNumber;
//    private String emailID;
//
//    public void addPerson(userInfo user1) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter first name ");
//        user1.firstName = scanner.next();
//        System.out.print("Enter Last name ");
//        user1.lastName = scanner.next();
//        System.out.print("Enter address: ");
//        user1.add = scanner.next();
//        System.out.print("Enter city, state: ");
//        user1.city = scanner.next();
//        user1.state = scanner.next();
//        System.out.print("Enter PIN code: ");
//        user1.pineCode = scanner.next();
//        System.out.print("Enter phone number: ");
//        user1.phoneNumber = scanner.next();
//        System.out.print("Enter email ID: ");
//        user1.emailID = scanner.next();
//
//        printUserInfo(user1);
//    }
//
//    public void printUserInfo(userInfo user1) {
//        System.out.println("User First Name: " + user1.firstName);
//        System.out.println("User Last Name : " + user1.lastName);
//        System.out.println("User address : " + user1.add);
//        System.out.println("User City : " + user1.city);
//        System.out.println("User State : " + user1.state);
//        System.out.println("User Pin code : " + user1.pineCode);
//        System.out.println("User Phone number : " + user1.phoneNumber);
//        System.out.println("User Email ID : " + user1.emailID);
//    }
//
//}

package com.example.email_app;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPassWordLength = 8;
    private String email;
    private String companySuffix = "bytes.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

//        System.out.println("Email: " + firstName + lastName);

        //Call a method asking for the department
        this.department = setDepartment();
//        System.out.println("Department is:"+ department);

        //Call a method that returns a random password
        this.password = generateRandomPass(defaultPassWordLength);
//        System.out.println("Password is:" + password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//        System.out.println("Your email is:" + email);
    }

    //Ask for the department
    private String setDepartment(){
        System.out.println("Dep Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Dept Code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice == 1) {
            return "sales";
        }
            else if (depChoice == 2) {
            return "dev";
        }
        else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

    //Generate a random password
    private String generateRandomPass(int length){


        String passWordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        char[] password = new char[length];

        for (int i =0; i<length; i++ ){
           int rand = (int)(Math.random() * passWordSet.length());

           password[i] = passWordSet.charAt(rand);
        }
        return new String (password);

    }

    @Override
    public String toString() {
        return "Email{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }



}

package com.company;

import sun.invoke.empty.Empty;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {

        List<String> users = new ArrayList<String>();
//        //List<Integer> passwords = new ArrayList<Integer>();
        Scanner sc1 = new Scanner((System.in));
        Scanner sc2 = new Scanner((System.in));
//        //Scanner sc3 = new Scanner((System.in));
//       // People username = new People();

        int number;
        System.out.println("Choose action:");
        System.out.println("1. Add new user to list:");
        System.out.println("2. Remove person from list:");
        System.out.println("3. Show all users in list:");
        System.out.println("0. Stop the program:");

        do {
            number = sc1.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Add new user to list:");
                    try {
//                        People username = new People();
//                        username.setLogin();
                        System.out.print("Pls, enter user name: ");
                        String user = "";
                        user = sc2.nextLine();
                        users.add(user);
                        System.out.println("User " + user + " has been added to list:");
                        System.out.println("Next action:");

                    } catch (Exception e) {
                        System.out.println("User name is not valid:");
                    }
                    break;



                case 2:
                    System.out.print("Remove user from list by name: ");
                    try {
                        // People user = new People();
                        //user.setLogin();

                        String user = "";
                        user = sc2.nextLine();
                        users.remove(user);
                        System.out.println("User " + user + " has been removed from list:");
                        System.out.println("Next action:");

                    } catch (Exception e) {
                        System.out.println("User mane is not valid:");
                    }
                    break;
                case 3:
                    System.out.println("Show full list of users:");
                    if (users.isEmpty()){
                        System.out.println("Collection is empty:");

                    }else
                        System.out.println("---------------");

                    for (String user : users) {

                        System.out.println(user);
                        System.out.println("---------------");

                    }


                    System.out.println("Next action:");
                    break;
                case 0:
                    System.out.println("Stop the program:");
                    sc1.close();
                    sc2.close();
            }
        } while (number != 0);
    }
}
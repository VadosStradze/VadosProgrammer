package com.company;

import java.util.List;
import java.util.Scanner;

public class Console {

    public void showConsole() {
        System.out.println("Choose action:");
        System.out.println("1. Add new user to list:");
        System.out.println("2. Remove person from list:");
        System.out.println("3. Show all users in list:");
        System.out.println("0. Stop the program:");
    }

    public List<People> add_object(List<People> population){
        Scanner scanner = new Scanner((System.in));
        try {
            People people = new People();
            String login;
            String password;
            System.out.print("Pls, enter user name: ");
            login = scanner.nextLine();
            people.setLogin(login);
            for (People nowPeople:
                    population) {
                if(nowPeople.getLogin().equals(login))
                    throw new Exception();
            }

            System.out.print("Pls, enter password: ");
            password = scanner.nextLine();
            people.setPassword(password);
            population.add(people);
            System.out.println("Login and password for " + people + " had been added to list:");
            System.out.println("Next action:");

        } catch (Exception e) {
            System.out.println("User name is not valid:");

        }
        return population;
    }

    public List<People> remove_object(List<People> population){
        Scanner scanner = new Scanner(System.in);
        try {
            String login;
            System.out.println("Remove object by name");

            login = scanner.nextLine();
            if(population.removeIf(people -> people.getLogin().equals(login))){
                System.out.println("Object " + login + " was deleted");
            }
            else
                throw new Exception();


        } catch (Exception e) {
            System.out.println("Object name is not valid:");
            System.out.println("Next action:");
        }
        return population;
    }
}
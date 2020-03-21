package com.company;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import sun.invoke.empty.Empty;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        Console menu = new Console();
        List<People> population = new ArrayList<People>();
        Scanner scanner = new Scanner((System.in));
        int number;
        menu.showConsole();
        do {
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Add new user to list:");
                    population = menu.add_object(population);
                    break;
                case 2:
                    System.out.print("Remove object from list by name: ");
                    population = menu.remove_object(population);
                    break;
                case 3:
                    System.out.println("Show full list of users:");
                    if (population.isEmpty()){
                        System.out.println("Collection is empty:");

                    }else
                        System.out.println("---------------");

                    for (People people : population) {

                        System.out.println(people);
                        System.out.println("---------------");

                    }

                    System.out.println("Next action:");
                    break;
                case 4:
                    System.out.println("Choose alterable object:");
                    population = menu.change_object(population);
                    break;
                case 5:
                    System.out.println("Enter the name of the user you are looking for");
                    population = menu.find_object(population);
                    break;

                case 0:
                    System.out.println("Stop the program:");
                    scanner.close();

            }
        } while (number != 0);
    }
}
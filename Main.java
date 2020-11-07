package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static PriorityQueue priorityQueue = new PriorityQueue();
    static Queue firstQueue = new Queue();
    static Queue secondQueue = new Queue();
    static Queue thirdQueue = new Queue();


    public static void main(String[] args) throws IOException {
        readFile();
        workMethod();
    }

    public static void workMethod() {
        int traffic = 3;
        priorityQueue.show(traffic);
        firstQueue.show(traffic);
        secondQueue.show(traffic);
        thirdQueue.show(traffic);

    }

    static void readFile() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("D:/PorjectJava/Siaod_Queue/src/com/company/data.txt"));
        String data = bf.readLine();
        String[] line;
        line = data.split("\\s+");
        for (String s : line) {
            priorityQueue.add(Integer.parseInt(s));
        }
        data = bf.readLine();
        line = data.split("\\s+");
        for (String s : line) {
            firstQueue.add(Integer.parseInt(s));
        }
        data = bf.readLine();
        line = data.split("\\s+");
        for (String s : line) {
            secondQueue.add(Integer.parseInt(s));
        }
        data = bf.readLine();
        line = data.split("\\s+");
        for (String s : line) {
            thirdQueue.add(Integer.parseInt(s));
        }
        bf.close();
    }

    static int inputCommand(String input) {
        int number = Integer.parseInt(input);
        if(number < 0 || number > 4) {
            System.out.println("Invalid command, try again.");
            return inputCommand(userInput());
        }
        return number;
    }

    static String userInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static void mainInstructions() {
        System.out.println("Enter 1, if you want to add element.");
        System.out.println("Enter 2, if you want to show first element.");
        System.out.println("Enter 3, if you want to show and delete first element.");
        System.out.println("Enter 4, if you want to clear thw queue.");
        System.out.println("Enter 0, if you want out.");
    }

}

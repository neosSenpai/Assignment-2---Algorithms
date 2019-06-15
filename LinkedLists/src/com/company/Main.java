package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a mathematical expression: ");
        String input = scan.nextLine();
        Stack s = new Stack();
        s.ParenMatch(input);
    }
}

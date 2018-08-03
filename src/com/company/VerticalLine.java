package com.company;

import java.util.Scanner;

public class VerticalLine {
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        Asterisk asterisk = new Asterisk();

        System.out.print("Enter number of asterisk = ");
        int noOfAsterisk = S.nextInt();

        while (noOfAsterisk-- > 0) {
            System.out.println(asterisk.getAsterisk());
        }
    }
}

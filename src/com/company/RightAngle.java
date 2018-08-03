package com.company;

import java.util.Scanner;

public class RightAngle {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        Asterisk asterisk = new Asterisk();

        System.out.print("Enter the number of lines = ");
        int noOfLines = S.nextInt();

        for(int lineNumber = 0; lineNumber < noOfLines; lineNumber++){
            for(int asteriskNumber = 0; asteriskNumber <= lineNumber; asteriskNumber++)
                System.out.print(asterisk.getAsterisk());
            System.out.println();
        }
    }
}

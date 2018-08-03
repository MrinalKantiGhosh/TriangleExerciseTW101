package com.company;

import java.util.Scanner;

public class HorizontalLine {
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        Asterisk asterisk = new Asterisk();
        System.out.print("Enter a number = ");
        int noOfAsterisk = S.nextInt();

        while(noOfAsterisk-- > 0)
            System.out.print(asterisk.getAsterisk());
    }
}

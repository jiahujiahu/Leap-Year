/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author huj011
 */
import java.util.Scanner;

public class LeapYear {
    
    public static void main(String[] args) {
        int year;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a year: ");
        year = keyboard.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.print(year + " is a leap year.");            
        } else {
            System.out.print(year + " is not a leap year.");
        }
    }
    
}

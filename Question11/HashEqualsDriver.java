/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class HashEqualsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Scanner object is given which takes the values from the keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("By Akanksha Sudhagoni");
        /**
         * the first strings are told to take by using the scan.next object and
         * the print statements are given
         */
        System.out.print("Enter first string: ");
        String str1 = scan.next();
        /**
         * the second strings are told to take by using the scan.next object and
         * the print statements are given
         */
        System.out.print("Enter second string: ");
        String str2 = scan.next();

        /**
         * the two strings are compared by .equals() and their respective
         * hashcodes are given by using the if else statement
         */
        if (str1.equals(str2)) {
            System.out.println("Both Strings are equal");
            System.out.println("The hash code of str1 is: " + str1.hashCode());
            System.out.println("The hash code of str2 is: " + str2.hashCode());

            System.out.println("*********************************************");
        } else {
            System.out.println("Both strings are different");

            System.out.println("The hash code of str1 is: " + str1.hashCode());
            System.out.println("The hash code of str2 is: " + str2.hashCode());
        }
    }
}

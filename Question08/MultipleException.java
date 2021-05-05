/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question08;

import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class MultipleException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("By Akanksha Sudhagoni");
            System.out.println("Enter a value");
            int a = sc.nextInt();
            System.out.println("Enter b value");
            int b = sc.nextInt();
            method(a, b);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    private static void method(int integerA, int integerB) throws ArithmeticException, NumberFormatException {
        if (integerB == 0) {
            throw new ArithmeticException("Arithmetic Exception");
        }
        integerA = Integer.parseInt(null);
        throw new NumberFormatException("NumberFormat Exception");
    }
}

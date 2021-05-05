/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class InfiniteRecursionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("By Akanksha Sudhagoni");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            long factorial = infiniteRecursion(num);
            System.out.println(num + "! = " + factorial);
            sc.close();
        } catch (StackOverflowError e) {
            System.out.println("over flow error occurs");
        }
    }
    // example for infinite recursion

    /**
     *
     * @param num
     * @return
     */
    public static long infiniteRecursion(int num) {
        return num * infiniteRecursion(num - 1);
    }
}

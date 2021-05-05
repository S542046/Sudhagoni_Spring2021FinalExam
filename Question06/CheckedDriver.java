/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Akanksha sudhagoni
 */
public class CheckedDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        try {
            Scanner sc = new Scanner(new File("inpudoc.txt"));
            String string1 = sc.next();
            String string2 = sc.next();
            double value1 = sc.nextDouble();
            long value2 = sc.nextLong();
            System.out.println("By Akanksha Sudhagoni");

            CheckedClass cc = new CheckedClass(string1, string2, value1, value2);
            System.out.println(cc.toString());

        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file is not "
                    + "present at the given path");
        }

    }
}

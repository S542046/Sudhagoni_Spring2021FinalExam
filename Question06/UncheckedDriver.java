/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class UncheckedDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("By Akanksha Sudhagoni");
            int array[] = {1, 2, 3, 4, 5};
            System.out.println(array[2]);
        } catch (ArrayIndexOutOfBoundsException ar) {
            System.out.println("Exception thrown");
        }

    }
}

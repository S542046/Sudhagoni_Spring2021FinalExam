/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

/**
 *
 * @author Aaknksha Sudhagoni
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        hashCode g1 = new hashCode("aa", 1);
        hashCode g2 = new hashCode("aa", 1);
        System.out.println("By Akanksha Sudhagoni");
        // comparing above created Objects.
        if (g1.hashCode() == g2.hashCode()) {

            if (g1.equals(g2)) {
                System.out.println("Both Objects are equal. ");
            } else {
                System.out.println("Both Objects are not equal. ");
            }

        } else {
            System.out.println("Both Objects are not equal. ");
        }
    }

}

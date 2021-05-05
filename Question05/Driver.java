/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question05;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ComparableCircle circle1 = new ComparableCircle(2.0);
        ComparableCircle circle2 = new ComparableCircle(5);
        System.out.println("By Akanksha Sudhagoni");
        System.out.println("Largest instance is " + findLargest(circle1, circle2));
    }

    public static String findLargest(ComparableCircle c1, ComparableCircle c2) {
        switch (c1.compareTo(c2)) {
            case -1:
                return "Circle 2 - " + c2.toString();
            default:
                return "Circle 1 - " + c1.toString();
        }
    }
}

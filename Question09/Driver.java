/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

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
        ThrowExcep th = new ThrowExcep(" ", 100.1);
        try {
            System.out.println("By Akanksha Sudhagoni");
            System.out.println(th.toString());
            System.out.println(th.throwexcep());
        } catch (NullPointerException e) {
            System.out.println("throws exception");
        }
    }
}

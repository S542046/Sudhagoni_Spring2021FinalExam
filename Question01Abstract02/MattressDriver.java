/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01Abstract02;

import java.util.Scanner;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class MattressDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the shop name: ");
        String shopName = sc.next();
        System.out.print("Enter the location: ");
        String Location = sc.next();
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        System.out.print("Enter the length: ");
        double length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double breadth = sc.nextDouble();

        Mattress mat = new Queen(side, shopName, Location);
        Mattress m = new TwinXL(length, breadth, shopName, Location);

        System.out.println(mat.toString());
        System.out.println(m.toString());
    }

}

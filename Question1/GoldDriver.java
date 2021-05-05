
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.Scanner;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class GoldDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("By Akanksha Sudhagoni");
        System.out.print("Enter the price of the earring: ");
        double priceOfEarring = sc.nextDouble();
        System.out.print("Enter the weight of earrings: ");
        double EarringsWeight = sc.nextDouble();
        System.out.print("Enter the name of the customer: ");
        String nameOfCustomer = sc.next();
        System.out.print("Enter the price of gold: ");
        double price = sc.nextDouble();
        System.out.print("Enter the weight of gold: ");
        int weight = sc.nextInt();
        System.out.print("Enter the price of bangle: ");
        double BanglePrice = sc.nextDouble();
        System.out.print("Enter the weight of bangle: ");
        double BangleWeight = sc.nextDouble();

        Gold g = new EarRings(priceOfEarring, EarringsWeight, nameOfCustomer, price, weight);
        Gold b = new Bangles(BanglePrice, BangleWeight, nameOfCustomer, price, weight);
        System.out.println(b.toString());
        System.out.println(g.toString());

    }
}

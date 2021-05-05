/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class Bangles extends Gold {

    private double BanglePrice;
    private double BangleWeight;

    public Bangles(double BanglePrice, double BangleWeight, String nameOfCustomer, double price, int weight) {
        super(nameOfCustomer, price, weight);
        this.BanglePrice = BanglePrice;
        this.BangleWeight = BangleWeight;
    }

    public double getBanglePrice() {
        return BanglePrice;
    }

    public double getBangleWeight() {
        return BangleWeight;
    }

    @Override
    public double getCost() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double cost = BanglePrice * BangleWeight;
        return cost;
    }

    @Override
    public String stringMethod() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return super.getNameOfCustomer().substring(0, 1);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBangle Price: " + BanglePrice + "\nBangle Weight: " + BangleWeight
                + "\ncost: " + getCost() + "\nFirst letter of customer name: " + stringMethod();
    }
}

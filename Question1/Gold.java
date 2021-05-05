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
public abstract class Gold {

    private String nameOfCustomer;
    private double price;
    private int weight;

    public Gold(String nameOfCustomer, double price, int weight) {
        this.nameOfCustomer = nameOfCustomer;
        this.price = price;
        this.weight = weight;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public abstract double getCost();

    public abstract String stringMethod();

    @Override
    public String toString() {
        return "nameOfCustomer: " + nameOfCustomer + "\nprice: " + price + "\nweight: " + weight;
    }
}

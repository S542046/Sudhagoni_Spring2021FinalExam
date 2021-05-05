/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question01Abstract02;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class Queen extends Mattress {

    private double side;

    public Queen(double side, String shopName, String Location) {
        super(shopName, Location);
        this.side = side;
    }

    public Queen(String side, String Location) {
        super(side, Location);
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSide() {
        return side;
    }

    @Override
    public double areaOfMatrress() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double area = Math.pow(side, 2);
        return area;
    }

    @Override
    public double perimeterOfMatrress() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double peri = 4 * side;
        return peri;
    }

    @Override
    public String toString() {
        return "side: " + side
                + "\narea of mattress: " + areaOfMatrress()
                + "\nperimeter of the mattress: " + perimeterOfMatrress();
    }

}

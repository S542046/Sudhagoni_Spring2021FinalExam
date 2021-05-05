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
public class TwinXL extends Mattress {

    private double length;
    private double breadth;

    public TwinXL(double length, double breadth, String shopName, String Location) {
        super(shopName, Location);
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public double areaOfMatrress() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double area = length * breadth;
        return area;
    }

    @Override
    public double perimeterOfMatrress() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double perimeter = 2 * (length + breadth);
        return perimeter;
    }

    @Override
    public String toString() {
        return super.toString() + "\nlength of twinXL: " + length + "\nbreadth oftwinXL: " + breadth
                + "\narea of the mattress: " + areaOfMatrress()
                + "\nperimeter of the mattress: " + perimeterOfMatrress();
    }

}

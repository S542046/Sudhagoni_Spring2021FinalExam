/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question09;

/**
 *
 * @author Akankhsa Sudhagoni
 */
public class ThrowExcep {

    private String String;

    private double value;

    public ThrowExcep(String String, double value) {
        this.String = String;
        this.value = value;
    }

    public String getString() {
        return String;
    }

    public void setString(String String) {
        this.String = String;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String throwexcep() {
        String st = " ";
        if (String.equals(" ")) {
            throw new NullPointerException("Exception thrown");
        } else {
            st = "String is printed";
        }
        return st;
    }

    @Override
    public String toString() {
        return "String: " + String + "\nvalue: " + value;
    }

}

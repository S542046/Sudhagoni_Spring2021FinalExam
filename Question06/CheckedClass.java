/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question06;

/**
 *
 * @author Akanksha Sudhagoni
 */
public class CheckedClass {

    private String string1;
    private String string2;
    private double value1;
    private long value2;

    public CheckedClass(String string1, String string2, double value1, long value2) {
        this.string1 = string1;
        this.string2 = string2;
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public long getValue2() {
        return value2;
    }

    public void setValue2(long value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "string1: " + string1 + "\nstring2: " + string2 + "\nvalue1: " + value1 + "\nvalue2: " + value2;
    }

}

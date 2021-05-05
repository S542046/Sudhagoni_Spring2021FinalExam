/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10;

import java.util.Scanner;

/**
 * @author Akanksha Sudhagoni
 *
 */
public class RecursionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nacs = new Scanner(System.in);

        int array[] = new int[]{23, 160, 8, 30, 10};
        System.out.println("By Akanksha Sudhagoni");
        System.out.print("Enter the element if the arraylist are: ");
        int x = nacs.nextInt();
        int index = recursiveSearch(array, 0, array.length - 1, x);
        if (index != -1) {
            System.out.println("Element " + x + " is present at index "
                    + index);
        } else {
            System.out.println("Element " + x + " is not there");
        }
    }

    private static int recursiveSearch(int[] arr, int i, int j, int k) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (j < i) {
            return -1;
        }
        if (arr[i] == k) {
            return i;
        }
        if (arr[j] == k) {
            return j;
        }
        return recursiveSearch(arr, i + 1, j - 1, k);
    }
}

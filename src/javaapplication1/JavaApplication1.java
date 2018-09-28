/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Student
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static  int pow(double base, int exponent) {
        int total = 1;
        for(int a = 1; a<= exponent; a++){
        total *=base;
    }
        return total;
    }
    public static void main(String[] args) {
        int temp = pow(2,3);
        System.out.println(temp);
}

}

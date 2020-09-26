/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morejava;

/**
 *
 * @author imamu
 */
public class SquareParameter {
    public int square(int n) {
        return n*n;
    }
    
    public static void main(String[] args) {
        SquareParameter squareparameter = new SquareParameter();
        double s = squareparameter.square(2);
        System.out.println(s);
    }
}

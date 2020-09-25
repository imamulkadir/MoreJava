/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package morejava;
import java.util.Scanner;
/**
 *
 * @author imamu
 */
public class CheckNum {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number to check if it's positive or not? Odd or Even? : ");
        int a = scr.nextInt();
        
        if(a>0 && a%2 == 0) {
            System.out.println("The number is positive and even.");
        }
        else if (a>0 && a%2!=0) {
            System.out.println("The number is positive and odd");
        }
        else if (a<0 && a%2==0) {
            System.out.println("The number is negative and even");
        }
        else if (a<0 && a%2!=0) {
            System.out.println("The number is negative and odd");
        }
    }
}

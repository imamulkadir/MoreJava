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
public class TestMethod {
    public void printText(String text) {
        System.out.println("text1");
    }
    
    public void writeText (String text1, String text2) {
        System.out.println("text1");
        System.out.println("text2");
    }
    
    public int sum (int value1, int value2) {
        return value1 + value2;
    }
    
    public String concat(String value1, String value2) throws IllegalArgumentException {
        if (value1 == null) {
            throw new IllegalArgumentException("Value1 is Null");
        }
        if (value2 == null) {
            throw new IllegalArgumentException("Value2 is Null");
        }
        return value1 + value2;
    }
}

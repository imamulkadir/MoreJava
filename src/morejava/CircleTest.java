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
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double area = circle.getArea();
        System.out.println("Area of circle: %.3f" + area);
    }
}

class Circle {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
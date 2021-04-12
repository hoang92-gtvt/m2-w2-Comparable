package main;
import circle.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle [3];

        circles[0] = new Circle(3.6);
        circles[1] = new Circle(4.3);
        circles[2] = new Circle(3.8);
        System.out.println("Pre-sorted:");

        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }
    }

}

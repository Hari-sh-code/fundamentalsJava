// Objective: Develop a basic Java program to understand class and initialize the instance variable of a class.

// Problem Description: Develop a class "Rectangle". The class should have two instance variables with private access modifier.

// length: int (length is the variable and int is the data type)
// breadth: int
// Use setter methods to initialize the instance variables.

// Problem Description: Use the same "Rectangle" class created in the previous exercise of the same module and add a method "calculatePerimeter ()" which should calculate the perimeter based on the formula "2(length + breadth)" and prints on the console. Develop another class called PerimeterCalculator and add the main method which invokes the "calculatePerimeter ()" method on the Rectangle object.

// Structure of the method is, void calculatePerimeter() { }

import java.io.*;
import java.util.*;

class Exercise2 {

    private int length;
    private int breadth;
    Scanner sc = new Scanner(System.in);

    // Setter methods
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setDetails() {
        System.out.print("Enter the length: ");
        setLength(sc.nextInt());

        System.out.print("Enter the breadth: ");
        setBreadth(sc.nextInt());
    }

    public void calculatePerimeter(){

        int perimeter = 2*(length+breadth);
        System.out.println("Perimeter: "+perimeter);

    }

}

public class Rectangle {
    public static void main(String[] args) throws IOException {
        Exercise2 obj = new Exercise2();
        obj.setDetails();
        obj.calculatePerimeter();
    }
}

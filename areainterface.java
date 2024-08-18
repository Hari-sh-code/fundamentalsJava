import java.io.*;
import java.util.*;

interface Shape1 {
    void printArea();
}

class Rectangle1 implements Shape1 {
    int length = 5;
    int breadth = 6;

    public void printArea() {
        System.out.println("Area of Rectangle: " + (this.length * this.breadth));
    }
}

class Square1 implements Shape1 {
    int side = 4;

    public void printArea() {
        System.out.println("Area of Square: " + (this.side * this.side));
    }
}

class areainterface {
    public static void main(String[] args) throws IOException {
        Rectangle1 rectangle = new Rectangle1();
        rectangle.printArea();

        Square1 square = new Square1();
        square.printArea();
    }
}

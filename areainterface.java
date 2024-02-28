import java.io.*;
import java.util.*;

interface Shape {
    void printArea();
}

class Rectangle implements Shape {
    int length = 5;
    int breadth = 6;

    public void printArea() {
        System.out.println("Area of Rectangle: " + (this.length * this.breadth));
    }
}

class Square implements Shape {
    int side = 4;

    public void printArea() {
        System.out.println("Area of Square: " + (this.side * this.side));
    }
}

class areainterface {
    public static void main(String[] args) throws IOException {
        Rectangle rectangle = new Rectangle();
        rectangle.printArea();

        Square square = new Square();
        square.printArea();
    }
}

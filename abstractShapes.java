abstract class Shape {
    int a;
    int b;
 
    abstract void printArea(int a, int b);
}

class Rectangle extends Shape {
    void printArea(int a, int b) {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

class Triangle extends Shape {
    void printArea(int a, int b) {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

class abstractShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.printArea(5,7);

        Triangle triangle = new Triangle();
        triangle.printArea(5,7);
    }
}

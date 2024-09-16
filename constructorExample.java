import java.io.*;

class A {
    int x;
    double y;

    // Default constructor
    A() {
        x = 5;
        y = 6.7;
    }

    // Parameterized constructor
    A(double a, int b) {
        y = a;
        x = b;
    }

    // Copy constructor
    A(A tmp) {
        x = tmp.x;
        y = tmp.y;
    }

    // Method to display the values of x and y
    void fnDisplay() {
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}

class constructorExample {
    public static void main(String[] args) throws IOException {
        // Using the default constructor
        A obj1 = new A();
        System.out.println("Default Constructor");
        obj1.fnDisplay();

        // Using the parameterized constructor
        A obj2 = new A(8.9, 5);
        System.out.println("Parameterized Constructor");
        obj2.fnDisplay();

        // Using the copy constructor
        A obj3 = new A(obj1);
        System.out.println("Copy Constructor");
        obj3.fnDisplay();
    }
}

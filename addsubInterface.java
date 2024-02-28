import java.io.*;
import java.util.*;

interface Arithmetic {
    void add(int a, int b);
    void sub(int a, int b);
}

class Calculator implements Arithmetic {
    
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public void sub(int a, int b, int c) {
        System.out.println("Difference: " + (a - b - c));
    }
}

public class addsubInterface {
    public static void main(String[] args) throws IOException {
        Calculator calc = new Calculator();
        calc.add(5, 3);     
        calc.sub(5, 3);     
        calc.add(5, 3, 2);  
        calc.sub(5, 3, 2);  
    }
}

import java.io.*;
import java.util.*;


interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class MyClass implements ChildInterface {
    public void parentMethod() {
        System.out.println("This is a method from the parent interface.");
    }

    public void childMethod() {
        System.out.println("This is a method from the child interface.");
    }
}

public class InheritParentInterface {
    public static void main(String[] args) throws IOException {
        MyClass myClass = new MyClass();

        myClass.parentMethod();

        myClass.childMethod();
    }
}

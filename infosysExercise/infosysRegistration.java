import java.io.*;
import java.util.*;

class Student {

    private int stdID, stdYear, stdMarks;
    private String stdName, stdStatus;

    Scanner sc = new Scanner(System.in);


    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        if (stdID > 0) {
            this.stdID = stdID;
        } else {
            System.out.println("Invalid ID.");
        }
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdMarks() {
        return stdMarks;
    }

    public void setStdMarks(int stdMarks) {
        this.stdMarks = stdMarks;
    }

    public int getStdYear() {
        return stdYear;
    }

    public void setStdYear(int stdYear) {
        this.stdYear = stdYear;
    }

    public String getStdStatus() {
        return stdStatus;
    }

    public void setStdStatus(String stdStatus) {
        this.stdStatus = stdStatus;
    }


    void getDetails() {
        System.out.print("Student ID: ");
        setStdID(sc.nextInt());
        sc.nextLine(); 

        System.out.print("Student Name: ");
        setStdName(sc.nextLine());

        System.out.print("Qualifying marks: ");
        setStdMarks(sc.nextInt());
        sc.nextLine(); 

        System.out.print("Year of Engineering: ");
        setStdYear(sc.nextInt());
        sc.nextLine(); 

        System.out.print("Residential status: ");
        setStdStatus(sc.nextLine());

        System.out.println();
    }

   
    void displayDetails() {
        System.out.printf("Student ID: %d\n", getStdID());
        System.out.printf("Student name: %s\n", getStdName());
        System.out.printf("Qualifying marks: %d\n", getStdMarks());
        System.out.printf("Year of Engineering: %d\n", getStdYear());
        System.out.printf("Residential status: %s\n", getStdStatus());
    }
}

public class infosysRegistration {
    public static void main(String[] args) throws IOException {
        Student std = new Student();
        std.getDetails();
        std.displayDetails();
    }
}

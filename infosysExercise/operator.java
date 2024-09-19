import java.io.*;
import java.util.*;

// Problem Statement:
// Objective: To understand the concept of Java operators.

// 'Problem Description: Create a Java class as shown in the example and change the program to use compound assignments like "+="

// class CalculateWithOperators {
//     public static void main (String[] args) {
//       int res = 1 + 2; // result is now 3
//       System.out.println (res);
//       res= res - 1; // result is now 2
//       System.out.println (res);
//       res = res * 2; // result is now 4
//       System.out.println(res);
//       res = res / 2; // result is now 2
//       System.out.println(res);
//       res = res + 8; // result is now 10
//       res = res % 7; // result is now 3
//       System.out.println(res);
//     }
//   }

public class operator {
    public static void main(String[] args) throws IOException {
        int res = 1;
        res+=2;
        System.out.println(res);

        res-=1;
        System.out.println(res);

        res*=2;
        System.out.println(res);

        res/=2;
        System.out.println(res);

        res+=8;
        System.out.println(res);

        res%=7;
        System.out.println(res);

    }
}

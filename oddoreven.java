import java.io.*;
import java.util.*;

class nos{
    
    nos(double x){
        if(x%2 == 0){
            System.out.print("Even");
        }
        else{
            System.out.print("Odd");
        }
    }
}

class oddoreven {
    public static void main(String[] args)throws IOException{
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double val = sc.nextDouble();

        nos obj = new nos(val);
    }

}

import java.io.*;
import java.util.*;
import java.lang.*;

class sequentialsearch {
    public static void main (String [] args)throws IOException{
        Scanner scp = new Scanner(System.in);
        int i, arrlen, target, pos=0;
        int arr[];
        //total_length
        System.out.print("Enter the Size of the list: ");
        arrlen = scp.nextInt();
        //total_elements
        System.out.print("Enter the array elements: ");
        arr = new int[arrlen];
        for(i=0;i<arrlen;i++){
            arr[i] = scp.nextInt();
        }
        //target
        System.out.print("Enter the element to find: ");
        target = scp.nextInt();
        //target_finding
        for(i=0;i<arrlen;i++){
            if (arr[i] == target){
                pos = i+1;
                break;
            }
        }
        //array_displaying
        System.out.print("Entered elements: ");
        for(i=0;i<arrlen;i++){
            System.out.print(arr[i]+" ");
        }
        scp.nextLine();
        if(pos!=0){
            System.out.println("Element found at position "+(pos));
        }
        else{
            System.out.println("Element not found");
        }
    }
}

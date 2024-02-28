import java.io.*;
import java.util.*;

class Search{

    Scanner sc = new Scanner(System.in);
    int arr[];
    int i,arrlen, target;
    
    //inputs
    void fnInput(){
        
        //size
        System.out.println("Enter the size: ");
        arrlen = sc.nextInt();
        
        //full_elements
        arr = new int[arrlen];
        System.out.print("Enter the elements: ");
        for (i=0; i<arrlen; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);


        //target_element
        System.out.println("Enter the target: ");
        target = sc.nextInt();
    }

    int start = 0 , end = arrlen;
    
    //calculaltion
    void fnCalculation(){
        while(start <= end){
            int mid = (int)(start+end)/2 ;
            
            if (target>arr[mid]){
                start = mid+1;
            }
            else if (target<arr[mid]){
                end = mid-1;
            }
            else{
                System.out.println("Element is present");
                break;
            }
        }
        if (start > end){
            System.out.println("Element is not found");
        }
    }
}

class binarySearch{
    public static void main(String[] args){
        Search obj = new Search();
        obj.fnInput();
        obj.fnCalculation();
    }
}

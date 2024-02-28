import java.io.*;
import java.util.*;

class stkadt {
    
    //declaration
    int tos, capacity;
    int stk[];

    //constructor
    stkadt (int c){
        tos = -1;
        capacity = c;
        stk = new int[capacity];
    }

    //size
    int size(){
        return tos+1;
    }

    //isFull()
    boolean isFull(){
        return ((tos+1)==capacity);
    }

    //isEmpty()
    boolean isEmpty(){
        return (tos==-1);
    }
    
    //push
    void push(int x){
        if(!isFull()){
            stk[++tos]=x;
        }
        else{
            System.out.println("Full Stack, Cant insert an element");
        }
    }

    //pop
    void pop(){
        if(!isEmpty()){
            tos--;
        }
        else{
            System.out.println("Empty stack, Cant delete element");
        }
    }

    //topandpop
    int topandpop(){
        if(!isEmpty()){
            return(stk[tos--]);
        }
        else{
            System.out.print("Empty Stack, Cant delete element");
            return -1;
        }
    }

    //peek
    void peek(){
        if(!isEmpty()){
            System.out.println("Element on top of the stack is "+stk[tos]);
        }
        else{
            System.out.print("Empty Stack, No element present");
        }
    }

    //display
    void fnDisplay(){
        if(!isEmpty()){
            System.out.print("\nElement in stack: ");
            for (int i =0; i<=tos; i++){
                System.out.print(stk[i]+" ");
            }
        }
        else{
            System.out.print("Empty Stack, no elements present");
        }
    }
}

//main_class
class stackadt{
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        
        //stack_size
        System.out.print("Enter the stack size: ");
        int cap = sc.nextInt();
        stkadt s = new stkadt(cap);
        
        //choices
        int choice;
        do{
            System.out.println("\nMenu:- \n1. Push \n2. Pop \n3. TopandPop \n4. Peek \n5. Exit ");
            System.out.print("\nEnter the choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.print("\nEnter the element: ");
                    int ele = sc.nextInt();
                    s.push(ele);
                    System.out.println("Current Size of the stack: "+ s.size());
                    s.fnDisplay();
                    break;
                case 2:
                    s.pop();
                    System.out.println("Current Size of the stack: "+ s.size());
                    s.fnDisplay();
                    break;
                case 3:
                    int val = s.topandpop();
                    System.out.println("Deleted element: "+val);
                    System.out.println("Current Size of the stack: "+ s.size());
                    s.fnDisplay();
                    break;
                case 4:
                    s.peek();
                    System.out.println("Current Size of the stack: "+ s.size());
                    s.fnDisplay();
                    break;
                case 5:
                    System.exit(0);
            }
        }while(true);
    }
}
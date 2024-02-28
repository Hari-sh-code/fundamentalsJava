import java.io.*;
import java.util.*;
import java.util.Random;

class Que{

    int n;
    boolean Flag = false;
    int counter = 0;

    synchronized void put(int x){
        while(Flag == true){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        this.n = x;
        Flag = true;
        notifyAll();
    }

    synchronized int get(){
        while(Flag == false){
            try{
                wait();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        counter++;
        if(counter == 2){
            Flag = false;
            counter = 0;
        }
        notify();
        return this.n;
    }
}

class Producer extends Thread{
    Que q;
    int limit = 2;
    Producer(Que objq){
       
        super("Number");
        this.q = objq;
    }
    public void run(){
        
        Random R = new Random();
        int i = 0;
        
        while(i< limit){
            int rn = R.nextInt(10);
            q.put(rn);
            System.out.println(this.getName()+"-value sent= "+rn);
            i++;
        }

        try {
            Thread.sleep(1000);
        }

        catch(Exception e){
            System.out.println(e);
        }

        System.exit(0);
    }
}

class Consumera extends Thread{

    Que q;
    Consumera(Que objq){
        super("Square");
        this.q = objq;
    }

    public void run(){
        
        while(true){
            
            int val = q.get();
            
            if (val % 2 ==0){
                System.out.println(this.getName()+" "+(val*val));
            }

            try{
                Thread.sleep(1000);
            }
            
            catch(Exception e){
                System.out.println("e");
            }
        }
    }
}

class Consumerb extends Thread{
    
    Que q;
    
    Consumerb(Que objq){
        super("Cube");
        this.q = objq;
    }

    public void run(){
        
        while(true){
            
            int val = q.get();
            
            if (val % 2 !=0){
                System.out.println(this.getName()+" "+(val*val*val));
            }

            try{
                Thread.sleep(1000);
            }
            
            catch(Exception e){
                System.out.println("e");
            }
        }
    }

}

class OddEvenThread {
    public static void main(String[] args)throws IOException{
        
        Que Q = new Que();
        Producer P = new Producer(Q);
        Consumera ca = new Consumera(Q);
        Consumerb cb = new Consumerb(Q);

        P.start();
        ca.start();
        cb.start();
    }
    
}

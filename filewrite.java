import java.io.*;

public class filewrite {
    
    public static void main(String[] as)throws IOException{

        FileWriter fa = null;
        String filepath = "C:\\Programs\\OOPs-R21\\demo.txt";
        try{
            fa = new FileWriter(filepath);
            String s = new String("Hello Brooo ");
            fa.write(s);               
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            fa.close();
        }
    }
}

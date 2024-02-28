import java.io.*;

public class fileappend {
    public static void main(String[] as)throws IOException{
        
        FileInputStream fa = null;
        FileOutputStream fb = null;
        int i;

        try{

            fa = new FileInputStream("C:\\Programs\\OOPs-R21\\demo.txt");
            fb = new FileOutputStream("C:\\Programs\\OOPs-R21\\demoa.txt",true);

            while(true){

                i = fa.read();
                if(i == -1 ){
                    break;
                }
                fb.write(i);
            }
        }
        catch(Exception e){
            System.out.println((e));
        }
        finally{
            fa.close();
            fb.close();

        }
    }
}

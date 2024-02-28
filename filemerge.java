import java.io.*;


public class filemerge{
    public static void main(String[] as)throws IOException{
          FileInputStream fa = null;
          FileInputStream fb = null;
          FileOutputStream fc = null;
          int i;

          try{

            fa = new FileInputStream("C:\\Programs\\OOPs-R21\\demo.txt");
            fb = new FileInputStream("C:\\Programs\\OOPs-R21\\demoa.txt");
            fc = new FileOutputStream("C:\\Programs\\OOPs-R21\\ouput.txt");

            while(true){

              i = fa.read();
              if(i==-1){
                break;
              }
              fc.write(i);
            }
            while(true){
              i = fb.read();
              if(i==-1){
                break;
              }
              fc.write(i);
            }
          }
          catch(Exception e){
            System.out.println(e);
          }
          finally{
            fa.close();
            fb.close();
            fc.close();
          }
    }     
}

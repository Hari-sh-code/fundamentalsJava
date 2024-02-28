import java.io.*;

class fileread{
    public static void main(String[] as) throws IOException{

        FileReader f = null;
        int i;
        StringBuffer s = new StringBuffer();
        
        try{

            f = new FileReader("C:\\Programs\\OOPs-R21\\demo.txt");
            while(true){
                i = f.read();
                if(i==-1){
                    break;
                }
                s.append((char)i);
            }
            System.out.println(s);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            f.close();
            System.out.println("File readed");
        }
    }      
}
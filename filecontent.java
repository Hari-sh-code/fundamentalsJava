import java.io.*;
import java.util.*;
class filecontent
{
	public static void main(String [] as)throws IOException
	{
		FileInputStream fs = null;
		try
		{
			int j=1;
			Scanner sc = new Scanner(new File("C:\\Programs\\OOPs-R21\\demo.txt"));
			while(sc.hasNextLine())
			{
				System.out.println(j+" "+sc.nextLine());
				j+=1;
			}
		}
		catch(Exception e)
		{
		System.out.println(e);}
		
	}

}

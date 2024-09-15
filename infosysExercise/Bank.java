import java.io.*;

class Bank{
	public static void main(String argh[])throws IOException{
		int[] phoneno = new int[4];
		int count=0;
		phoneno[0] = 777;
		phoneno[1] = 888;
		phoneno[2] = 999;
		phoneno[3] = 555;
		for( int i=0; i<=phoneno.length ; i++){
			System.out.println("Phone.no: "+count+" "+phoneno[i]);
			count++;
		}
	}
}

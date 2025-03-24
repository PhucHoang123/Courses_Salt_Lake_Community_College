package helloworld1340;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
	
	public static void main(String[] args)throws Exception{
	String filename = "TimeTables.txt";
	try
	{
		int i,j;
		FileWriter file=new FileWriter(filename);
		BufferedWriter bw = new BufferedWriter(file);
		for(i=1;i<=10;i=i+2)
		{
			for(j=1;j<=10;j++) {
				String value=String.format("%2d * %2d = %2d      %2d * %2d = %2d\n",j,i,i*j,j,(i+1),(i+1)*j);
				bw.write(value);
		}
		bw.write("\n");
		}
		bw.close();
		file.close();
	}
	catch(Exception ex){
		System.out.println(ex);
		}
	}
}


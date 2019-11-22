package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharacter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		FileReader fr=new FileReader("C:\\Users\\Trainee\\Desktop\\documents\\temp.txt");
//		FileWriter fw=new FileWriter("C:\\Users\\Trainee\\Desktop\\documents\\output2.txt");
//		int val;
//		//to check end of stream character by character changes each to ASCII value
//		while((val=fr.read())!= -1)
//		{
//			System.out.println(val);//prints ASCII value of each character
//			fw.write(val);
//		}
//		fr.close();
//		fw.close();
		
///BufferedReader and BufferedWriter
		
		FileReader fr=new FileReader("C:\\Users\\Trainee\\Desktop\\documents\\temp.txt");
		BufferedReader bfr=new BufferedReader(fr);
		FileWriter fw=new FileWriter("C:\\Users\\Trainee\\Desktop\\documents\\output3.txt");
		BufferedWriter bfw=new BufferedWriter(fw);
		String line;
		//int val;
		while((line=bfr.readLine())!=null)
		{
			System.out.println(line);
			bfw.write(line);
			bfw.newLine();
		}
		//close file
		
		bfr.close();
		bfw.close();
		fr.close();
		fw.close();


	}

}

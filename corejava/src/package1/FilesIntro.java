package package1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesIntro {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//byte oriented channel class
//		FileInputStream fis=new FileInputStream("C:\\Users\\Trainee\\Desktop\\documents\\temp.txt");
//		FileOutputStream fos=new FileOutputStream("C:\\Users\\Trainee\\Desktop\\documents\\output1.txt");
//		int val;
//		//to check end of stream byte by byte
//		while((val=fis.read())!= -1)
//		{
//			//System.out.println(val);
//			fos.write(val);
//		}
//		//close files
//		fis.close();
//		fos.close();
		
		//Buffered inputstream
		FileInputStream fis=new FileInputStream("C:\\Users\\Trainee\\Desktop\\documents\\temp.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Trainee\\Desktop\\documents\\output4.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		int val;
		//to check end of stream byte by byte
		System.out.println(bis.read());
		while((val=bis.read())!= -1)
		{
			System.out.println(bis.read());
			bos.write(val);
		}
		
		//close file
		
		bis.close();
		bos.close();
//		fis.close();
//		fos.close();

	}

}

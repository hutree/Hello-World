import java.io.*;

public class Test8 {

	public static void main(String[] args) {
		// ���ַ���д���ļ�
		try(FileOutputStream out=new FileOutputStream("C:\\ch8\\filea.java")){
			String str="hello world!";
			out.write(str.getBytes());
		}catch(FileNotFoundException e) {
			System.out.println("File can not found:"+e);
		}catch(IOException e) {
			System.out.println("File read Error:"+e);
		}

	}

}

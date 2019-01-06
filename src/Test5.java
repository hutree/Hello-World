import java.io.*;

public class Test5 {

	public static void main(String[] args) {
		// 使用文件字节输入流读取文件，将文件的内容输出到屏幕
		FileInputStream in=null;
		try {
			int n=-1;
			byte[] a=new byte[100];
			in=new FileInputStream("Test5.java");
			while((n=in.read(a,0,100))!=-1) {
				String s=new String(a,0,n);
				System.out.println(s);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File can not find:"+e);
		}
		catch(IOException e) {
			System.out.println("File read Error:"+e);
		}
		finally {
			try {
				in.close();
			}
			catch(IOException e) {
				System.out.println("File close Error:"+e);
			}
		}

	}

}

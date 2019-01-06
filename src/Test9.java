import java.io.*;

public class Test9 {

	public static void main(String[] args) {
		// 使用字符输入流读取文件、输出文件
		try(FileReader in=new FileReader("C:\\ch8\\filea.java");
				FileWriter out=new FileWriter("C:\\ch8\\ff.java")){
			int n=-1;
			char[] a=new char[100];
			while((n=in.read(a,0,100))!=-1) {
				String s=new String(a,0,n);
				System.out.print(s);
				out.write(a, 0, n);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File can not found:"+e);
		}catch(IOException e) {
			System.out.println("File read Error:"+e);
		}

	}

}

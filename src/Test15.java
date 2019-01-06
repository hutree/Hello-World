import java.io.*;

public class Test15 {

	public static void main(String[] args) {
		// 将标准输出流重定向到某一文件
		try(FileInputStream in=new FileInputStream("C:\\ch8\\filea.java")){
			System.setOut(new PrintStream("C:\\ch8\\ff.java"));
			int n=-1;
			byte[] a=new byte[100];
			while((n=in.read(a,0,100))!=-1) {
				String s=new String(a,0,n);
				System.out.print(s);
			}
		}catch(FileNotFoundException e) {
			System.out.println("file can not found:"+e);
		}catch(IOException e) {
			System.out.println("File read Error:"+e);
		}

	}

}

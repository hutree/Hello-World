import java.io.*;

public class Test6 {

	public static void main(String[] args) {
		// ¶ÁÈ¡ÎÄ¼þ
		try(FileInputStream in=new FileInputStream("C:\\ch8\\filea.java")){
			int n=-1;
			byte[]a=new byte[100];
			while((n=in.read(a, 0, 100))!=-1) {
				String s=new String(a,0,n);
				System.out.print(s);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File can not found:"+e);
		}catch(IOException e) {
			System.out.println("File read Error:"+e);
		}

	}

}

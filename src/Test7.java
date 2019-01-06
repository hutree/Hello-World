import java.io.*;

public class Test7 {

	public static void main(String[] args) {
		//Ð´ÈëÎÄ¼þ
		try(FileInputStream in=new FileInputStream("C:\\ch8\\filea.java");
			FileOutputStream out=new FileOutputStream("C:\\ch8\\ff.java")){
			int n=-1;
			byte[] a= new byte[100];
			while((n=in.read(a, 0, 100))!=-1) {
				String s=new String(a,0,n);
				System.out.print(s);
				out.write(a,0,n);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File can not found:"+e);
		}catch(IOException e) {
			System.out.println("File read Error:"+e);
		}

	}

}

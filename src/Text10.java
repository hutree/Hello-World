import java.io.*;

public class Text10 {

	public static void main(String[] args) {
		// ʹ���ַ������ļ�������һ������
		try(FileWriter out=new FileWriter("C:\\ch8\\filea.java");
				FileReader in=new FileReader("C:\\ch8\\filea.java")
				){
			String s="hello everyone";
			char[] a=s.toCharArray();
			out.write(a, 0, a.length);
			out.flush();//��������������д��Ŀ�ĵ�
			char[] b=new char[100];
			int n=-1;
			while((n=in.read(b,0,100))!=-1) {
				String s1=new String(b,0,n);
				System.out.print(s1);
			}
		}catch(FileNotFoundException e) {
			System.out.println("File can not found:"+e);
		}catch(IOException e) {
			System.out.println("File read Error:"+e);
		}

	}

}

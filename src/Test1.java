import java.io.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\ch8","filea.java");
		System.out.println(f.getName()+"�ǿɶ�����"+f.canRead());
		System.out.println(f.getName()+"�ĳ���"+f.length());
		System.out.println(f.getName()+"����·��"+f.getAbsolutePath());
		File file=new File("new.txt");
		System.out.println("�ڵ�ǰĿ¼�´����ļ�"+file.getName());
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("�����ɹ�");
			}
			catch(IOException exp) {
				
			}
		}
		

	}

}

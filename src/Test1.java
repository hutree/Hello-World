import java.io.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\ch8","filea.java");
		System.out.println(f.getName()+"是可读的吗"+f.canRead());
		System.out.println(f.getName()+"的长度"+f.length());
		System.out.println(f.getName()+"绝对路径"+f.getAbsolutePath());
		File file=new File("new.txt");
		System.out.println("在当前目录下创建文件"+file.getName());
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("创建成功");
			}
			catch(IOException exp) {
				
			}
		}
		

	}

}

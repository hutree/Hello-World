import java.io.*;

public class Test4 {

	public static void main(String[] args) {
		//使用Runtime打开windows中的笔记本和游览器
		try {
			Runtime ce=Runtime.getRuntime();
			File file=new File("c:\\windows","Notepad.exe");
			System.out.println(file.getAbsolutePath());
			ce.exec(file.getAbsolutePath());
			file=new File("C:\\Users\\HMQ\\AppData\\Local\\Google\\Chrome\\Application","Chrome www.baidu.com");
			System.out.println(file.getAbsolutePath());
			ce.exec(file.getAbsolutePath());
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}

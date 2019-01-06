import java.io.*;

public class Test13 {

	public static void main(String[] args) {
		// ´òÓ¡Êä³öÁ÷
		try {
			PrintStream f=new PrintStream("C:\\ch8\\filea.java");
			f.println("hello world!hhh");
			f.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

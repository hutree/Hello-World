import java.io.*;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// 将标准输入流System.in重定向到指定文件
		try {
			System.setIn(new FileInputStream("C:\\ch8\\filea.java"));
			Scanner scanner=new Scanner(System.in);
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
			scanner.close();
		}catch(FileNotFoundException e) {
			System.out.println("file can not found:"+e);
		}

	}

}

import java.io.*;
import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// ����׼������System.in�ض���ָ���ļ�
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

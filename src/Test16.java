import java.io.*;
import java.util.Date;

public class Test16 {

	public static void main(String[] args) {
		// 验证BufferReader高效性
		try(FileReader reader=new FileReader("C:\\ch8\\filea.java")){
			Date d1=new Date();
			int i=0;
			int ch=-1;
			while((ch=reader.read())!=-1) {
				i++;
			}
			Date d2=new Date();
			long t=d2.getTime()-d1.getTime();
			System.out.println("读取"+i+"个字符，不带缓存需要"+t+"毫秒");
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(FileReader reader1=new FileReader("C:\\ch8\\filea.java");
				BufferedReader reader=new BufferedReader(reader1)
				){
			Date d1=new Date();
			int i=0;
			int ch=-1;
			while((ch=reader.read())!=-1) {
				i++;
			}
			Date d2=new Date();
			long t=d2.getTime()-d1.getTime();
			System.out.println("读取"+i+"个字符，带缓存需要"+t+"毫秒");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

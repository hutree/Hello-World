import java.io.*;

public class Test17 {

	public static void main(String[] args) {
		//将一个文件中的内容按行读出，每读出一行就顺序加上行号，并写入另一个文件中
		//使用LineNumberReader类
		try(FileReader reader=new FileReader("C:\\ch8\\filea.java");
				LineNumberReader bufferReader=new LineNumberReader(reader);
				FileWriter writer=new FileWriter("C:\\ch8\\ff.java");
				BufferedWriter bufferWriter=new BufferedWriter(writer)){
			String s=null;
			while((s=bufferReader.readLine())!=null) {
				String str=bufferReader.getLineNumber()+s;
				System.out.println(str);
				bufferWriter.write(str);
				bufferWriter.newLine();
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("file can not found:"+e);
		}catch(IOException e) {
			System.out.println("file read error:"+e);
		}

	}

}

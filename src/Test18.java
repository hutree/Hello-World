import java.io.*;

public class Test18 {

	public static void main(String[] args) {
		//将几个Java类型的数据写到一个文件中，然后再读出来
		File file=new File("C:\\ch8\\ff.java");
		try(FileOutputStream fos=new FileOutputStream(file);
				DataOutputStream outD=new DataOutputStream(fos)){
			outD.writeInt(100);
			outD.writeLong(1234);
			outD.writeFloat(3.14125f);
			outD.writeDouble(123.01322);
			outD.writeBoolean(true);
			outD.writeChars("hello");	
		}catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis=new FileInputStream(file);
				DataInputStream inData=new DataInputStream(fis)){
			System.out.println(inData.readInt());
			System.out.println(inData.readLong());
			System.out.println(inData.readBoolean());
			System.out.println(inData.readDouble());
			System.out.println(inData.readFloat());
			char c;
			while((c=inData.readChar())!='\0') {
				System.out.print(c);
			}
		}catch(IOException e) {
		}
	}

}

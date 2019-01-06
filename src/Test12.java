import java.io.*;

public class Test12 {

	public static void main(String[] args) {
		// 分别使用字节数组流向内存中写入“新年快乐”和“恭喜发财”，然后从内存中读取写入的数据
		try {
			ByteArrayOutputStream outB=new ByteArrayOutputStream();
			byte[] a="新年快乐".getBytes();
			outB.write(a, 0, a.length);
			ByteArrayInputStream inB=new ByteArrayInputStream(outB.toByteArray());
			byte[] b=new byte[a.length];
			inB.read(b);
			System.out.println(new String(b));
			
			CharArrayWriter outC=new CharArrayWriter();
			char[] c="恭喜发财".toCharArray();
			outC.write(c);
			CharArrayReader inC=new CharArrayReader(outC.toCharArray());
			char[] d=new char[c.length];
			inC.read(d);
			System.out.println(new String(d));
		}catch(IOException e) {
			System.out.println(e);
		}
		

	}

}

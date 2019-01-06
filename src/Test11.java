import java.io.*;

public class Test11 {

	public static void main(String[] args) throws IOException {
		// 使用字节数组输入流将字符串abcdefjk转化为大写字母，并输出
		String s="abcdefjk";
		byte[] a=s.getBytes();
	    ByteArrayInputStream bais=new ByteArrayInputStream(a);
			int data=bais.read();
			while(data!=-1) {
				char upper=Character.toUpperCase((char)data);
				System.out.print(upper+" ");
				data=bais.read();
			}
		bais.close();
	}

}

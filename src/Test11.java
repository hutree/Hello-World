import java.io.*;

public class Test11 {

	public static void main(String[] args) throws IOException {
		// ʹ���ֽ��������������ַ���abcdefjkת��Ϊ��д��ĸ�������
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

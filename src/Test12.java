import java.io.*;

public class Test12 {

	public static void main(String[] args) {
		// �ֱ�ʹ���ֽ����������ڴ���д�롰������֡��͡���ϲ���ơ���Ȼ����ڴ��ж�ȡд�������
		try {
			ByteArrayOutputStream outB=new ByteArrayOutputStream();
			byte[] a="�������".getBytes();
			outB.write(a, 0, a.length);
			ByteArrayInputStream inB=new ByteArrayInputStream(outB.toByteArray());
			byte[] b=new byte[a.length];
			inB.read(b);
			System.out.println(new String(b));
			
			CharArrayWriter outC=new CharArrayWriter();
			char[] c="��ϲ����".toCharArray();
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

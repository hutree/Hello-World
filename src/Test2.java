import java.io.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("word.txt");
		try {
			FileOutputStream out= new FileOutputStream(file);
			byte buy[]="����һֻСë¿���Ҵ���Ҳ���".getBytes();
			out.write(buy);
			out.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream in=new FileInputStream(file);
			byte byt[]=new byte[1024];
			int len=in.read(byt);
			System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len));
			in.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

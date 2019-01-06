import java.io.*;

public class Test3 {

	public static void main(String[] args) {
		// �г���ǰĿ¼��ȫ��java�ļ�
		File dir =new File("C:\\ch8");
		FileAccept fileAccept=new FileAccept();
		fileAccept.setExtendName("java");
		String fileName[]=dir.list(fileAccept);
		for(String name:fileName) {
			System.out.println(name);
		}	
	}

}

class FileAccept implements FilenameFilter{
	private String extendName;
	//ΪextendName��ֵ
	public void setExtendName(String s) {
		extendName="."+s;
	}
	public boolean accept(File dir,String name) {
		return name.endsWith(extendName);
	}
}

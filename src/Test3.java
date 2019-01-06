import java.io.*;

public class Test3 {

	public static void main(String[] args) {
		// 列出当前目录下全部java文件
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
	//为extendName赋值
	public void setExtendName(String s) {
		extendName="."+s;
	}
	public boolean accept(File dir,String name) {
		return name.endsWith(extendName);
	}
}

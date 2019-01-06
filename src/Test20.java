import java.io.*;

public class Test20 {

	public static void main(String[] args) {
		// 把几个整数写入到文件中，再按相反的顺序读出这些数据
		RandomAccessFile inAndOut=null;
		int data[]= {1,2,3,4,5,6,7,8};
		try {
			inAndOut=new RandomAccessFile("C:\\ch8\\ff.java","rw");
			for(int i=0;i<data.length;i++) {
				inAndOut.writeInt(data[i]);
			}
			for(long i=data.length-1;i>=0;i--) {
				inAndOut.seek(i*4);
				System.out.printf("%d\t",inAndOut.readInt());
			}
			inAndOut.close();
		}catch(IOException e) {
			
		}

	}

}

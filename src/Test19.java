import java.io.*;

class TV implements Serializable{
	String name;
	int price;
	public void setName(String s){
		name=s;
	}
	public void setPrice(int n) {
		price=n;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

public class Test19 {

	public static void main(String[] args) {
		// ʹ�ö�������дTV�ഴ���Ķ���
		TV changhong=new TV();
		changhong.setName("�������");
		changhong.setPrice(5678);
		File file=new File("C:\\ch8\\ff.java");
		try(FileOutputStream fileOut=new FileOutputStream(file);
				ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
				FileInputStream fileIn=new FileInputStream(file);
				ObjectInputStream objectIn=new ObjectInputStream(fileIn)){
			objectOut.writeObject(changhong);
			objectOut.flush();
			TV xinfei=(TV)objectIn.readObject();
			xinfei.setName("�·ɵ���");
			xinfei.setPrice(6666);
			System.out.println("changhong�����֣�"+changhong.getName());
			System.out.println("changhong�ļ۸�"+changhong.getPrice());
			System.out.println("xinfei������"+xinfei.getName());
			System.out.println("xinfe�ļ۸�"+xinfei.getPrice());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		


	}

}

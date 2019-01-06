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
		// 使用对象流读写TV类创建的对象
		TV changhong=new TV();
		changhong.setName("长虹电视");
		changhong.setPrice(5678);
		File file=new File("C:\\ch8\\ff.java");
		try(FileOutputStream fileOut=new FileOutputStream(file);
				ObjectOutputStream objectOut=new ObjectOutputStream(fileOut);
				FileInputStream fileIn=new FileInputStream(file);
				ObjectInputStream objectIn=new ObjectInputStream(fileIn)){
			objectOut.writeObject(changhong);
			objectOut.flush();
			TV xinfei=(TV)objectIn.readObject();
			xinfei.setName("新飞电视");
			xinfei.setPrice(6666);
			System.out.println("changhong的名字："+changhong.getName());
			System.out.println("changhong的价格："+changhong.getPrice());
			System.out.println("xinfei的名字"+xinfei.getName());
			System.out.println("xinfe的价格"+xinfei.getPrice());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		


	}

}

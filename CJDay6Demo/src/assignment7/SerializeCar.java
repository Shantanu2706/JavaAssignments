package assignment7;

import java.io.*;

public class SerializeCar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Engine engine = new Engine("10",1000);
		Car car = new Car("100","Ford",engine);
		
		FileOutputStream fos = new FileOutputStream("Cardata.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(car);
		oos.close();
		

	}

}

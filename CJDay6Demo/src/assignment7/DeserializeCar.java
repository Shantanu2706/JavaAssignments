package assignment7;

import java.io.*;

public class DeserializeCar {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("Cardata.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Car car = (Car)ois.readObject();
		System.out.println(car.getCarMake() + "\t" + car.getEngine().getCubicCapacity());

	}

}

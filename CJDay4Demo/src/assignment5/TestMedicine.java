package assignment5;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine[] medicines = new Medicine[5];
		for(int i=0 ; i<5 ; i++) {
			int num = (int)Math.ceil(Math.random()*3);
			if(num == 1) {
				medicines[i] = new Tablet();
			}else if(num == 2) {
				medicines[i] = new Syrup();
			}else {
				medicines[i] = new Ointment();
			}
			medicines[i].displayLabel();
		}
		
		

	}

}

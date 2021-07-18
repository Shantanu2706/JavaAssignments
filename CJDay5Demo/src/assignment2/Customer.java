package assignment2;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	
	public Customer() {
		
	}
	
	public Customer(String custNo, String custName, String category) {
		try {
			char[] ch = custNo.toCharArray();
			if(ch[0] == 'c' || ch[0] == 'C') {
				this.custNo = custNo;
			}else {
				throw new InvalidInputException();
			}
			int length = custName.length();
			if(length >= 4) {
				this.custName = custName;
			}else {
				throw new InvalidInputException();
			}
			if(category.equals("Platinum") || category.equals("Gold") || category.equals("Silver")) {
				this.category = category;
			}else {
				throw new InvalidInputException();
			}
			
		}catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}

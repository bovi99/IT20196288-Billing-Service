package com;

public class Bill {



	private int acc_No;
	private String cus_Name;
	private String bill_Amount;
	private String date;
	private String email;
	
	
	
	
	public Bill (int acc_No, String cus_Name, String bill_Amount, String date, String email
			) {
		 
		this.acc_No = acc_No;
		this.cus_Name = cus_Name;
		this.bill_Amount= bill_Amount;
		this.date = date;
		this.email = email;
	
	}



	public int getacc_No() {
		return acc_No;
	}



 


	public String getcus_Name() {
		return cus_Name;
	}


 

	public String getbill_Amount() {
		return bill_Amount;
	}



 


	public String getdate() {
		return date;
	}



 

	public String getemail() {
		return email;
	}



 





	 




 
	
	
	
	
	
	
	
}

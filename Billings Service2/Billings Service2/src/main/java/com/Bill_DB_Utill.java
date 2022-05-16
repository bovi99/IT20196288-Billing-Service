package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


 
public class Bill_DB_Utill {
	 
public static List<Bill>validate(String proID){
	
		
		ArrayList<Bill> bill = new ArrayList<>();
		
		String url="jdbc:mysql://localhost:3306/bill_management";
    	String user="root";
    	String pass="bovini@#";														
																				
																				

		try {
																				
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url,user,pass);
			Statement stmt = (Statement) con.createStatement();
			String sql ="SELECT * FROM bill_management.billing WHERE Acc_No ='"+proID+"' ";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			
			if (rs.next()){
			
				
			
				
				
				int acc_No=rs.getInt(1);
				String cus_Name = rs.getString(2);
				String bill_Amount = rs.getString(3);
				String date = rs.getString(4); 
				String email= rs.getString(5);
			
				 
			
				Bill p = new Bill(acc_No, cus_Name,bill_Amount,date,email);
				Bill.add(p);
			}
			else {
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return bill;
		
	}
	
	
    public static boolean add_bill_management(String acc_No,String cus_Name, String bill_Amount, String date, String email ) {
		
    	boolean isSuccess = false;
    	
    	
    	String url="jdbc:mysql://localhost:3306/bill_management";
    	String user="root";
    	String pass="bovini@#";
    	
    	
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url,user,pass);
			Statement stmt = (Statement) con.createStatement();
			String sql ="INSERT INTO bill_management.billing values(0,'"+cus_Name+"','"+bill_Amount+"','"+date+"','"+email+"' )";
			int rs = stmt.executeUpdate(sql);
			
			
			if (rs>0) {
				
			isSuccess= true;	
				
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
    	
    	
    	
    	
    	
    	return isSuccess;
    	
    }
    
    
    
    
  public static boolean Update_bill(int acc_No,String cus_Name,String bill_Amount, String date, String email) {
		
    	boolean isSuccess = false;
    	
    	
        String url="jdbc:mysql://localhost:3306/bill_management";
     	String user="root";
     	String pass="bovini@#";
    	
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url,user,pass);
			Statement stmt = (Statement) con.createStatement();
			String sql ="update bill_management.billing set cus_Name ='"+cus_Name+"' ,bill_Amount ='"+bill_Amount +"' ,date ='"+date +"' , email='"+email+"' ";
			int rs = stmt.executeUpdate(sql);
		 
			
			
			
			if (rs>0) {
				
			isSuccess= true;	
				
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
    	
    	
    	
    	
    	
    	return isSuccess;
    	
    }
    
    
  

	public static boolean deletebill(int Acc_No) {
		
		int acc_No = Integer.parseInt(Acc_No);
		
		
     boolean isSuccess = false;
		
		

		
     String url="jdbc:mysql://localhost:3306/bill_management";
 	String user="root";
 	String pass="bovini@#";
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection(url,user,pass);
			Statement stmt = (Statement) con.createStatement();
			String sql ="DELETE FROM bill_management.billing where Acc_No ='"+acc_No +"' ";	
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {
				        
			isSuccess= true;	
				
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
		
		
	}
	
	
	
	
    
  
  
  
    
}

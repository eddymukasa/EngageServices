package com.engage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class SignupDao {

	int i = 0;
	int k = 43;
	int result;
	public int saveSignUp(Signup signup) throws ClassNotFoundException{
		String [] fields = signup.getFields();

		PreparedStatement query;
		//System.out.println(query);	  
		System.out.println("Loading driver...");

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded!");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("Cannot find the driver in the classpath!", e);
		}
		System.out.println("Connecting database...");

		try{

			String host = "jdbc:mysql://localhost:3306/engageservices";
			String username = "java";
			String password ="password";
			Connection con = DriverManager.getConnection(host, username	, password);
			query = con.prepareStatement("INSERT INTO Signups VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,     ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,   ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,  ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,   ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");	
			query.setInt(1, signup.getId());
			query.setString(2, signup.getRegion());
			query.setString(3, signup.getFundraiserName());
			query.setString(4, signup.getTeamLeader());
			query.setString(5, signup.getSiteName());
			query.setString(6, signup.getCampaign());
			query.setString(7, signup.getOperations());
			query.setDate(8, signup.getLoginTime());
			query.setString(9, signup.getTitle());
			query.setString(10, signup.getFirstName());
			query.setString(11, signup.getSurname());
			query.setString(12, signup.getPostcode());
			query.setString(13, signup.getHouse());
			query.setString(14, signup.getStreet());
			query.setString(15, signup.getTown());
			query.setString(16, signup.getCounty());
			query.setString(17, signup.getEmail());
			query.setDate(18, signup.getDob());
			query.setBoolean(19, signup.isAgeConsent());
			query.setString(20, signup.getStatus());
			query.setString(21, signup.getPhoneNumber());
			query.setString(22, signup.getLandline());
			query.setBoolean(23, signup.isNoNumberGiven());
			query.setString(24, signup.getAutismConnection());
			query.setString(25, signup.getGender());
			query.setBoolean(26, signup.isGiftAid());
			query.setBoolean(27, signup.isOptInMail());
			query.setBoolean(28, signup.isOptInEmail());
			query.setBoolean(29, signup.isOptInPhone());
			query.setBoolean(30, signup.isOptInSms());
			query.setInt(31, signup.getDonation());
			query.setInt(32, signup.getFrequency());
			query.setInt(33, signup.getStartOn());
			query.setBoolean(34, signup.isSupportAck());
			query.setInt(35, signup.getServiceUserNumber());
			query.setInt(36, signup.getSortcode());
			query.setInt(37, signup.getAccountNumber());
			query.setString(38, signup.getBankName());
			query.setString(39, signup.getAccountName());
			query.setString(40, signup.getSignatureName());
			query.setDate(41, signup.getSignatureDate());
			query.setDate(42, signup.getFormDate());
			System.out.println("position:: "+k+" field:: "+i);
			while(i<200 ){
				query.setString(k, fields[i]);
				i++;
				k++;
				System.out.println("position:: "+k+" field:: "+i);
			}


			result = query.executeUpdate();

			return result;
			//stmt = con.createStatement();
			//int rs = stmt.executeUpdate(query);

		}catch(SQLException ex){
			System.out.println(ex);
			return result;
		}


	}
	
	private boolean checkNotExists(){
		return false;
	}
}

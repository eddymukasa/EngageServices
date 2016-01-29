package com.engage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "edy";
		Signup su = new Signup();
		su.setId(015);
		su.setFundraiserName(x);
		su.setDonation(500);
		SignupDao s = new SignupDao();
		
		try {
			s.saveSignUp(su);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package com.hdfc.banking.insurance.views;

import java.util.Scanner;

import com.hdfc.banking.insurance.dto.LoginDTO;
import com.hdfc.banking.insurance.helper.LoginHelper;

public class LoginUI {
	public void userExist(LoginDTO loginDTO){
		LoginHelper loginHelper = new LoginHelper();
		String message = loginHelper.userExist(loginDTO);
		System.out.println("Your Message is "+message);
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Userid");
	String userid = scanner.next();
	System.out.println("Enter the Password");
	String password = scanner.next();
	LoginDTO loginDTO = new LoginDTO();
	loginDTO.setUserid(userid);
	loginDTO.setPassword(password);
	//System.out.println("Userid is "+userid);
	LoginUI loginUI = new LoginUI();
	loginUI.userExist(loginDTO);
}
}









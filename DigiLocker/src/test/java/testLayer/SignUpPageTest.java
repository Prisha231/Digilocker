package testLayer;

import baseLayer.BaseClass;
import pageLayer.SignUpPage;

public class SignUpPageTest extends BaseClass{

	
	public static void main(String[] args) {
		BaseClass.initialization();
		
		SignUpPage signUpPage =new SignUpPage();
		
		signUpPage.createAccount("Anuja", "25", "May", "2005", "Female", "88888", "anuja@gmail.com", "334433");
		
		
	}
}

package com.hcl;


public class User {

	private String username;
	private String password;
		
		
		public String getusername() {
			return username;
		}

		public void setusername(String username) {
			this.username = username;
		}

		public String getpassword() {
			return password;
		}

		public void setpassword(String password) {
			this.password = password;
		}
		
		public boolean validateUserNamePwd() {

		if(username.equals("sherlockholmes") && password.equals("123")) {
			return true;
			
		}else {
			return false;
		}
	}
	
}

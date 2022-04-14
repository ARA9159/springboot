package com.register.main.entity;

public class Login {
	private String myemail;
	private String pwd;
	public Login() {
		super();
	}
	public String getMyemail() {
		return myemail;
	}
	public void setMyemail(String myemail) {
		this.myemail = myemail;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Login [myemail=" + myemail + ", pwd=" + pwd + "]";
	}
	
	

}
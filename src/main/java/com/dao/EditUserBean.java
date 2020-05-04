package com.dao;

public class EditUserBean {

	
	public String getEditFirstName() {
		return editFirstName;
	}
	public void setEditFirstName(String editFirstName) {
		this.editFirstName = editFirstName;
	}
	public String getEditLastName() {
		return editLastName;
	}
	public void setEditLastName(String editLastName) {
		this.editLastName = editLastName;
	}
	public String getEditEmailAddress() {
		return editEmailAddress;
	}
	public void setEditEmailAddress(String editEmailAddress) {
		this.editEmailAddress = editEmailAddress;
	}
	public String getEditPassword() {
		return editPassword;
	}
	public void setEditPassword(String editPassword) {
		this.editPassword = editPassword;
	}
	private String editFirstName;
	private String editLastName;
	private String editEmailAddress;
	private String editPassword;
}

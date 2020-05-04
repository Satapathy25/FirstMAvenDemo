package com.dao;

import org.apache.commons.lang3.RandomStringUtils;

public class SetData {

	
	public void createUserData(CreateUserBean createUserBean) {
		createUserBean.setEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@gmail.com");
		createUserBean.setFirstName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setLastName(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setPassword("Password@123");
		createUserBean.setAddress(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setCity(RandomStringUtils.randomAlphabetic(5));
		createUserBean.setState("5");
		createUserBean.setZipcode("11111");
		createUserBean.setPhoneNumber(RandomStringUtils.randomNumeric(10));
		createUserBean.setAlias(RandomStringUtils.randomAlphabetic(5));
		
	}
	
	public void setDataForWishList() {
		
	}
	
	
	public void setEditAccountData(EditUserBean editUserBean) {
		editUserBean.setEditFirstName("");
		editUserBean.setEditLastName("");
		editUserBean.setEditEmailAddress("");
		editUserBean.setEditPassword("");
	}
	
	public void setCheckOutDetailsData() {
		
	}
	
	
}

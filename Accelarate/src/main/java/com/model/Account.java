package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_holder")
public class Account {
	private String F_Name;
	private String L_Name;
	private String Email;
	private String phone;
	@Id
	private String Acc_No;
	private String Acc_Balance;
	
	public Account() {
		
	}
	
	public Account(String F_Name,String L_Name,String Email, String phone,String Acc_No,String Acc_Balance) {
		this.F_Name=F_Name;
		this.L_Name=L_Name;
		this.Email = Email;
		this.phone = phone;
		this.Acc_No=Acc_No;
		this.Acc_Balance=Acc_Balance;
	}
	
	public String getF_Name() {
		return F_Name;
	}
	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}
	public String getL_Name() {
		return L_Name;
	}
	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAcc_No() {
		return Acc_No;
	}
	public void setAcc_No(String acc_No) {
		Acc_No = acc_No;
	}
	public String getAcc_Balance() {
		return Acc_Balance;
	}
	public void setAcc_Balance(String acc_Balance) {
		Acc_Balance = acc_Balance;
	}
}


package com.register.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Table(name = "register")
@Entity
public class RegisterEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int accountnum;
	private String type;
	private String fname;
	private String lname;
	private String gname;
	private int age;
	private String dob;
	private long cnum;
	private long anum;
	private String eid;
	private String npsw;
	private String cpsw;
	private String adres;
	private String place;
	private int code;

	public RegisterEntity() {
		super();

	}

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public long getCnum() {
		return cnum;
	}

	public void setCnum(long cnum) {
		this.cnum = cnum;
	}

	public long getAnum() {
		return anum;
	}

	public void setAnum(long anum) {
		this.anum = anum;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getNpsw() {
		return npsw;
	}

	public void setNpsw(String npsw) {
		this.npsw = npsw;
	}

	public String getCpsw() {
		return cpsw;
	}

	public void setCpsw(String cpsw) {
		this.cpsw = cpsw;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	

}

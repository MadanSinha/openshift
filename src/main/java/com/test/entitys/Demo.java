package com.test.entitys;

public class Demo {

	private String firstName = "Madan";
	private String lastName = "Sinha";
	private String emailId = "madan.sinha@brightlysoftware.co.in";
	private String gender="Male";
	private String instance;
	private String envValue;
	private String version="v2";



	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public String getEnvValue() {
		return envValue;
	}
	public void setEnvValue(String envValue) {
		this.envValue = envValue;
	}

}

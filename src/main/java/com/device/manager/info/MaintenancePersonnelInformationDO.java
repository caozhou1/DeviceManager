package com.device.manager.info;

import java.io.Serializable;

public class MaintenancePersonnelInformationDO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String number;
	private String fullName;
	private String gender;
	private String age;
	private String entryTime;
	private String remarks;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setEntryTime(String entryTime) {
		this.entryTime = entryTime;
	}

	public String getEntryTime() {
		return entryTime;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRemarks() {
		return remarks;
	}
}
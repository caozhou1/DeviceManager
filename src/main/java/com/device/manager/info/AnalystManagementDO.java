package com.device.manager.info;

import java.io.Serializable;

public class AnalystManagementDO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String fullName;
	private String age;
	private String post;
	private String condition;
	private String experience;
	private String evaluate;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAge() {
		return age;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPost() {
		return post;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getCondition() {
		return condition;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getExperience() {
		return experience;
	}

	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}

	public String getEvaluate() {
		return evaluate;
	}
}
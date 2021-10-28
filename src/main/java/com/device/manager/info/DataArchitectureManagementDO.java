package com.device.manager.info;

import java.io.Serializable;

public class DataArchitectureManagementDO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String architectureCondition;
	private String architectureLevel;
	private String content;
	private String characteristicSituation;
	private String architecturePersonnel;
	private String schemaStatus;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setArchitectureCondition(String architectureCondition) {
		this.architectureCondition = architectureCondition;
	}

	public String getArchitectureCondition() {
		return architectureCondition;
	}

	public void setArchitectureLevel(String architectureLevel) {
		this.architectureLevel = architectureLevel;
	}

	public String getArchitectureLevel() {
		return architectureLevel;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setCharacteristicSituation(String characteristicSituation) {
		this.characteristicSituation = characteristicSituation;
	}

	public String getCharacteristicSituation() {
		return characteristicSituation;
	}

	public void setArchitecturePersonnel(String architecturePersonnel) {
		this.architecturePersonnel = architecturePersonnel;
	}

	public String getArchitecturePersonnel() {
		return architecturePersonnel;
	}

	public void setSchemaStatus(String schemaStatus) {
		this.schemaStatus = schemaStatus;
	}

	public String getSchemaStatus() {
		return schemaStatus;
	}
}
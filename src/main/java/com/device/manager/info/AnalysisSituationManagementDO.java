package com.device.manager.info;

import java.io.Serializable;

public class AnalysisSituationManagementDO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String analysisTime;
	private String analysisMethod;
	private String characteristicSituation;
	private String conditions;
	private String purposeSituation;
	private String analysisStatus;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setAnalysisTime(String analysisTime) {
		this.analysisTime = analysisTime;
	}

	public String getAnalysisTime() {
		return analysisTime;
	}

	public void setAnalysisMethod(String analysisMethod) {
		this.analysisMethod = analysisMethod;
	}

	public String getAnalysisMethod() {
		return analysisMethod;
	}

	public void setCharacteristicSituation(String characteristicSituation) {
		this.characteristicSituation = characteristicSituation;
	}

	public String getCharacteristicSituation() {
		return characteristicSituation;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getConditions() {
		return conditions;
	}

	public void setPurposeSituation(String purposeSituation) {
		this.purposeSituation = purposeSituation;
	}

	public String getPurposeSituation() {
		return purposeSituation;
	}

	public void setAnalysisStatus(String analysisStatus) {
		this.analysisStatus = analysisStatus;
	}

	public String getAnalysisStatus() {
		return analysisStatus;
	}
}
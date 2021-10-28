package com.device.manager.info;

import java.io.Serializable;

public class DataFeedbackManagementDO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String feedbackMode;
	private String feedbackCharacteristics;
	private String gradeSituation;
	private String content;
	private String conditions;
	private String feedbackPurpose;

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setFeedbackMode(String feedbackMode) {
		this.feedbackMode = feedbackMode;
	}

	public String getFeedbackMode() {
		return feedbackMode;
	}

	public void setFeedbackCharacteristics(String feedbackCharacteristics) {
		this.feedbackCharacteristics = feedbackCharacteristics;
	}

	public String getFeedbackCharacteristics() {
		return feedbackCharacteristics;
	}

	public void setGradeSituation(String gradeSituation) {
		this.gradeSituation = gradeSituation;
	}

	public String getGradeSituation() {
		return gradeSituation;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getConditions() {
		return conditions;
	}

	public void setFeedbackPurpose(String feedbackPurpose) {
		this.feedbackPurpose = feedbackPurpose;
	}

	public String getFeedbackPurpose() {
		return feedbackPurpose;
	}
}
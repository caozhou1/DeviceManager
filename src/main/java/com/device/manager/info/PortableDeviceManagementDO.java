package com.device.manager.info;

import java.io.Serializable;

public class PortableDeviceManagementDO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String number;
	private String name;
	private String type;
	private String maintenanceCycle;
	private String maintainer;
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

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setMaintenanceCycle(String maintenanceCycle) {
		this.maintenanceCycle = maintenanceCycle;
	}

	public String getMaintenanceCycle() {
		return maintenanceCycle;
	}

	public void setMaintainer(String maintainer) {
		this.maintainer = maintainer;
	}

	public String getMaintainer() {
		return maintainer;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRemarks() {
		return remarks;
	}
}
package com.device.manager.service;

import java.util.List;
import java.util.Map;

import com.device.manager.info.DataArchitectureManagementDO;

public interface DataArchitectureManagementService {
	DataArchitectureManagementDO get(Integer id);

	List<DataArchitectureManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(DataArchitectureManagementDO dataArchitectureManagement);

	int update(DataArchitectureManagementDO dataArchitectureManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
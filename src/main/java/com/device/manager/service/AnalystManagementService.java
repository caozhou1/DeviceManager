package com.device.manager.service;

import java.util.List;
import java.util.Map;

import com.device.manager.info.AnalystManagementDO;

public interface AnalystManagementService {
	AnalystManagementDO get(Integer id);

	List<AnalystManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(AnalystManagementDO analystManagement);

	int update(AnalystManagementDO analystManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
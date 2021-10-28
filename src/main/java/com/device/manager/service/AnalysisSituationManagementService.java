package com.device.manager.service;

import java.util.List;
import java.util.Map;

import com.device.manager.info.AnalysisSituationManagementDO;

public interface AnalysisSituationManagementService {
	AnalysisSituationManagementDO get(Integer id);

	List<AnalysisSituationManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(AnalysisSituationManagementDO analysisSituationManagement);

	int update(AnalysisSituationManagementDO analysisSituationManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
package com.device.manager.service;

import java.util.List;
import java.util.Map;

import com.device.manager.info.DataFeedbackManagementDO;

public interface DataFeedbackManagementService {
	DataFeedbackManagementDO get(Integer id);

	List<DataFeedbackManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(DataFeedbackManagementDO dataFeedbackManagement);

	int update(DataFeedbackManagementDO dataFeedbackManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
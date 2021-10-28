package com.device.manager.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.device.manager.info.DataFeedbackManagementDO;

@Mapper
public interface DataFeedbackManagementDao {
	DataFeedbackManagementDO get(Integer id);

	List<DataFeedbackManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(DataFeedbackManagementDO dataFeedbackManagement);

	int update(DataFeedbackManagementDO dataFeedbackManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
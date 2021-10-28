package com.device.manager.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.device.manager.info.AnalystManagementDO;

@Mapper
public interface AnalystManagementDao {
	AnalystManagementDO get(Integer id);

	List<AnalystManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(AnalystManagementDO analystManagement);

	int update(AnalystManagementDO analystManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
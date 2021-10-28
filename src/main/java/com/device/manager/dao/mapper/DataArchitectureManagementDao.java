package com.device.manager.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.device.manager.info.DataArchitectureManagementDO;

@Mapper
public interface DataArchitectureManagementDao {
	DataArchitectureManagementDO get(Integer id);

	List<DataArchitectureManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(DataArchitectureManagementDO dataArchitectureManagement);

	int update(DataArchitectureManagementDO dataArchitectureManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
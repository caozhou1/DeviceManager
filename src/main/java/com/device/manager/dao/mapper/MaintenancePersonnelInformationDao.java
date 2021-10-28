package com.device.manager.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.device.manager.info.MaintenancePersonnelInformationDO;

@Mapper
public interface MaintenancePersonnelInformationDao {
	MaintenancePersonnelInformationDO get(Integer id);

	List<MaintenancePersonnelInformationDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(MaintenancePersonnelInformationDO maintenancePersonnelInformation);

	int update(MaintenancePersonnelInformationDO maintenancePersonnelInformation);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}

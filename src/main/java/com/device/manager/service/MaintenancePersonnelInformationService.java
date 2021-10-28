package com.device.manager.service;

import java.util.List;
import java.util.Map;

import com.device.manager.info.MaintenancePersonnelInformationDO;

public interface MaintenancePersonnelInformationService {
	MaintenancePersonnelInformationDO get(Integer id);

	List<MaintenancePersonnelInformationDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(MaintenancePersonnelInformationDO maintenancePersonnelInformation);

	int update(MaintenancePersonnelInformationDO maintenancePersonnelInformation);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}

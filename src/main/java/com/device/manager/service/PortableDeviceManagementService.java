package com.device.manager.service;

import java.util.List;
import java.util.Map;

import com.device.manager.info.PortableDeviceManagementDO;

public interface PortableDeviceManagementService {
	PortableDeviceManagementDO get(Integer id);

	List<PortableDeviceManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(PortableDeviceManagementDO portableDeviceManagement);

	int update(PortableDeviceManagementDO portableDeviceManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
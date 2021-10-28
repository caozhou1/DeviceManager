package com.device.manager.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.device.manager.info.PortableDeviceManagementDO;

@Mapper
public interface PortableDeviceManagementDao {
	PortableDeviceManagementDO get(Integer id);

	List<PortableDeviceManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(PortableDeviceManagementDO portableDeviceManagement);

	int update(PortableDeviceManagementDO portableDeviceManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
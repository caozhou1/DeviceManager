package com.device.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.manager.dao.mapper.PortableDeviceManagementDao;
import com.device.manager.info.PortableDeviceManagementDO;
import com.device.manager.service.PortableDeviceManagementService;

@Service
public class PortableDeviceManagementServiceImpl implements PortableDeviceManagementService {
	@Autowired
	private PortableDeviceManagementDao portableDeviceManagementDao;

	@Override
	public PortableDeviceManagementDO get(Integer id) {
		return portableDeviceManagementDao.get(id);
	}

	@Override
	public List<PortableDeviceManagementDO> list(Map<String, Object> map) {
		return portableDeviceManagementDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return portableDeviceManagementDao.count(map);
	}

	@Override
	public int save(PortableDeviceManagementDO portableDeviceManagement) {
		return portableDeviceManagementDao.save(portableDeviceManagement);
	}

	@Override
	public int update(PortableDeviceManagementDO portableDeviceManagement) {
		return portableDeviceManagementDao.update(portableDeviceManagement);
	}

	@Override
	public int remove(Integer id) {
		return portableDeviceManagementDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids) {
		return portableDeviceManagementDao.batchRemove(ids);
	}
}
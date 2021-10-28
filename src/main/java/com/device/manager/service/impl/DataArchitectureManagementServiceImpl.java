package com.device.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.manager.dao.mapper.DataArchitectureManagementDao;
import com.device.manager.info.DataArchitectureManagementDO;
import com.device.manager.service.DataArchitectureManagementService;

@Service
public class DataArchitectureManagementServiceImpl implements DataArchitectureManagementService {
	@Autowired
	private DataArchitectureManagementDao dataArchitectureManagementDao;

	@Override
	public DataArchitectureManagementDO get(Integer id) {
		return dataArchitectureManagementDao.get(id);
	}

	@Override
	public List<DataArchitectureManagementDO> list(Map<String, Object> map) {
		return dataArchitectureManagementDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return dataArchitectureManagementDao.count(map);
	}

	@Override
	public int save(DataArchitectureManagementDO dataArchitectureManagement) {
		return dataArchitectureManagementDao.save(dataArchitectureManagement);
	}

	@Override
	public int update(DataArchitectureManagementDO dataArchitectureManagement) {
		return dataArchitectureManagementDao.update(dataArchitectureManagement);
	}

	@Override
	public int remove(Integer id) {
		return dataArchitectureManagementDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids) {
		return dataArchitectureManagementDao.batchRemove(ids);
	}
}
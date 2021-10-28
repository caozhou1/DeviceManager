package com.device.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.manager.dao.mapper.MaintenancePersonnelInformationDao;
import com.device.manager.info.MaintenancePersonnelInformationDO;
import com.device.manager.service.MaintenancePersonnelInformationService;

@Service
public class MaintenancePersonnelInformationServiceImpl implements MaintenancePersonnelInformationService {
	@Autowired
	private MaintenancePersonnelInformationDao maintenancePersonnelInformationDao;

	@Override
	public MaintenancePersonnelInformationDO get(Integer id) {
		return maintenancePersonnelInformationDao.get(id);
	}

	@Override
	public List<MaintenancePersonnelInformationDO> list(Map<String, Object> map) {
		return maintenancePersonnelInformationDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return maintenancePersonnelInformationDao.count(map);
	}

	@Override
	public int save(MaintenancePersonnelInformationDO maintenancePersonnelInformation) {
		return maintenancePersonnelInformationDao.save(maintenancePersonnelInformation);
	}

	@Override
	public int update(MaintenancePersonnelInformationDO maintenancePersonnelInformation) {
		return maintenancePersonnelInformationDao.update(maintenancePersonnelInformation);
	}

	@Override
	public int remove(Integer id) {
		return maintenancePersonnelInformationDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids) {
		return maintenancePersonnelInformationDao.batchRemove(ids);
	}
}
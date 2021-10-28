package com.device.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.manager.dao.mapper.AnalystManagementDao;
import com.device.manager.info.AnalystManagementDO;
import com.device.manager.service.AnalystManagementService;

@Service
public class AnalystManagementServiceImpl implements AnalystManagementService {
	@Autowired
	private AnalystManagementDao analystManagementDao;

	@Override
	public AnalystManagementDO get(Integer id) {
		return analystManagementDao.get(id);
	}

	@Override
	public List<AnalystManagementDO> list(Map<String, Object> map) {
		return analystManagementDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return analystManagementDao.count(map);
	}

	@Override
	public int save(AnalystManagementDO analystManagement) {
		return analystManagementDao.save(analystManagement);
	}

	@Override
	public int update(AnalystManagementDO analystManagement) {
		return analystManagementDao.update(analystManagement);
	}

	@Override
	public int remove(Integer id) {
		return analystManagementDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids) {
		return analystManagementDao.batchRemove(ids);
	}
}
package com.device.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.manager.dao.mapper.AnalysisSituationManagementDao;
import com.device.manager.info.AnalysisSituationManagementDO;
import com.device.manager.service.AnalysisSituationManagementService;

@Service
public class AnalysisSituationManagementServiceImpl implements AnalysisSituationManagementService {
	@Autowired
	private AnalysisSituationManagementDao analysisSituationManagementDao;

	@Override
	public AnalysisSituationManagementDO get(Integer id) {
		return analysisSituationManagementDao.get(id);
	}

	@Override
	public List<AnalysisSituationManagementDO> list(Map<String, Object> map) {
		return analysisSituationManagementDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return analysisSituationManagementDao.count(map);
	}

	@Override
	public int save(AnalysisSituationManagementDO analysisSituationManagement) {
		return analysisSituationManagementDao.save(analysisSituationManagement);
	}

	@Override
	public int update(AnalysisSituationManagementDO analysisSituationManagement) {
		return analysisSituationManagementDao.update(analysisSituationManagement);
	}

	@Override
	public int remove(Integer id) {
		return analysisSituationManagementDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids) {
		return analysisSituationManagementDao.batchRemove(ids);
	}
}
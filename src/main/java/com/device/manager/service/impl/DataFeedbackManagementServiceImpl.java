package com.device.manager.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.device.manager.dao.mapper.DataFeedbackManagementDao;
import com.device.manager.info.DataFeedbackManagementDO;
import com.device.manager.service.DataFeedbackManagementService;

@Service
public class DataFeedbackManagementServiceImpl implements DataFeedbackManagementService {
	@Autowired
	private DataFeedbackManagementDao dataFeedbackManagementDao;

	@Override
	public DataFeedbackManagementDO get(Integer id) {
		return dataFeedbackManagementDao.get(id);
	}

	@Override
	public List<DataFeedbackManagementDO> list(Map<String, Object> map) {
		return dataFeedbackManagementDao.list(map);
	}

	@Override
	public int count(Map<String, Object> map) {
		return dataFeedbackManagementDao.count(map);
	}

	@Override
	public int save(DataFeedbackManagementDO dataFeedbackManagement) {
		return dataFeedbackManagementDao.save(dataFeedbackManagement);
	}

	@Override
	public int update(DataFeedbackManagementDO dataFeedbackManagement) {
		return dataFeedbackManagementDao.update(dataFeedbackManagement);
	}

	@Override
	public int remove(Integer id) {
		return dataFeedbackManagementDao.remove(id);
	}

	@Override
	public int batchRemove(Integer[] ids) {
		return dataFeedbackManagementDao.batchRemove(ids);
	}
}
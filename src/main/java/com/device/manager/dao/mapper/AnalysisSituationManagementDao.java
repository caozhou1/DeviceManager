package com.device.manager.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.device.manager.info.AnalysisSituationManagementDO;

@Mapper
public interface AnalysisSituationManagementDao {
	AnalysisSituationManagementDO get(Integer id);

	List<AnalysisSituationManagementDO> list(Map<String, Object> map);

	int count(Map<String, Object> map);

	int save(AnalysisSituationManagementDO analysisSituationManagement);

	int update(AnalysisSituationManagementDO analysisSituationManagement);

	int remove(Integer id);

	int batchRemove(Integer[] ids);
}
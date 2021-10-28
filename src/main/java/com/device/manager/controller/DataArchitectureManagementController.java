package com.device.manager.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.device.manager.info.DataArchitectureManagementDO;
import com.device.manager.page.PageUtils;
import com.device.manager.page.R;
import com.device.manager.service.DataArchitectureManagementService;

@Controller
@RequestMapping("/Equipmentdatamanagement/dataArchitectureManagement")
public class DataArchitectureManagementController {
	@Autowired
	private DataArchitectureManagementService dataArchitectureManagementService;

	@GetMapping()
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:dataArchitectureManagement")
	String DataArchitectureManagement() {
		return "Equipmentdatamanagement/dataArchitectureManagement/dataArchitectureManagement";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:dataArchitectureManagement")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<DataArchitectureManagementDO> dataArchitectureManagementList = dataArchitectureManagementService
				.list(query);
		int total = dataArchitectureManagementService.count(query);
		PageUtils pageUtils = new PageUtils(dataArchitectureManagementList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:add")
	String add() {
		return "Equipmentdatamanagement/dataArchitectureManagement/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		DataArchitectureManagementDO dataArchitectureManagement = dataArchitectureManagementService.get(id);
		model.addAttribute("dataArchitectureManagement", dataArchitectureManagement);
		return "Equipmentdatamanagement/dataArchitectureManagement/edit";
	}

	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:add")
	public R save(DataArchitectureManagementDO dataArchitectureManagement) {
		if (dataArchitectureManagementService.save(dataArchitectureManagement) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:edit")
	public R update(DataArchitectureManagementDO dataArchitectureManagement) {
		dataArchitectureManagementService.update(dataArchitectureManagement);
		return R.ok();
	}

	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:remove")
	public R remove(Integer id) {
		if (dataArchitectureManagementService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("Equipmentdatamanagement:dataArchitectureManagement:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		dataArchitectureManagementService.batchRemove(ids);
		return R.ok();
	}
}
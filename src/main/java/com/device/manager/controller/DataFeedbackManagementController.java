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

import com.device.manager.info.DataFeedbackManagementDO;
import com.device.manager.page.PageUtils;
import com.device.manager.page.R;
import com.device.manager.service.DataFeedbackManagementService;

@Controller
@RequestMapping("/Equipmentdatamanagement/dataFeedbackManagement")
public class DataFeedbackManagementController {
	@Autowired
	private DataFeedbackManagementService dataFeedbackManagementService;

	@GetMapping()
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:dataFeedbackManagement")
	String DataFeedbackManagement() {
		return "Equipmentdatamanagement/dataFeedbackManagement/dataFeedbackManagement";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:dataFeedbackManagement")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<DataFeedbackManagementDO> dataFeedbackManagementList = dataFeedbackManagementService.list(query);
		int total = dataFeedbackManagementService.count(query);
		PageUtils pageUtils = new PageUtils(dataFeedbackManagementList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:add")
	String add() {
		return "Equipmentdatamanagement/dataFeedbackManagement/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		DataFeedbackManagementDO dataFeedbackManagement = dataFeedbackManagementService.get(id);
		model.addAttribute("dataFeedbackManagement", dataFeedbackManagement);
		return "Equipmentdatamanagement/dataFeedbackManagement/edit";
	}

	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:add")
	public R save(DataFeedbackManagementDO dataFeedbackManagement) {
		if (dataFeedbackManagementService.save(dataFeedbackManagement) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:edit")
	public R update(DataFeedbackManagementDO dataFeedbackManagement) {
		dataFeedbackManagementService.update(dataFeedbackManagement);
		return R.ok();
	}

	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:remove")
	public R remove(Integer id) {
		if (dataFeedbackManagementService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("Equipmentdatamanagement:dataFeedbackManagement:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		dataFeedbackManagementService.batchRemove(ids);
		return R.ok();
	}
}
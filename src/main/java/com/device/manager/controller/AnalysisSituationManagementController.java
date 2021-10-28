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

import com.device.manager.info.AnalysisSituationManagementDO;
import com.device.manager.page.PageUtils;
import com.device.manager.page.R;
import com.device.manager.service.AnalysisSituationManagementService;

@Controller
@RequestMapping("/Dataanalysismanagement/analysisSituationManagement")
public class AnalysisSituationManagementController {
	@Autowired
	private AnalysisSituationManagementService analysisSituationManagementService;

	@GetMapping()
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:analysisSituationManagement")
	String AnalysisSituationManagement() {
		return "Dataanalysismanagement/analysisSituationManagement/analysisSituationManagement";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:analysisSituationManagement")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<AnalysisSituationManagementDO> analysisSituationManagementList = analysisSituationManagementService
				.list(query);
		int total = analysisSituationManagementService.count(query);
		PageUtils pageUtils = new PageUtils(analysisSituationManagementList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:add")
	String add() {
		return "Dataanalysismanagement/analysisSituationManagement/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		AnalysisSituationManagementDO analysisSituationManagement = analysisSituationManagementService.get(id);
		model.addAttribute("analysisSituationManagement", analysisSituationManagement);
		return "Dataanalysismanagement/analysisSituationManagement/edit";
	}

	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:add")
	public R save(AnalysisSituationManagementDO analysisSituationManagement) {
		if (analysisSituationManagementService.save(analysisSituationManagement) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:edit")
	public R update(AnalysisSituationManagementDO analysisSituationManagement) {
		analysisSituationManagementService.update(analysisSituationManagement);
		return R.ok();
	}

	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:remove")
	public R remove(Integer id) {
		if (analysisSituationManagementService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("Dataanalysismanagement:analysisSituationManagement:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		analysisSituationManagementService.batchRemove(ids);
		return R.ok();
	}
}
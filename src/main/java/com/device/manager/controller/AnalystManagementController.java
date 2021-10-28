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

import com.device.manager.info.AnalystManagementDO;
import com.device.manager.page.PageUtils;
import com.device.manager.page.R;
import com.device.manager.service.AnalystManagementService;

@Controller
@RequestMapping("/Dataanalysismanagement/analystManagement")
public class AnalystManagementController {
	@Autowired
	private AnalystManagementService analystManagementService;

	@GetMapping()
	@RequiresPermissions("Dataanalysismanagement:analystManagement:analystManagement")
	String AnalystManagement() {
		return "Dataanalysismanagement/analystManagement/analystManagement";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("Dataanalysismanagement:analystManagement:analystManagement")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<AnalystManagementDO> analystManagementList = analystManagementService.list(query);
		int total = analystManagementService.count(query);
		PageUtils pageUtils = new PageUtils(analystManagementList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("Dataanalysismanagement:analystManagement:add")
	String add() {
		return "Dataanalysismanagement/analystManagement/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("Dataanalysismanagement:analystManagement:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		AnalystManagementDO analystManagement = analystManagementService.get(id);
		model.addAttribute("analystManagement", analystManagement);
		return "Dataanalysismanagement/analystManagement/edit";
	}

	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("Dataanalysismanagement:analystManagement:add")
	public R save(AnalystManagementDO analystManagement) {
		if (analystManagementService.save(analystManagement) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("Dataanalysismanagement:analystManagement:edit")
	public R update(AnalystManagementDO analystManagement) {
		analystManagementService.update(analystManagement);
		return R.ok();
	}

	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("Dataanalysismanagement:analystManagement:remove")
	public R remove(Integer id) {
		if (analystManagementService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("Dataanalysismanagement:analystManagement:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		analystManagementService.batchRemove(ids);
		return R.ok();
	}
}
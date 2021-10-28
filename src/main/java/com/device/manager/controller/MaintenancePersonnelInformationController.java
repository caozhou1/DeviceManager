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

import com.device.manager.info.MaintenancePersonnelInformationDO;
import com.device.manager.page.PageUtils;
import com.device.manager.page.R;
import com.device.manager.service.MaintenancePersonnelInformationService;

@Controller
@RequestMapping("/integratedmanagement/maintenancePersonnelInformation")
public class MaintenancePersonnelInformationController {
	@Autowired
	private MaintenancePersonnelInformationService maintenancePersonnelInformationService;

	@GetMapping()
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:maintenancePersonnelInformation")
	String MaintenancePersonnelInformation() {
		return "integratedmanagement/maintenancePersonnelInformation/maintenancePersonnelInformation";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:maintenancePersonnelInformation")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<MaintenancePersonnelInformationDO> maintenancePersonnelInformationList = maintenancePersonnelInformationService
				.list(query);
		int total = maintenancePersonnelInformationService.count(query);
		PageUtils pageUtils = new PageUtils(maintenancePersonnelInformationList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:add")
	String add() {
		return "integratedmanagement/maintenancePersonnelInformation/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		MaintenancePersonnelInformationDO maintenancePersonnelInformation = maintenancePersonnelInformationService
				.get(id);
		model.addAttribute("maintenancePersonnelInformation", maintenancePersonnelInformation);
		return "integratedmanagement/maintenancePersonnelInformation/edit";
	}

	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:add")
	public R save(MaintenancePersonnelInformationDO maintenancePersonnelInformation) {
		if (maintenancePersonnelInformationService.save(maintenancePersonnelInformation) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:edit")
	public R update(MaintenancePersonnelInformationDO maintenancePersonnelInformation) {
		maintenancePersonnelInformationService.update(maintenancePersonnelInformation);
		return R.ok();
	}

	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:remove")
	public R remove(Integer id) {
		if (maintenancePersonnelInformationService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("integratedmanagement:maintenancePersonnelInformation:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		maintenancePersonnelInformationService.batchRemove(ids);
		return R.ok();
	}
}
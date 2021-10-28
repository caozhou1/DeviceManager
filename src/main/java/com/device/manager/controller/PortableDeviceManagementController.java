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

import com.device.manager.info.PortableDeviceManagementDO;
import com.device.manager.page.PageUtils;
import com.device.manager.page.R;
import com.device.manager.service.PortableDeviceManagementService;

@Controller
@RequestMapping("/integratedmanagement/portableDeviceManagement")
public class PortableDeviceManagementController {
	@Autowired
	private PortableDeviceManagementService portableDeviceManagementService;

	@GetMapping()
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:portableDeviceManagement")
	String PortableDeviceManagement() {
		return "integratedmanagement/portableDeviceManagement/portableDeviceManagement";
	}

	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:portableDeviceManagement")
	public PageUtils list(@RequestParam Map<String, Object> params) {
		// 查询列表数据
		Query query = new Query(params);
		List<PortableDeviceManagementDO> portableDeviceManagementList = portableDeviceManagementService.list(query);
		int total = portableDeviceManagementService.count(query);
		PageUtils pageUtils = new PageUtils(portableDeviceManagementList, total);
		return pageUtils;
	}

	@GetMapping("/add")
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:add")
	String add() {
		return "integratedmanagement/portableDeviceManagement/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:edit")
	String edit(@PathVariable("id") Integer id, Model model) {
		PortableDeviceManagementDO portableDeviceManagement = portableDeviceManagementService.get(id);
		model.addAttribute("portableDeviceManagement", portableDeviceManagement);
		return "integratedmanagement/portableDeviceManagement/edit";
	}

	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:add")
	public R save(PortableDeviceManagementDO portableDeviceManagement) {
		if (portableDeviceManagementService.save(portableDeviceManagement) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:edit")
	public R update(PortableDeviceManagementDO portableDeviceManagement) {
		portableDeviceManagementService.update(portableDeviceManagement);
		return R.ok();
	}

	@PostMapping("/remove")
	@ResponseBody
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:remove")
	public R remove(Integer id) {
		if (portableDeviceManagementService.remove(id) > 0) {
			return R.ok();
		}
		return R.error();
	}

	@PostMapping("/batchRemove")
	@ResponseBody
	@RequiresPermissions("integratedmanagement:portableDeviceManagement:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids) {
		portableDeviceManagementService.batchRemove(ids);
		return R.ok();
	}
}
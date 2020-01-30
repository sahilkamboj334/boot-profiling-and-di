package com.main;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.models.Employee;
import com.main.models.Entity;
//@CrossOrigin(origins = "*")//controller level configuring.
@RestController
public class ResourceController {
	
	@Autowired
	Entity entity;
	//here qualifier injecting it employee
	@Autowired
	@Qualifier("IT")
	Employee emp;
	
	@Resource(name = "gov")
	Employee govemp;
	//to acess from property file
	@Resource(name = "${service.name}")
	Employee govemp1;
	@RequestMapping("/profile")
	public String activeProfile() {
		return entity.toString();
	}
	@RequestMapping("/destroy")
	public String destroyObj() {
		entity=null;
		return "destroyed";
	}
	@RequestMapping("/active/emp")
	public String activeEmp() {
		return emp.detail()+govemp.detail();
	}
}

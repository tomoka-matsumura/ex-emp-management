package jp.co.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Administrator;
import jp.co.sample.form.InsertAdministratorForm;
import jp.co.sample.service.AdministratorService;

@Controller
@RequestMapping("/")
public class AdministratorController {
	
	@Autowired
	private AdministratorService service;
	
	@ModelAttribute
	public InsertAdministratorForm setUpInsertAdministratorForm() {
		InsertAdministratorForm InsertAdministratorForm = new InsertAdministratorForm();
		return InsertAdministratorForm;
	}
	
	@RequestMapping("/toInsert")
	public String toInsert() {
		return"administrator/insert";
	}
	
	@RequestMapping("/insert")
	public String Insert(InsertAdministratorForm form) {
		 Administrator administrator = new Administrator();
		 administrator.getId();
		 administrator.getName();
		 administrator.getMailAddress();
		 administrator.getPassword();
		 return ("/");
		 
	}
	
	
	


	
	

	

}

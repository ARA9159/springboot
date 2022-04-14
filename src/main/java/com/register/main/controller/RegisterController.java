package com.register.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.register.main.entity.Login;
import com.register.main.entity.RegisterEntity;
import com.register.main.service.RegisterService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class RegisterController {
	@Autowired
	private RegisterService eservice;

	@PostMapping("/save")
	public String saveDetails(@RequestBody RegisterEntity cust) {
		System.out.println(cust);
		eservice.saveDetails(cust);
		return new String("sucess");
	}

	@PutMapping("/update")
	public RegisterEntity updateDetails(@RequestBody RegisterEntity cust) {
		return eservice.updateDetails(cust);

	}
	 @GetMapping("/getDetails/{id}")
	    public ResponseEntity<Object> getEmployeeByEId(@PathVariable("id") int id) {

	        RegisterEntity emp = eservice.getDetails(id);
	        if (emp == null) {
	            return new ResponseEntity<Object>("NO DATA FOUND!", HttpStatus.NOT_FOUND);
	        } else {
	            return new ResponseEntity<Object>(emp, HttpStatus.OK);
	        }
	    }
	 @PostMapping("/userlogin")	 
	 public ResponseEntity<String> LoginDetails(@RequestBody Login login) {
		 System.out.println(eservice.LoginDetails(login));
		 if(eservice.LoginDetails(login)) {
			 return new ResponseEntity<String>("Login success",HttpStatus.OK);
		 }
		 else {
			 return new ResponseEntity<String>("Login failed",HttpStatus.NOT_FOUND);
		 }
		
		 
		 
		 
	 }
	 
	 

}
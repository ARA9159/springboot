package com.register.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.main.entity.Login;
import com.register.main.entity.RegisterEntity;
import com.register.main.repository.RegisterRepository;

@Service
public class RegisterService {
	@Autowired
	RegisterRepository erepo;

	public RegisterEntity saveDetails(RegisterEntity cust) {
		return erepo.save(cust);
	}

	public RegisterEntity updateDetails(RegisterEntity cust) {
		return erepo.save(cust);
	}
	
	 public RegisterEntity getDetails(int id) {
	        // TODO Auto-generated method stub
	        
	        java.util.Optional<RegisterEntity> op=erepo.findById(id);
	        if(op.isPresent()) {
	            return op.get();
	        }else {
	            return null;
	        }
	        
	    }
	 public boolean LoginDetails(Login login) {
		 RegisterEntity loginObj= new RegisterEntity();
		 System.out.println(login);
		 loginObj=erepo.findByEid(login.getMyemail());
		 System.out.println(loginObj);
		 if(loginObj != null ) {
			 if(loginObj.getNpsw().equals(login.getPwd())) {
				 System.out.println(login.getPwd()+loginObj.getNpsw());
				 return true;
			 }
			 else {
				 return false;
			 }
			 
		 }
		 else {
			 return false;
		 }
	 }

}
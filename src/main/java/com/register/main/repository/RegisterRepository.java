package com.register.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.register.main.entity.RegisterEntity;

@Repository
public interface RegisterRepository extends CrudRepository<RegisterEntity, Integer> {
	public RegisterEntity findByEid(String email);
}

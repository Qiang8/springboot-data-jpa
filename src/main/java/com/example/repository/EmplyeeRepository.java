package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.domain.Emplyee;

public interface EmplyeeRepository extends JpaRepository<Emplyee, Integer> {
	
	//自定义删除方法
	void deleteByName(String name);

}

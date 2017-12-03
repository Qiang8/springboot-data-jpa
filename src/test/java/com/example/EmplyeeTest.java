package com.example;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.Emplyee;

import service.EmplyeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmplyeeTest {
	
	@Autowired
	private EmplyeeService emplyeeService;
	
	
	@Test
	public void add() {
		emplyeeService.insert();
	}
	@Test
	public void delete() {
		emplyeeService.delete("Dulant7");
	}
	@Test
	public void update() {
		emplyeeService.update();
	}
	@Test
	public void select() {
		Emplyee emp = emplyeeService.select(2);
		System.out.println(emp);
	}
	@Test
	public void select2() {
		List<Emplyee> emp = emplyeeService.select2();
		for (Emplyee emplyee : emp) {
			System.out.println(emplyee);
		}
	}

}

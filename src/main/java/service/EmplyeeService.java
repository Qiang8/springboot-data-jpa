package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Emplyee;
import com.example.repository.EmplyeeRepository;


@Service
public class EmplyeeService {
	
	@Autowired
	private EmplyeeRepository emplyeeRepository;
	
	//增加方法
	public void insert() {
		for (int i = 0; i < 50; i++) {
			Emplyee emp=new Emplyee();
			emp.setId(i+1);
			emp.setName("Dulant"+i);
			emp.setSalary(788+10*i);
			emp.setDeptId(12);
			Emplyee save = emplyeeRepository.save(emp);
		}
	}
	
	//删除方法
	public void delete(String name) {
		emplyeeRepository.deleteByName(name);
	}
	
	//修改方法
	public void update() {
		Emplyee emp=new Emplyee();
		emp.setId(2);
		emp.setName("Hulant");
		emp.setSalary(8888);
		emp.setDeptId(12);
		emplyeeRepository.save(emp);
	}
	
	//查询单个
	public Emplyee select(Integer id) {
		Emplyee emp = emplyeeRepository.findOne(id);
		return emp;
	}
	
	//多个查询
	public List<Emplyee>select2(){
		List<Emplyee> list = emplyeeRepository.findAll();
		return list;
	}
	

	
	
}

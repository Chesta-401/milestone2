package com.customer.model.service;
import com.customer.model.persistence.*;

public class CustomerServiceImpl implements CustomerService {
	CustomerDao cs=new CustomerDaoImpl();
	@Override
	public void addCustomer(Customer c) {
		cs.addCustomer(c); 
	}

	@Override
	public Customer getById(int id) {
		return cs.getById(id);
	}
}

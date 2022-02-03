package com.customer.model.service;
import com.customer.model.persistence.*;

public interface CustomerService {
	public void addCustomer(Customer c);
	public Customer getById(int id);
}

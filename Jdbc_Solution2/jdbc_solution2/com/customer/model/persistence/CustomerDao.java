package com.customer.model.persistence;

public interface CustomerDao {

	public void addCustomer(Customer c);
	public Customer getById(int id);

}

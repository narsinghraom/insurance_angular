package com.insurance.main.dao;

import java.util.List;

import com.insurance.main.bean.CustomerBean;
import com.insurance.main.bean.ZipBean;



public interface DataDao 
{
	public List<ZipBean> getList();  
	public List<String> getZipList(String zip);
	public List<ZipBean> getZipData(String zip);
	public int insertCustomerData(CustomerBean customerBean);
	public int updateCustomerData(CustomerBean customerBean);
	public List<CustomerBean> searchCustomerWithRefID(String customerReferanceId);
	public int deleteCustomerData(String customerReferanceId);
	public List<CustomerBean> getAllCustomers();
}

package com.insurance.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.main.bean.ZipBean;
import com.insurance.main.dao.DataDao;

@Service
public class DataServiceImplementation implements DataService{
	@Autowired  
	 DataDao dataDao;  
	public List<ZipBean> getList() {
		 return dataDao.getList();  
	}
	public List<String> getZipList(String zip) {
		
		return dataDao.getZipList(zip);
	}
	public List<ZipBean> getZipData(String zip) {
		return dataDao.getZipData(zip);
	}

}

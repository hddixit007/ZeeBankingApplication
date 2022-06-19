package com.zee.bank3.dao;

import java.sql.* ;
import org.springframework.beans.factory.annotation.Autowired;
import com.zee.bank3.AppConfig;
public class CustomerDao {
	
	@Autowired
	public Connection con ;
	
	public void test() {
		System.out.println(con);
		System.out.println(it2);
	}
	@Autowired
		private Integer it2 ;
	
}


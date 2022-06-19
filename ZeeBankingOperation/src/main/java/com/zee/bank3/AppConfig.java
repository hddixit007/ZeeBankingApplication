package com.zee.bank3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import org.springframework.context.annotation.Bean;



import com.zee.bank3.beans.Address;
import com.zee.bank3.beans.Customer;
import com.zee.bank3.dao.CustomerDao;



@Configuration
public class AppConfig {



@Bean
@Scope(value="prototype")
public Address getAddress() {
return new Address();
}

@Bean
public Customer getCust() {
return new Customer();
}






@Bean
public CustomerDao getDao() {
return new CustomerDao();
}

@Bean
public JdbcTemplate getjdbctemp() {
return new JdbcTemplate(getDS());
}

@Bean DriverManagerDataSource getDS() {
DriverManagerDataSource datasource=new DriverManagerDataSource("jdbc:mysql://localhost:3306/Test", "root", "Pass@123");
return datasource ;
}

}


package com.zee.bank3;

import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import javax.sql.DataSource;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;



import com.zee.bank3.beans.Address;
import com.zee.bank3.beans.Customer;
import com.zee.bank3.dao.CustomerDao;






public class Test {
public static void main(String[] args) throws SQLException {

// ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
// Customer obj = (Customer) context.getBean("c1");
//
// Address adj=(Address) context.getBean("c2");
//
// System.out.println(obj);

// System.out.println("address types");

ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
Address obj=(Address) context.getBean(Address.class) ;

Address obj2=(Address) context.getBean(Address.class) ;

// System.out.println(obj);

Customer cobj=(Customer) context.getBean(Customer.class);
List<Address> ad=new ArrayList<Address>();
ad.add(obj);
ad.add(obj2);
cobj.setList(ad);
// System.out.println(cobj);



System.out.println("------");
// Connection con=(Connection) context.getBean(Connection.class);
// System.out.println(con);

// CustomerDao.getConFromDao();

// Connection con=(Connection) context.getBean(Connection.class);
// System.out.println(con);


CustomerDao dao=context.getBean(CustomerDao.class);
dao.test();

Integer it=(Integer) context.getBean(Integer.class);
System.out.println(it);

}
}



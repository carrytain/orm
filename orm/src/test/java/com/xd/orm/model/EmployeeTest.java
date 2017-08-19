package com.xd.orm.model;

import org.javalite.activejdbc.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class EmployeeTest {

	/**
	 * @param args
	 */
	final static Logger logger = LoggerFactory.getLogger(EmployeeTest.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboPooledDataSource dataSource=new ComboPooledDataSource("helloC3p0");
		Base.open(dataSource);
		new Employee().set("first_name","abc").set("last_name","efg").saveIt();
		Employee e=(Employee) Employee.findFirst("first_name=?",new String[] {"abc"});
		logger.info("--------------->"+e.getString("last_name"));
	}

}

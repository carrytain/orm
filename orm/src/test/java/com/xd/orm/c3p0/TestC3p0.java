package com.xd.orm.c3p0;

import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class TestC3p0 {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ComboPooledDataSource dataSource=new ComboPooledDataSource("helloC3p0");
		System.out.println(dataSource.getConnection());
	}

}

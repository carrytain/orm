Description:A ORM model use c3p0 pool and ActiveJdbc.

Require:maven install in your system

Useage:
	a.   config src/main/resources/c3p0-config.xml to your db config
	b.   create table in your db:
			CREATE TABLE people (
			  id  int(11) NOT NULL auto_increment PRIMARY KEY,
			  first_name VARCHAR(56) NOT NULL,
			  last_name VARCHAR(56),
			  created_at DATETIME,
			  updated_at DATETIME
			  );
	c.	config your project in myeclipse,details refer http://javalite.io/eclipseIntegration.
	d.	run
	
	
20170819
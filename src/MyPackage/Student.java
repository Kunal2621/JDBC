package MyPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;





public class Student {
public void createDatabase() {
	try {
		String url = "jdbc:mysql://localhost:3306/";
		String userName ="root";
		String password = "Kunal@123";
		Connection conn = DriverManager.getConnection(url, userName, password);
		//Statement Create
		Statement stm = conn.createStatement();
		
		String query = "create database DB";
		// execute
		stm.execute(query);
		System.out.println("connection successfuly"); 
		//close
		conn.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void createTable() {
	
	try {
		String url = "jdbc:mysql://localhost:3306/DB";
		String userName ="root";
		String password = "Kunal@123";
		Connection conn = DriverManager.getConnection(url, userName, password);
		//Statement Create
		Statement stm = conn.createStatement();
		
		String query = "create table  Student(sid int(3),sname varchar(200),semail varchar(200))";
		// execute
		stm.execute(query);
		System.out.println("Table created  successfuly"); 
		//close
		conn.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void createData() {
	// TODO Auto-generated method stub
	try {
		String url = "jdbc:mysql://localhost:3306/DB";
		String userName ="root";
		String password = "Kunal@123";
		Connection conn = DriverManager.getConnection(url, userName, password);
		//Statement Create
		Statement stm = conn.createStatement();
		
		String query = "INSERT into student VALUES(1,'KUNAL','KUNAL@123'),"
				+ "(2,'Prajapati','prajapati@123')";
		// execute
		stm.execute(query);
		System.out.println("data inserted    successfuly"); 
		//close
		conn.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public void readData() {
	// TODO Auto-generated method stub
	try {
		String url = "jdbc:mysql://localhost:3306/DB";
		String userName ="root";
		String password = "Kunal@123";
		Connection conn = DriverManager.getConnection(url, userName, password);
		//Statement Create
		Statement stm = conn.createStatement();
		
		String query = "Select * from student";
		// execute
		stm.execute(query);
		System.out.println("read successfuly"); 
		//close
		conn.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}

public void update() {
	// TODO Auto-generated method stub
	try {
		String url = "jdbc:mysql://localhost:3306/DB";
		String userName ="root";
		String password = "Kunal@123";
		Connection conn = DriverManager.getConnection(url, userName, password);
		//Statement Create
		Statement stm = conn.createStatement();
		
		String query = "UPDATE student set sname = 'KP' WHERE sid = 2";
		// execute
		stm.execute(query);
		System.out.println("data update successfuly"); 
		//close
		conn.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
	
}
	


package com.cts;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Array1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shivam","root", "welcome");
		
		Statement stmt = con.createStatement();
		
		ArrayList<Student1> list = new ArrayList<Student1>();
		ResultSet rs = stmt.executeQuery("select * from student1");
		
		while(rs.next()) {
			Student1 st = new Student1 (rs.getString(1),rs.getInt(2),rs.getDate(3),rs.getBoolean(4));
			list.add(st);
		}
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Student1 ss = (Student1)it.next();
			System.out.println(ss);
		}
		
		con.close();

	}

}

class Student1{
	String name;
	int id;
	Date date;
	boolean flag;
	
	public Student1() {
		
	}
	
	

	public Student1(String name, int id, Date date, boolean flag) {
		super();
		this.name = name;
		this.id = id;
		this.date = date;
		this.flag = flag;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", date=" + date + ", flag=" + flag + "]";
	}
	
}

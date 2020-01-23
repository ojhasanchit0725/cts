package com.cts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) {
		System.out.println("Main..............");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","welcome");
			
			/*
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery("select * from tb1");
			while(set.next()) {
				System.out.println(set.getInt(1)+" , "+set.getString(2)+" , "+set.getInt(3));
			}
			*/
			
			/*
			int id = 844197;
			String name = "JAYESH";
			int age = 23;
			
			String insert = "insert into tb1 values("+id+",'"+name+"',"+age+")";
			stmt.executeUpdate(insert);
			
			int id1 = 844287;
			String name1 = "DIVRIT";
			int age1 = 23;
			
			String insert1 = "insert into tb1 values("+id1+",'"+name1+"',"+age1+")";
			stmt.executeUpdate(insert1);
			*/
			
			
			/*
			String newName = "MANSI";
			int newId = 844249;
			String Update = "UPDATE tb1 set name = '"+newName+"' where id = "+newId+"";
			
			stmt.executeUpdate(Update);
			*/
			
			/*
			String pst = "insert into tb1 values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(pst);
			
			pstmt.setInt(1, 844569);
			pstmt.setString(2, "AMIR");
			pstmt.setInt(3, 23);
			*/
			
			String Update = "UPDATE tb1 set name = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(Update);
			
			pstmt.setString(1, "SHIVAM BANSAL");
			pstmt.setInt(2, 844242);
			
			int re = pstmt.executeUpdate();
			if(re == 1) {
				System.out.println("SUCCESS>>>>>>>>>>>>>>>>");
			}else {
				System.out.println("FAILURE>>>>>>>>>>>>>>>>");
			
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Done..............");

	}

}

package com.revature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Sample1 {
	
	 public static void insert(int id, String name) throws SQLException {
		 
		Connection con = ConnectionUtil.getConnection();
		String sql = "insert into Customer(id,name) values ( ?,?),(?,?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, 706);
		pst.setString(4, "suresh");
		
		
        int rows = pst.executeUpdate();
        System.out.println("No of Rows Inserted:"+rows);
        
       
	}
	 
	 public static void update() throws SQLException {
		  
		 Connection con = ConnectionUtil.getConnection();
		 String sql = "update Customer set name = 'Guna' where id =701";
		 PreparedStatement pst = con.prepareStatement(sql);
		 int rows = pst.executeUpdate();
	      System.out.println("No of Rows Updated:"+rows);
		 
		 
	 }
	 
	 public static void delete() throws SQLException {
		 
		 Connection con = ConnectionUtil.getConnection();
		 String sql = "delete from Customer where name='ramesh' || name='suresh'";
		 PreparedStatement pst = con.prepareStatement(sql);
		 int rows = pst.executeUpdate();
		 System.out.println("No of Rows Deleted:"+rows);
		 
	 }
	 
	 public static void select(int id,String name) throws SQLException {
		 
		 Connection con = ConnectionUtil.getConnection();
		 String sql = "if exists(select * from Customer where id==?, name==?)";
		 PreparedStatement pst = con.prepareStatement(sql);
		 pst.setInt(1, id);
	     pst.setString(2, name);
		 ResultSet rs = pst.executeQuery();
		 System.out.println(rs);
		
			/*while(rs.next()){
			   Integer id1 = rs.getInt("id");
			   String name1 = rs.getString("name");
			   System.out.println(id1 +"-" + name1 );
			}*/
	 }

	
	 
}

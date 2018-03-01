package com.revature.trms.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.revature.trms.beans.Admin;
import com.revature.trms.util.CloseStreams;
import com.revature.trms.util.Connections;

public class AdminDaoService implements AdminDao{

	@Override
	public Admin benCoAdminLog(String username, String password) throws SQLException {
		Statement stmt=null;
		ResultSet rs =null;
		try(Connection conn= Connections.getConnection()){ 
			String sql="SELECT EmployeeId, firstname, lastName FROM Employee WHERE "
					+ "username='"+username
					+"' AND PASSWORD ='" +password+"'";
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			if (rs.next()) {
           Admin emp= new Admin();
           emp.setEmpId(rs.getString(1));
           emp.setFirstName(rs.getString(2));
           emp.setLastname(rs.getString(3));
           emp.setUsername(username);
           emp.setPassword(password);
           
           
           return emp;
			}else return null;
        
       }        
       finally {
    	   CloseStreams.close(stmt);
		   CloseStreams.close(rs);
       }
		
	}

	@Override
	public Admin managerLog(String username, String password) throws SQLException {
	
		Statement stmt=null;
		ResultSet rs =null;
		try(Connection conn= Connections.getConnection()){ 
			String sql="SELECT EmployeeId, firstname, lastName FROM Employee WHERE "
					+ "username='"+username
					+"' AND PASSWORD ='" +password+"'";
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			if (rs.next()) {
           Admin emp= new Admin();
           emp.setEmpId(rs.getString(1));
           emp.setFirstName(rs.getString(2));
           emp.setLastname(rs.getString(3));
           emp.setUsername(username);
           emp.setPassword(password);
           
           
           return emp;
			}else return null;
        
       }        
       finally {
    	   CloseStreams.close(stmt);
		   CloseStreams.close(rs);
       }
	}

	@Override
	public Admin deptHeadLog(String username, String password) throws SQLException {
		
		Statement stmt=null;
		ResultSet rs =null;
		try(Connection conn= Connections.getConnection()){ 
			String sql="SELECT EmployeeId, firstname, lastName FROM Employee WHERE "
					+ "username='"+username
					+"' AND PASSWORD ='" +password+"'";
			
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			if (rs.next()) {
           Admin emp= new Admin();
           emp.setEmpId(rs.getString(1));
           emp.setFirstName(rs.getString(2));
           emp.setLastname(rs.getString(3));
           emp.setUsername(username);
           emp.setPassword(password);
           
           
           return emp;
			}else return null;
        
       }        
       finally {
    	   CloseStreams.close(stmt);
		   CloseStreams.close(rs);
       }
	}

}

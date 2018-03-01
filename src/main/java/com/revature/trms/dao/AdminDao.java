package com.revature.trms.dao;

import java.sql.SQLException;

import com.revature.trms.beans.Admin;

public interface AdminDao {
	public Admin benCoAdminLog(String username,String password) throws SQLException;
	public Admin managerLog(String username, String password) throws SQLException;
	public Admin deptHeadLog(String username, String password) throws SQLException;
	

}

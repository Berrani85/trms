package com.revature.trms.service;

import java.sql.SQLException;

import com.revature.trms.beans.Admin;
import com.revature.trms.dao.AdminDaoService;

public class AdminService {
	private static AdminDaoService adminDS=new AdminDaoService();
	public static Admin authenticationBC(String username, String password) throws SQLException {
		
		return adminDS.benCoAdminLog(username, password);
	}
     public static Admin authenticationMa(String username, String password) throws SQLException {
		
		return adminDS.managerLog(username, password);
	}
     public static Admin authenticationDH(String username, String password) throws SQLException {
 		
 		return adminDS.deptHeadLog(username, password);
 	}
}

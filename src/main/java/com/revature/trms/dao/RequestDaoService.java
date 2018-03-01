/**
 * 
 */
package com.revature.trms.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.revature.trms.beans.Request;
import com.revature.trms.util.CloseStreams;
import com.revature.trms.util.Connections;

import oracle.jdbc.OracleTypes;

/**
 * Requests for reimburesents
 *
 */
public class RequestDaoService implements RequestDao{
    /**
     * Add new reimburesement request
     * @throws SQLException 
     */
	@Override
	public boolean insertRequest(Request req) throws SQLException {
		CallableStatement stmt = null;
		int bool=0;
		try(Connection conn=Connections.getConnection()){
			stmt = conn.prepareCall("{CALL NEW_REQUEST(?,?,?,?,?,?,?,?,?,?)}");
			stmt.setString(1, req.getEmpId());
			
			stmt.setDate(2, new java.sql.Date(req.getStartDate().getTime()));
			stmt.setDate(3, new java.sql.Date(req.getEndDate().getTime()));
			stmt.setDouble(4, req.getCost());
			stmt.setString(5, req.getInstituteName());
			stmt.setString(6, req.getProgramType());
			stmt.setString(7, req.getDescripion());
			stmt.setString(8, req.getLocation());
			stmt.setString(9, req.getJustification());
			stmt.setInt(10, req.getDaysMissed());
			stmt.execute();
			bool=1;
			return (bool==1);
		}
		finally {
			CloseStreams.close(stmt);
		}
		
		
				
	}
    /**
     * retrieve all requests for an employee
     * @throws SQLException 
     */
	@Override
	public ArrayList<Request> selectAllRequests(String username) throws SQLException {
		CallableStatement stmt = null;
		ResultSet rs=null;
		ArrayList<Request> reqs=new ArrayList<Request>();
		try(Connection conn=Connections.getConnection()){
			stmt = conn.prepareCall("{CALL Get_REQUESTS(?,?)}");
			stmt.setString(1, username);
			stmt.registerOutParameter(2, OracleTypes.CURSOR);
			boolean a=stmt.execute();
			System.out.println("the reult form the query"+a);
			rs=(ResultSet) stmt.getObject(2);
			while(rs.next()) {
				Request req=new Request(rs.getInt(1), rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				reqs.add(req);
			
			}
			return reqs;
		}
		finally {
			CloseStreams.close(stmt);
		}		
		
		
	}
    /**
     * retrieve all requests by conserned parties 
     */
	@Override
	public ArrayList<Request> selectAllRequests(String username, String admiUser) {
		
		return null;
	}
	
    
}

/**
 * 
 */
package com.revature.trms.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import com.revature.trms.beans.Request;

public interface RequestDao {
      public boolean insertRequest(Request req) throws SQLException;
      public ArrayList<Request> selectAllRequests(String username) throws SQLException;
      public ArrayList<Request> selectAllRequests(String username, String admiUser);
}

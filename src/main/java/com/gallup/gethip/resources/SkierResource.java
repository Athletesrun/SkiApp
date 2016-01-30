
package com.gallup.gethip.resources;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.gallup.gethip.DataSourceManager;
import com.gallup.gethip.model.Employee;
import com.gallup.gethip.model.User;
import com.gallup.gethip.model.Order;
import com.j256.ormlite.dao.Dao;

// The Java class will be hosted at the URI path "/employee"
@Path("/skier")
public class SkierResource {

    @GET
    @Produces("application/json")
    public Employee getIt(@QueryParam("orderId") String empno) {
    	Employee emp = null;
    	try {
			emp = getDao().queryForId(empno);
			if(emp == null){
				// throw error message
			}else{
				return emp;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
			// throw error message
		}
    	return emp;
    }
    	
    private Dao<Employee, String> getDao(){
    	Dao<Employee, String> dao = DataSourceManager.getInstance().getDao(Employee.class);
    	return dao;
    }
}

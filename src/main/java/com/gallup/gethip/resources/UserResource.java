
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
import com.j256.ormlite.dao.Dao;

// The Java class will be hosted at the URI path "/user"
@Path("/user")
public class UserResource {

    @GET
    @Produces("application/json")
    public User getIt(@QueryParam("userId") String userId) {
    	User user = null;
    	try {
			user = getDao().queryForId(userId);
			if(user == null){
				// throw error message
			}else{
				return user;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
			// throw error message
		}
    	return user;
    }
    
    @DELETE
    @Produces("text/plain")
    public String deleteEmployee(@QueryParam("userId") String userId){
    	try {
			int num = getDao().deleteById(userId);
			if(num == 1){
				return "Delete successful";
			}else{
				return "Unable to delete";
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return "Error in sql statement";
		}
    }
    
    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public User createUser(User user){
    	try {
			User userPrime = getDao().createIfNotExists(user);
			if(userPrime == null){
				// handle error
			}else{
				return userPrime;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return  null;
    }
    
    @PUT
    @Produces("text/plain")
    @Consumes("application/json")
    public String updateUser(User user){
    	try {
			int num = getDao().update(user);
			if(num == 1){
				return "Update successful for employee " + user.getUserId();
			}else{
				return "Could not update " + user.getUserId();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error updating " + user.getUserId();
		}
    }
    	
    private Dao<User, String> getDao(){
    	Dao<User, String> dao = DataSourceManager.getInstance().getDao(User.class);
    	return dao;
    }
}

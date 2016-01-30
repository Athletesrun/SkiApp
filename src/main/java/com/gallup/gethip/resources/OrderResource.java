
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
import com.gallup.gethip.model.Order;
import com.j256.ormlite.dao.Dao;

// The Java class will be hosted at the URI path "/order"
@Path("/order")
public class OrderResource {

    @GET
    @Produces("application/json")
    public Order getIt(@QueryParam("orderId") String orderId) {
    	Order order = null;
    	try {
			order = getDao().queryForId(orderId);
			if(order == null){
				// throw error message
			}else{
				return order;
			}
		} catch (SQLException e) {			
			e.printStackTrace();
			// throw error message
		}
    	return order;
    }
    
    @DELETE
    @Produces("text/plain")
    public String deleteOrder(@QueryParam("orderId") String orderId){
    	try {
			int num = getDao().deleteById(orderId);
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
    public Order createUser(Order order){
    	try {
			Order orderPrime = getDao().createIfNotExists(order);
			if(orderPrime == null){
				// handle error
			}else{
				return orderPrime;
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
    public String updateOrder(Order order){
    	try {
			int num = getDao().update(order);
			if(num == 1){
				return "Update successful for employee " + order.getOrderId();
			}else{
				return "Could not update " + order.getOrderId();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Error updating " + order.getOrderId();
		}
    }
    	
    private Dao<Order, String> getDao(){
    	Dao<Order, String> dao = DataSourceManager.getInstance().getDao(Order.class);
    	return dao;
    }
}

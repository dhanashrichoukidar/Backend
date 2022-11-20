package todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import todo.bean.TaskBean;

public class ToDoModel {
	
	public boolean save(TaskBean bean) {
		boolean result =false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root", "Inception@03");
			
			PreparedStatement stmt = con.prepareStatement("insert into task (title, status, scheduledOn) values(?,?,?)");
			stmt.setString(1,bean.getTitle());
			stmt.setString(2, bean.getStatus());
			stmt.setString(3, bean.getScheduledOn());
		//	stmt.setString(4, bean.setUpdatedOn(updatedOn));
			int count = stmt.executeUpdate();
			result = count>0;
			con.close();
			
			
		}catch (Exception e){
			e.printStackTrace();
		}
		return result;
		
	}
	
	
	public List<TaskBean> getAll() {
		ArrayList<TaskBean> list = new ArrayList<TaskBean>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application","root","Inception@03");
			PreparedStatement stmt = con.prepareStatement("select * from task");
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				TaskBean bean = new TaskBean();
					bean.setId(rs.getInt("id"));
					bean.setTitle(rs.getString("title"));
					bean.setStatus(rs.getString("status"));
					bean.setScheduledOn(rs.getString("scheduledOn"));
					bean.setUpdatedOn(rs.getString("updatedOn"));
				list.add(bean);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public TaskBean getTaskById(int id) {
		TaskBean bean = new TaskBean();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application","root","Inception@03");
			PreparedStatement stmt = con.prepareStatement("select * from task where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setTitle(rs.getString("title"));
				bean.setStatus(rs.getString("status"));
				bean.setScheduledOn(rs.getString("scheduledOn"));
				bean.setUpdatedOn(rs.getString("updatedOn"));
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
 public boolean updateTask(TaskBean bean) {
	 boolean result = false;
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root", "Inception@03");
			
			PreparedStatement stmt = con.prepareStatement("update task set title=?, status=?, scheduledOn=?, updatedOn=?  where id=?  ");
			stmt.setString(1,bean.getTitle());
			stmt.setString(2, bean.getStatus());
			stmt.setString(3, bean.getScheduledOn());
			stmt.setString(4, bean.getUpdatedOn());
			stmt.setInt(5,bean.getId());
			int count = stmt.executeUpdate();
			result = count>0;
			con.close();
	 }catch(Exception e) {
			e.printStackTrace();
		}
	return result;
	 
 }
 
 public boolean deleteTask(int id) {
	 boolean result = false;
	 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application", "root", "Inception@03");
			
			PreparedStatement stmt = con.prepareStatement("delete from task where id=?  ");
			
			stmt.setInt(1, id);
			int count = stmt.executeUpdate();
			result = count>0;
			con.close();
	 }catch(Exception e) {
			e.printStackTrace();
		}
	 
	return result;
	 
 }
 
 public List<TaskBean> getByStatus(String status) {
	
		ArrayList<TaskBean> list = new ArrayList<TaskBean>();
		System.out.println(status);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application","root","Inception@03");
			PreparedStatement stmt = con.prepareStatement("select * from task where status=?");
			stmt.setString(1, status );
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				TaskBean bean = new TaskBean();
					bean.setId(rs.getInt("id"));
					bean.setTitle(rs.getString("title"));
					bean.setStatus(rs.getString("status"));
					bean.setScheduledOn(rs.getString("scheduledOn"));
					bean.setUpdatedOn(rs.getString("updatedOn"));
				list.add(bean);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
 
 public List<TaskBean> getByDate(String scheduledOn) {
		
		ArrayList<TaskBean> list = new ArrayList<TaskBean>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application","root","Inception@03");
			PreparedStatement stmt = con.prepareStatement("select * from task where scheduledOn=?");
			stmt.setString(1, scheduledOn );
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				TaskBean bean = new TaskBean();
					bean.setId(rs.getInt("id"));
					bean.setTitle(rs.getString("title"));
					bean.setStatus(rs.getString("status"));
					bean.setScheduledOn(rs.getString("scheduledOn"));
					bean.setUpdatedOn(rs.getString("updatedOn"));
				list.add(bean);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
 
 public List<TaskBean> getByUpdatedDate(String updatedOn) {
		
		ArrayList<TaskBean> list = new ArrayList<TaskBean>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Application","root","Inception@03");
			PreparedStatement stmt = con.prepareStatement("select * from task where updatedOn=?");
			stmt.setString(1, updatedOn );
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				TaskBean bean = new TaskBean();
					bean.setId(rs.getInt("id"));
					bean.setTitle(rs.getString("title"));
					bean.setStatus(rs.getString("status"));
					bean.setScheduledOn(rs.getString("scheduledOn"));
					bean.setUpdatedOn(rs.getString("updatedOn"));
				list.add(bean);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
 
}
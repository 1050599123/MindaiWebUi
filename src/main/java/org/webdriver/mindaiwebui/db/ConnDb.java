package org.webdriver.mindaiwebui.db;
import  java.sql.*;
import java.util.ArrayList;

import org.webdriver.mindaiwebui.utils.Log;
import org.webdriver.mindaiwebui.db.ReadProperties;
public class ConnDb {
	private Log log=new Log(this.getClass());
	public  Connection getConn(String DataBaseName)	{
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbcUrl = "jdbc:mysql://116.62.173.3:3306/"
				+ DataBaseName+"?characterEncoding=utf-8&useSSL=false";
		String username = "test_admin";
		String password = "7HuowaffDtoVtc58yiAw";
		Connection conn = null;
		try {
			Class.forName(driver); //classLoader,加载对应驱动
			conn = DriverManager.getConnection(jdbcUrl, username, password);
			log.info("连接数据库成功");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void main(String[] args)
	{
		ConnDb connDb=new ConnDb();
	//	jdbcutil connDb=new jdbcutil();
		
		Connection connection=connDb.getConn("mdtx_business");
		String sql="SELECT * from  account_tender WHERE user_id in (SELECT id from mdtx_user.user_basic_info WHERE phone='13928755754' ) ";
		ArrayList<String> hospitaList=new ArrayList<String>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			
			 while(rs.next()){//遍历结果集                               
		            System.out.println("用户id:"+rs.getString("user_id")+"账户余额:"+rs.getString("amount"));
		            }
		          if(rs !=null){
		            try{
		                rs.close();
		            } catch (SQLException e){
		            e.printStackTrace();
		           }
		        }
		     }catch(Exception e){
		       e.printStackTrace();
		     }
							
			
		//return null;
	}
  
}



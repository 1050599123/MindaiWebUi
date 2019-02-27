package org.webdriver.mindaiwebui.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.webdriver.mindaiwebui.db.jdbcutil;

public class CodeTable {
	String baseSQL="select substring(contents,8,6) as abstract from phone_smslog ";
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		CodeTable CodeTable=new CodeTable();			
	}
	/**
	 * 获取数据库短信验证码表的短信验证码
	 * @param Phone 查询的电话号码条件
	 * @return  返回短信验证码
	 */
	public String CheckSelectCodeForMoblePhoneResult(String Phone)
	{
		Connection connection = jdbcutil.getConn("mdtx_msg");
	//	Connection connection=connDb.getConn("mdtx_msg");
		String sql=baseSQL+" where Phone='"+Phone+"'ORDER BY create_time DESC  limit 1 ";
		System.out.println("获取注册短信验证码"+sql);
		String smsCode="";
		try {
			PreparedStatement preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery(sql);			
			if(rs.first()) {
				System.out.println("短信验证码:"+rs.getString("abstract"));
				smsCode=rs.getString("abstract");			
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
		return smsCode;

	}
	   
}

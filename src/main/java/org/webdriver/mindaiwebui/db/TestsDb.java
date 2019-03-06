package org.webdriver.mindaiwebui.db;
import  java.sql.*;


public class TestsDb {
//	private Log log=new Log(this.getClass());
	public static void main(String[] args)
	{	
		String sql="SELECT * from  account_tender WHERE user_id in (SELECT id from mdtx_user.user_basic_info WHERE phone='13928755754' ) ";
		try {	
		//	ConnDb connDb=new ConnDb();				
		//	Connection conn=connDb.getConn("mdtx_business");
			Connection conn = jdbcutil.getConn("mdtx_business");
			Statement stmt=conn.createStatement(); 
			ResultSet rs=stmt.executeQuery(sql);//执行sql语句并返还结束			
			//preparedStatement = (PreparedStatement)connection.prepareStatement(sql);
			//ResultSet rs = preparedStatement.executeQuery();
			
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



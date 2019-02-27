package org.webdriver.mindaiwebui.db;

import java.sql.*;
import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;

import org.apache.log4j.Logger;

public class jdbcutil {
    private static String DRIVER_CLASS;
    private static String URL;
    private static String USERRNAME;
    private static String PASSWORD;
    private static Properties p=new Properties(); 
    static{
        try {
           // FileInputStream fis=new FileInputStream("\\db.properties");
            InputStream fis = jdbcutil.class.getResourceAsStream("/db.properties"); // 打开配置文件
            p.load(fis); // 从输入流中读取属性列表
            //读取信息
            DRIVER_CLASS=p.getProperty("driverClass");
            URL=p.getProperty("jdbcUrl");
            USERRNAME=p.getProperty("username");
            PASSWORD=p.getProperty("password");
            Class.forName(DRIVER_CLASS);
            fis.close(); // 关闭资源
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("驱程程序注册出错");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
   
    public static Connection getConn(String DataBaseName){
    	
        Connection conn=null;
        try{
        conn=DriverManager.getConnection(URL+ DataBaseName+"?characterEncoding=utf-8&useSSL=false", USERRNAME, PASSWORD);
        System.out.println("连接数据库成功");
        }
        catch (Exception e) {
                e.printStackTrace();
            }
         return conn;
       }
  //释放数据库连接
    public static void close(Connection conn) {
          try {
              if (conn != null)
                   conn.close();
             } catch (Exception e) {
               e.printStackTrace();
             }
         }
      }
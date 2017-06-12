package org.webdriver.mindaiwebui.db;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.testng.*;

/**
 * <Description> 加载系统配置文件
 * 
 * @author hepeng
 * @version 1.0
 * @CreateDate 2017年3月17日 
 * 
 */
public class ReadProperties {

	public static Properties props = getProperties();

	// 根据参数获取配置文件中的对应的值
	public static String getProperty(String property) {
		return props.getProperty(property);
	}

	// 读取配置文件
	public static Properties getProperties() {
		Properties prop = new Properties();
		try {
			InputStream file = ReadProperties.class.getClassLoader().getResourceAsStream("db.properties");// 打开配置文件
			prop.load(file);// 从输入流中读取属性列表
			file.close();// 关闭资源
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}
	
}

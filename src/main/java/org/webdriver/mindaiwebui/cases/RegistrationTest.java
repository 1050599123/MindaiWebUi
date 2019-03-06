package org.webdriver.mindaiwebui.cases;

import org.webdriver.mindaiwebui.action.SignoutAction;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.*;
import org.webdriver.mindaiwebui.db.*;
import org.openqa.selenium.Alert;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;  
import org.testng.annotations.Parameters;
import org.webdriver.mindaiwebui.action.RegistrationAction;
import org.webdriver.mindaiwebui.utils.*;

import java.io.IOException;

    public class RegistrationTest extends TestBaseCase {  
		  private Logger logger = Logger.getLogger(RegistrationTest.class);
		  ElementAction action=new ElementAction();	  
		   @DataProvider(name="longinData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
			   String filePath="src/main/resources/data/ExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
			   return ExcelReadUtil.case_data_excel(1, 1, 1, 2, 5,filePath);
			}
		   
	    @Test(description="注册失败用例",dataProvider = "longinData")
	    public void RegistrationAction( String regName,String regPass,String inviter,String message) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","BaseUrl");			
			//调用注册方法
			new RegistrationAction(BaseUrl+"/register.html",regName,regPass,inviter);
			action.sleep(1);   
			//调用退出方法
			new SignoutAction(); 
			//设置检查点
		//	Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);
			//设置断言
		// 	Assertion.VerityError();


	    } 
	      

	  
	}  
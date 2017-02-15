package org.webdriver.mindaiwebui.cases;

import org.webdriver.mindaiwebui.action.UpAction;
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
import org.webdriver.mindaiwebui.action.LoginAction;
import org.webdriver.mindaiwebui.utils.*;
import java.io.IOException;

    public class LoginTest extends TestBaseCase {  
		  private Logger logger = Logger.getLogger(LoginTest.class);
		  ElementAction action=new ElementAction();
		  	
		  @Test(description="登录成功测试")
		  @Parameters({"BaseUrl"})//读取testng.xml参数
			public void login(String BaseUrl) throws IOException
			{	
				//调用登录方法，输入正确的用户名和密码
		  		LoginAction loginAction=new LoginAction(BaseUrl+"/login.html","13928755754","123456","123456");
				action.sleep(2);
				//设置检查点
				Assertion.VerityTextPresentPrecision("13928755754","输入正确的用户名和密码，验证是否成功进入主页");
				//设置用例断言，判断用例是否失败
				Assertion.VerityError();
			}
			//数据驱动案例--start
	  
		   @DataProvider(name="longinData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
			   String filePath="src/main/resources/data/ExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
			   return ExcelReadUtil.case_data_excel(1, 1, 4, 1, 4,filePath);
			}
		   
	    @Test(description="发标失败用例",dataProvider = "longinData")
	    public void Login( String userName,String password,String imgCode,String message) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","BaseUrl");			
			//调用登录方法
			LoginAction loginAction=new LoginAction(BaseUrl+"/login.html",userName,password,imgCode);
			action.sleep(1);   
			//设置检查点
			Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);
			//设置断言
		 	Assertion.VerityError();


	    } 
	      

	  
	}  
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
import org.webdriver.mindaiwebui.action.LoginAction;
import org.webdriver.mindaiwebui.action.AccountAction;
import org.webdriver.mindaiwebui.action.RechargeAction;
import org.webdriver.mindaiwebui.action.SignoutAction;
import org.webdriver.mindaiwebui.utils.*;
	
    public class LoginTest1 extends TestBaseCase {  
		  private Logger logger = Logger.getLogger(LoginTest1.class);
		  ElementAction action=new ElementAction();
	  
		   @DataProvider(name="longinData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
			   String filePath="src/main/resources/data/ExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
			   return ExcelReadUtil.case_data_excel(1, 1, 1, 1, 12,filePath);
			}
		   
	    @Test(description="测试用例",dataProvider = "longinData")
	    public void Login( String userName,String password,String imgCode,String regName,String cardId,String bankCard,String Province,String region,String phone,String smsCode,String money,String message) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","BaseUrl");	
			//调用登录方法
			LoginAction loginAction=new LoginAction(BaseUrl+"/login.html",userName,password,imgCode);
			action.sleep(1); 
			//调用开户方法
            AccountAction AccountAction=new AccountAction(regName, cardId, bankCard, Province, region, phone, smsCode);
			action.sleep(3); 
			//调用充值方法
			RechargeAction RechargeAction=new RechargeAction(money,smsCode); 
			action.sleep(1); 
			//调用退出方法
			SignoutAction SignoutAction=new SignoutAction(); 
			//设置检查点 
		//	Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);
		//	action.sleep(1); 
		//	Assertion.VerityTextdb(message,"检查数据库用户表是否存在该电话号码的用户信息:"+message);
			//Assertion.VerityText(locator, exceptText);
		    
			//设置断言
		// 	Assertion.VerityError();


	    }  
	      

	  
	}  
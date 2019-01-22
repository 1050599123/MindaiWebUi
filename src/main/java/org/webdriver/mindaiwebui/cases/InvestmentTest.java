package org.webdriver.mindaiwebui.cases;

import org.webdriver.mindaiwebui.utils.*;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;  
import org.webdriver.mindaiwebui.action.LoginAction;
import org.webdriver.mindaiwebui.action.InvestmentAction;
import org.webdriver.mindaiwebui.action.SignoutAction;
	
    public class InvestmentTest extends TestBaseCase {  
		  ElementAction action=new ElementAction();
	  
		   @DataProvider(name="longinData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
			   String filePath="src/main/resources/data/ExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
			   return ExcelReadUtil.case_data_excel(4, 1, 8, 1, 6,filePath);
			}
		   
	    @Test(description="测试用例",dataProvider = "longinData")
	    public void Login( String userName,String password,String imgCode,String amount,String smsCode,String message) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","BaseUrl");	
			//调用登录方法
			new LoginAction(BaseUrl+"/login.html",userName,password,imgCode);
			action.sleep(1); 
			//调用投资方法方法
			new InvestmentAction(amount,smsCode);		
			action.sleep(1); 
			//调用退出方法
			new SignoutAction(); 
			//设置检查点
		//	Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);
		    
			//设置断言
		// 	Assertion.VerityError();


	    }  
	      

	  
	}  
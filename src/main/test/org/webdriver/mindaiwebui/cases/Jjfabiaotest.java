package org.webdriver.mindaiwebui.cases;

import org.webdriver.mindaiwebui.action.UpAction;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;  
import org.webdriver.mindaiwebui.action.LoginAction;
import org.webdriver.mindaiwebui.utils.*;
	
    public class Jjfabiaotest extends TestBaseCase {  
		  private Logger logger = Logger.getLogger(Jjfabiaotest.class);
		  ElementAction action=new ElementAction();
	  
		   @DataProvider(name="JjfabiaoData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
				String filePath="src/main/resources/data/ExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第18列之间的数据
				return ExcelReadUtil.case_data_excel(0, 1, 32, 1, 18,filePath);
			}
		   
	    @Test(description="发标失败用例",dataProvider = "JjfabiaoData")
	    public void ts( String realName,String cardId,String bankCardNo,String phone,String orderId ,String  channel , String product,String amount,String interestRate, String isPreReceiveRate,String platformReceiveServiceRate, String borrowStyle,String borrowTermType,String borrowTermUnit, String borrowTerm, String borrowExpireDate,String address, String message) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","BaseUrl");		
			//调用发标方法
			UpAction upAction=new UpAction(BaseUrl,realName,cardId,bankCardNo,phone,orderId,channel,product,amount,interestRate,isPreReceiveRate,platformReceiveServiceRate,borrowStyle,borrowTermType,borrowTermUnit,borrowTerm,borrowExpireDate,address,message);
			action.sleep(2);   
			//设置检查点
		    Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);		    
			//设置断言
		 	Assertion.VerityError();
	    }  
	      

	  
	}  
package org.webdriver.mindaiwebui.cases;


import org.webdriver.mindaiwebui.utils.*;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;  
import org.webdriver.mindaiwebui.action.RechargeAction;
import org.webdriver.mindaiwebui.action.RegistrationAction;
import org.webdriver.mindaiwebui.action.SignoutAction;
import org.webdriver.mindaiwebui.action.joyreachadsAction;
import org.webdriver.mindaiwebui.action.XwAccountAction;
	
    public class Openaccount extends TestBaseCase {  
		  private Logger logger = Logger.getLogger(Openaccount.class);
		  ElementAction action=new ElementAction();
	  
		   @DataProvider(name="longinData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
			   String filePath="src/main/resources/data/ExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
			   return ExcelReadUtil.case_data_excel(1, 1, 1, 2, 12,filePath);
			}
		   
	    @Test(description="测试用例",dataProvider = "longinData")
	    public void Login( String userName,String password,String inviter,String regName,String cardId,String bankCard,String phone, String smsCode, String ppassword, String confirmPassword,String money) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","BaseUrl");	
			//调用登录方法
		//	new joyreachadsAction(BaseUrl+"/login.html",userName,password);
			//调用注册方法
			new RegistrationAction(BaseUrl+"/register.html",userName,password,inviter);
			action.sleep(1); 
			//调用开户方法
            new XwAccountAction(regName,cardId,bankCard,phone, smsCode, password, confirmPassword);
			action.sleep(1); 
			//调用充值方法
		//	new RechargeAction(money,ppassword); 
			action.sleep(3); 
			//调用退出方法
			new SignoutAction(); 
			//设置检查点 
		//	Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);
		//	action.sleep(1); 
	
		    
			//设置断言
		// 	Assertion.VerityError();


	    }  
	      

	  
	}  
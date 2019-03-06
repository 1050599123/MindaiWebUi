package org.webdriver.mindaiwebui.cases;

import org.webdriver.mindaiwebui.action.LoanLoginAction;
import org.webdriver.mindaiwebui.action.SignoutAction;
import org.webdriver.mindaiwebui.utils.*;
import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;  
import org.webdriver.mindaiwebui.action.LoanRegistrationAction;


    public class LoanRegistrationTest extends TestBaseCase {  
		  ElementAction action=new ElementAction();	  
		   @DataProvider(name="longinData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
			   String filePath="src/main/resources/data/ExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
			   return ExcelReadUtil.case_data_excel(2, 1, 1, 1, 4,filePath);
			}
		   
	    @Test(description="注册失败用例",dataProvider = "longinData")
	    public void LoanRegistration( String method,String regName,String regPass,String message) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","LoanUrl");	
			 if(method.equals("借款人")){
					//调用登录方法
					new LoanRegistrationAction(BaseUrl+"borrower/index.html#/register",regName,regPass);
	           }
	            else if(method.equals("担保机构")){
	            	//调用登录方法
	 				new LoanRegistrationAction(BaseUrl+"security/index.html#/login",regName,regPass);
	            }
	            else if(method.equals("合作机构")){
	             	//调用登录方法
	  				new LoanRegistrationAction(BaseUrl+"partner/index.html#/login",regName,regPass);
	            }
	
			action.sleep(3);   
			//设置检查点
		//	Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);
			//设置断言
		// 	Assertion.VerityError();


	    } 
	      

	  
	}  
package org.webdriver.mindaiwebui.cases;


import org.webdriver.mindaiwebui.utils.*;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;  
import org.testng.annotations.Parameters;
import org.webdriver.mindaiwebui.action.*;


import java.io.IOException;

	    public class Registertest extends TestBaseCase {  
			  private Logger logger = Logger.getLogger(Registertest.class);
			  ElementAction action=new ElementAction();
			  BaseAction baseActionaction=new BaseAction();	
			  @Test(description="首页测试")
			  @Parameters({"BaseUrl"})//读取testng.xml参数
				public void login(String BaseUrl) throws IOException
				{	
					//调用登录方法，输入正确的用户名和密码
			  		//LoginAction loginAction=new LoginAction(BaseUrl+"/login.html","13928755754","123456","123456");
				    new HomeAction(BaseUrl+"/index.html");
					action.sleep(2);
					//设置检查点
					Assertion.VerityURL("http://121.196.208.139:3030/register.html","验证是否成功进入注册页面");
					//设置用例断言，判断用例是否失败
					Assertion.VerityError();
				}
				//数据驱动案例--start
		  
			/*   @DataProvider(name="longinData")
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


		    } */ 
		      

		  
		}  
package org.webdriver.mindaiwebui.houTaiTestcases;

import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.webdriver.mindaiwebui.action.HouTaiLoginAction;
import org.webdriver.mindaiwebui.utils.Assertion;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.ExcelReadUtil;
import org.webdriver.mindaiwebui.utils.TestBaseCase;
import org.webdriver.mindaiwebui.utils.XmlReadUtil;




public class HouTai_Login extends TestBaseCase {
	
	 private Logger logger = Logger.getLogger(HouTai_Login.class);
	  ElementAction action=new ElementAction();
 
	   @DataProvider(name="houtaiLogin")
		public Object[][] houtaiLogin()
		{
			//读取登录用例测试数据 
		   String filePath="src/main/resources/data/sueExcelTests.xls";
			//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
		   return ExcelReadUtil.case_data_excel(0, 1, 4, 1, 4,filePath);
		}
	
	
  @Test(description="后台用户登陆",dataProvider = "houtaiLogin")
  public void houtaiTaiLogin(String userName,String loginPassword,String valicode,String message) throws Exception, DocumentException{ 
	  
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testng.xml","HouTaiUrl");	
			System.out.println("登陆用户名"+userName);
			//调用登录方法http://121.196.208.139:8085/admin/index/login
			HouTaiLoginAction houtaiLoginAction=new HouTaiLoginAction(BaseUrl+"admin/index/login",userName,loginPassword,valicode);
			action.sleep(1);   
			//设置检查点
			Assertion.VerityTextPresent(message,"验证是否出现预期的错误提示信息:"+message);
			//设置断言
		 	Assertion.VerityError();

	    }  
  }


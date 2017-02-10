package org.webdriver.mindaiwebui.cases;

import org.webdriver.mindaiwebui.action.fabiaoAction;
import org.webdriver.mindaiwebui.pageObject.HomePage;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import javax.swing.AbstractAction;

import org.apache.log4j.Logger;
import org.dom4j.DocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;  
import org.testng.annotations.Test;
import org.webdriver.mindaiwebui.action.HtLoginAction;
import org.webdriver.mindaiwebui.utils.*;
	
    public class fabiaotest extends TestBaseCase {  
		  private Logger logger = Logger.getLogger(fabiaotest.class);
		  ElementAction action=new ElementAction();

	  
		   @DataProvider(name="testData")
			public Object[][] loginData()
			{
				//读取登录用例测试数据 
				String filePath="src/main/resources/data/lrjExcelTests.xls";
				//读取第一个sheet，第2行到第5行-第2到第4列之间的数据
				return ExcelReadUtil.case_data_excel(0, 1, 1, 1, 16,filePath);
			}
		   
	    @Test(description="发标用例",dataProvider = "testData")
	    public void ts(String userName, String amount,String interestRate,String borrowTerm ,String receive, String repay,
	    		String borrowNote, String borrowerBreachRate, String fixed_day, String investorReceiveAdvanceRate,
	    		String investorReceiveAdvanceDay, String platformReceivePayRate, String platformReceiveGuaranteeRate, 
	    		String platformReceiveConsultingRate, String platformReceiveCommissionRate, String platformReceiveServiceRate) throws Exception, DocumentException{ 
			//代替testng参数化的方法
			String BaseUrl= XmlReadUtil.getTestngParametersValue("testing/lirenjie/testng.xml","BaseUrl");	
			
			 /***************************登录*********************/
			//调用登录方法，输入正确的用户名和密码
			new HtLoginAction(BaseUrl+"/admin/index/login","lirenjie" ,"123456","5781");
			action.sleep(2);
			//设置检查点
			Assertion.VerityTextPresentPrecision("存管后台","输入正确的用户名和密码，验证是否成功进入主页");
			//设置用例断言，判断用例是否失败
			Assertion.VerityError();
			
			 /***************************发标*********************/
			
		    //点击资金管理顶部菜单
		    driver.findElement(By.xpath(".//*[@id='main_menu']/li[3]/a")).click();
		    //点击资产发标菜单
		    driver.findElement(By.xpath(".//*[@id='wnav']/div[1]/div[2]/ul/li/a")).click();
		    //点击 添加
		    driver.switchTo().frame(0);  //1.用frame的index来定位，第一个是0    
		    driver.findElement(By.xpath("(//a[@id='project_list_add']/span/span)[2]")).click();
	    
		    //从frame中切回主文档
		    driver.switchTo().defaultContent();  
		    //切换发标的frame
		    driver.switchTo().frame(1);
			
			//调用发标方法
			new fabiaoAction(userName, amount,interestRate,borrowTerm,receive,repay,borrowNote,borrowerBreachRate,fixed_day,investorReceiveAdvanceRate,
		    		investorReceiveAdvanceDay, platformReceivePayRate, platformReceiveGuaranteeRate, 
		    		platformReceiveConsultingRate, platformReceiveCommissionRate, platformReceiveServiceRate);

			action.sleep(1);   
		    //从frame中切回主文档
		    driver.switchTo().defaultContent();  
			//设置检查点
		    Assertion.VerityTextPresent("资产发标","保存成功后，验证是否成功返回资金发标查询页面");		    
			//设置断言
		 	Assertion.VerityError();
	    }  
	    



	  
	}  
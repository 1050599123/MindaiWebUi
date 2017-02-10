package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;
import org.webdriver.mindaiwebui.pageObject.FabiaoPage;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

/**
 * Created by lirenjie on 2017/2/10 15:40 .
 */
public class fabiaoAction extends TestBaseCase{
    public fabiaoAction(String userName, String amount,String interestRate,String borrowTerm ,String receive, String repay,
    		String borrowNote, String borrowerBreachRate, String fixed_day, String investorReceiveAdvanceRate,
    		String investorReceiveAdvanceDay, String platformReceivePayRate, String platformReceiveGuaranteeRate, 
    		String platformReceiveConsultingRate, String platformReceiveCommissionRate, String platformReceiveServiceRate) throws Exception{ 
    	//此driver变量继承自TestBase变量
    	FabiaoPage fabiaoPage=new FabiaoPage();

    //	fabiaoPage.open(Url);
    	System.out.println(driver.getCurrentUrl());
    	ElementAction action=new ElementAction();
    	
    	action.clear(fabiaoPage.借款人用户名输入框());
        action.type(fabiaoPage.借款人用户名输入框(),userName);
		action.sleep(1);
		
        action.click(fabiaoPage.选择是新手标());   
    	action.clear(fabiaoPage.借款金额输入框());
        action.type(fabiaoPage.借款金额输入框(),amount);
    	action.clear(fabiaoPage.借款利率输入框());
        action.type(fabiaoPage.借款利率输入框(),interestRate);
        
        action.click(fabiaoPage.期限类型选择());
        action.click(fabiaoPage.固定期限选择());   
        
        action.clear(fabiaoPage.借款期限输入框());
        action.type(fabiaoPage.借款期限输入框(),borrowTerm);
        action.click(fabiaoPage.业务类型选择());
        action.click(fabiaoPage.选择民担保());
        
        action.click(fabiaoPage.勾选代收账户());
        action.clear(fabiaoPage.代收账户输入框());
        action.type(fabiaoPage.代收账户输入框(),receive);
		action.sleep(1);
        
        action.click(fabiaoPage.勾选代还账户());
        action.clear(fabiaoPage.代还账户输入框());
        action.type(fabiaoPage.代还账户输入框(),receive);
		action.sleep(1);
        
//        action.click(fabiaoPage.勾选标题是否自动());
//        action.click(fabiaoPage.标题选择否());
//        action.clear(fabiaoPage.标题输入框());
//        action.type(fabiaoPage.标题输入框(),projectName);
//		action.sleep(1);
        
        action.clear(fabiaoPage.备注输入框());
        action.type(fabiaoPage.备注输入框(),borrowNote);
		action.sleep(1);
        
        action.click(fabiaoPage.投资人利息为前置扣费());
        
        action.clear(fabiaoPage.借款人提前还款违约金费率());
        action.type(fabiaoPage.借款人提前还款违约金费率(),borrowerBreachRate);
        
        action.clear(fabiaoPage.借款人提前还款违约金天数());
        action.type(fabiaoPage.借款人提前还款违约金天数(),fixed_day);
        
        action.clear(fabiaoPage.投资人提前还款补偿金费率());
        action.type(fabiaoPage.投资人提前还款补偿金费率(),investorReceiveAdvanceRate);
        
        action.clear(fabiaoPage.投资人提前还款补偿金天数());
        action.type(fabiaoPage.投资人提前还款补偿金天数(),investorReceiveAdvanceDay);
        
        action.click(fabiaoPage.借款费用扣收为前置扣费());
		action.sleep(1);
        
        action.clear(fabiaoPage.支付费率());
        action.type(fabiaoPage.支付费率(),platformReceivePayRate);
        
        action.clear(fabiaoPage.担保费率());
        action.type(fabiaoPage.担保费率(),platformReceiveGuaranteeRate);
        
        action.clear(fabiaoPage.咨询费率());
        action.type(fabiaoPage.咨询费率(),platformReceiveConsultingRate);
        
        action.clear(fabiaoPage.佣金费率());
        action.type(fabiaoPage.佣金费率(),platformReceiveCommissionRate);
        
        action.clear(fabiaoPage.平台服务费率());
        action.type(fabiaoPage.平台服务费率(),platformReceiveServiceRate);
        
        
        action.click(fabiaoPage.保存按钮());
	    assertEquals(closeAlertAndGetItsText(), "保存成功");
	    
	    
        

        
    //    String comment = driver.findElement(By.xpath("/html/body")).getText().trim();	

   /*     if(comment.indexOf(message) != -1)  
        {  
             System.out.println("包含"+message); 
             System.out.println(""); 
        } else{
 		System.out.println("期望结果：[" + message+ "] 实际结果[" + comment + "]"); 
        }*/
    }
    
   private boolean acceptNextAlert = true;
	 
    private String closeAlertAndGetItsText() {
	      try {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        if (acceptNextAlert) {
	          alert.accept();
	        } else {
	          alert.dismiss();
	        }
	        return alertText;
	      } finally {
	        acceptNextAlert = true;
	      }
	    }
	      
}

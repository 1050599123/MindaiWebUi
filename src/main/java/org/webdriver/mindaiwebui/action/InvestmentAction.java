package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.JjFabiaoPage;
import org.webdriver.mindaiwebui.pageObject.InvestmentPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class InvestmentAction extends TestBaseCase{
    public InvestmentAction(String amount,String smsCode ) throws IOException
    {
        //此driver变量继承自TestBase变量
    	InvestmentPage InvestmentPage=new InvestmentPage();
        ElementAction action=new ElementAction(); 
        action.click(InvestmentPage.我要投资按钮());
        action.click(InvestmentPage.立即去投资按钮());
        action.clear(InvestmentPage.投资金额输入框());
        action.type(InvestmentPage.投资金额输入框(),amount);
        action.sleep(1);
        action.click(InvestmentPage.立即投资按钮());
        action.sleep(1);
      //  action.clear(InvestmentPage.短信验证码输入框());
        action.type(InvestmentPage.短信验证码输入框(),smsCode);
        action.sleep(1);
        action.click(InvestmentPage.确认投资按钮());
        action.sleep(3);
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
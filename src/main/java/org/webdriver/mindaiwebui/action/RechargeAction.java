package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.RechargePage;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class RechargeAction extends TestBaseCase{
    public RechargeAction(String money,String smsCode ) throws IOException
    {
        //此driver变量继承自TestBase变量
    	RechargePage RechargePage=new RechargePage();
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction(); 
        action.click(RechargePage.我的账户());
        action.click(RechargePage.充值按钮());
        action.clear(RechargePage.充值金额输入框());
        action.type(RechargePage.充值金额输入框(),money);
        action.clear(RechargePage.短信验证码输入框());
        action.type(RechargePage.短信验证码输入框(),smsCode);   
        action.click(RechargePage.提交按钮());
        action.sleep(3);       
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
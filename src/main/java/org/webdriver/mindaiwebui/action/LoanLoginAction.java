package org.webdriver.mindaiwebui.action;


import org.webdriver.mindaiwebui.pageObject.LoanLoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class LoanLoginAction extends TestBaseCase{
    public LoanLoginAction(String Url,String userName,String password ) throws IOException
    {
        //此driver变量继承自TestBase变量
    	LoanLoginPage LoanloginPage=new LoanLoginPage();
    	LoanloginPage.open(Url);
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();     
        action.clear(LoanloginPage.用户名输入框());
        action.type(LoanloginPage.用户名输入框(),userName);
      //  System.out.println("当前文本:"+action.getAttribute(loginPage.用户名输入框(),"value"));
        action.clear(LoanloginPage.密码输入框());
        action.type(LoanloginPage.密码输入框(),password);
        action.sleep(1);
        action.Javascriptclick(LoanloginPage.登录按钮());
        action.sleep(3);
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
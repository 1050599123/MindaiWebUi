package org.webdriver.mindaiwebui.action;

import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class joyreachadsAction extends TestBaseCase{
    public joyreachadsAction(String Url,String userName,String password  ) throws IOException
    {
        //此driver变量继承自TestBase变量
        LoginPage loginPage=new LoginPage();
        ElementAction action=new ElementAction();  
        loginPage.open(Url);
        action.clear(loginPage.用户名输入框());
        action.type(loginPage.用户名输入框(),userName);
        action.clear(loginPage.密码输入框());
        action.type(loginPage.密码输入框(),password); 
        String imgCode=action.Getgraphicscode(loginPage.图形验证码());
        action.clear(loginPage.验证码输入框());
        action.type(loginPage.验证码输入框(),imgCode);        
        action.click(loginPage.登录按钮());   
       // action.sleep(1);
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
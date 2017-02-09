package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.JjFabiaoPage;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class LoginAction extends TestBaseCase{
    public LoginAction(String Url,String userName,String password ,String imgCode ) throws IOException
    {
        //此driver变量继承自TestBase变量
        LoginPage loginPage=new LoginPage();
        loginPage.open(Url);
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();     
        action.clear(loginPage.用户名输入框());
        action.type(loginPage.用户名输入框(),userName);
        action.clear(loginPage.密码输入框());
        action.type(loginPage.密码输入框(),password);
        action.clear(loginPage.验证码输入框());
        action.type(loginPage.验证码输入框(),imgCode);
        action.sleep(1);
        action.click(loginPage.登录按钮());
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
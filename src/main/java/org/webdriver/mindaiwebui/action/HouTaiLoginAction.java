package org.webdriver.mindaiwebui.action;

import java.io.IOException;

import org.webdriver.mindaiwebui.pageObject.HouTai_LoginPage;
import org.webdriver.mindaiwebui.pageObject.HtLoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;


public class HouTaiLoginAction extends TestBaseCase {

	public HouTaiLoginAction(String Url,String userName,String password ) throws IOException
    {
        //此driver变量继承自TestBase变量
		HtLoginPage loginPage=new HtLoginPage();
		 loginPage.open(Url);
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();     
        action.clear(loginPage.用户名输入框());
        action.type(loginPage.用户名输入框(),userName);
        action.clear(loginPage.密码输入框());
        action.type(loginPage.密码输入框(),password);
        String imgCode=action.Getgraphicscode(loginPage.图形验证码());
         action.clear(loginPage.验证码输入框());
        action.type(loginPage.验证码输入框(),imgCode);
        action.sleep(1);
        action.click(loginPage.登录按钮());
      
    }
}

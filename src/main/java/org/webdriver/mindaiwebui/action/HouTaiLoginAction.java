package org.webdriver.mindaiwebui.action;

import java.io.IOException;

import org.webdriver.mindaiwebui.pageObject.HouTai_LoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;


public class HouTaiLoginAction extends TestBaseCase {

	public HouTaiLoginAction(String Url,String userName,String password ,String imgCode ) throws IOException
    {
        //此driver变量继承自TestBase变量
		HouTai_LoginPage HouTai_LoginPage=new HouTai_LoginPage();
 
        HouTai_LoginPage.open(Url);
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();     
        action.clear(HouTai_LoginPage.后台登陆用户名输入框());
        action.type(HouTai_LoginPage.后台登陆用户名输入框(),userName);
        action.clear(HouTai_LoginPage.后台密码输入框());
        action.type(HouTai_LoginPage.后台密码输入框(),password);
        action.clear(HouTai_LoginPage.后台验证码输入框());
        action.type(HouTai_LoginPage.后台验证码输入框(),imgCode);
        action.sleep(1);
        action.click(HouTai_LoginPage.后台登录按钮());
    }
}

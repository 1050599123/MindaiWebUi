package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.HtLoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;
import org.webdriver.mindaiwebui.pageObject.FabiaoPage;
import java.io.IOException;

/**
 * Created by lirenjie on 2017/2/10 15:40 .
 */
public class HtLoginAction extends TestBaseCase{
    public HtLoginAction(String Url,String userName,String password ,String imgCode ) throws IOException
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
        action.clear(loginPage.验证码输入框());
        action.type(loginPage.验证码输入框(),imgCode);
        action.sleep(1);
        action.click(loginPage.登录按钮());
    }
 
}
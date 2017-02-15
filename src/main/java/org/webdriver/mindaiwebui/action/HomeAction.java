package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.pageObject.HomePage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.*;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class HomeAction extends TestBaseCase{
    public HomeAction(String Url ) throws IOException
    {
        //此driver变量继承自TestBase变量
    	HomePage homePage=new HomePage();
    	LoginPage loginPage=new LoginPage();
        loginPage.open(Url);
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();
        BaseAction baseActionaction=new BaseAction(); 
      //  action.switchToFrame(homePage.首页按钮());
        action.click(homePage.首页按钮());
        action.sleep(1);
        action.click(homePage.我要投资按钮());
        action.sleep(1);
        action.click(homePage.下载APP按钮());
        action.sleep(1);
        action.click(homePage.安全保障按钮());
        action.sleep(1);
        action.click(homePage.帮助中心按钮());
        action.sleep(1);
        action.click(homePage.登录按钮());
        action.sleep(1);
        baseActionaction.back();
        action.click(homePage.返回普通版系统());
        action.sleep(1);
        baseActionaction.back();
        action.click(homePage.注册按钮());
        action.sleep(1);
     //   action.clear(homePage.帮助中心按钮());
     //   action.sleep(1);
     // action.click(loginPage.登录按钮());
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
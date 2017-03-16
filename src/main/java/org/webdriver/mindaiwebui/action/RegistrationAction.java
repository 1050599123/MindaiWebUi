package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.db.CodeTable;
import org.webdriver.mindaiwebui.pageObject.JjFabiaoPage;
import org.webdriver.mindaiwebui.pageObject.Registrationpage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class RegistrationAction extends TestBaseCase{
    public RegistrationAction(String Url,String regName,String regPass ,String imgCode,String inviter ) throws IOException
    {
        //此driver变量继承自TestBase变量
    	Registrationpage Registrationpage=new Registrationpage();
    	CodeTable CodeTable = new CodeTable();
    	Registrationpage.open(Url);
        System.out.println(driver.getCurrentUrl());
        ElementAction action=new ElementAction();     
        action.clear(Registrationpage.注册用户名输入框());
        action.type(Registrationpage.注册用户名输入框(),regName);
        action.clear(Registrationpage.注册密码输入框());
        action.type(Registrationpage.注册密码输入框(),regPass);
        action.clear(Registrationpage.图形验证码输入框());
        action.type(Registrationpage.图形验证码输入框(),imgCode);
        action.click(Registrationpage.获取短信验证码());
        String smsCode=CodeTable.CheckSelectCodeForMoblePhoneResult(regName);
        action.sleep(2);
        action.clear(Registrationpage.短信验证码输入框());
        action.type(Registrationpage.短信验证码输入框(),smsCode);
        action.clear(Registrationpage.推荐人输入框());
        action.type(Registrationpage.推荐人输入框(),inviter);
        action.sleep(1);
        action.click(Registrationpage.立即注册按钮());
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
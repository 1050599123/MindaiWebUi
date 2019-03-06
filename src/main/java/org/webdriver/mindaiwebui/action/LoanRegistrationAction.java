package org.webdriver.mindaiwebui.action;


import org.webdriver.mindaiwebui.db.CodeTable;
import org.webdriver.mindaiwebui.pageObject.LoanRegistrationpage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * userName 用户名
 * password 密码
 * imgCode  验证码
 */
public class LoanRegistrationAction extends TestBaseCase{
    public LoanRegistrationAction(String Url,String regName,String regPass ) throws IOException
    {
        //此driver变量继承自TestBase变量
    	LoanRegistrationpage LoanRegistrationpage=new LoanRegistrationpage();
    	CodeTable CodeTable = new CodeTable();
    	LoanRegistrationpage.open(Url);
        ElementAction action=new ElementAction();     
        action.clear(LoanRegistrationpage.注册用户名输入框());
        action.type(LoanRegistrationpage.注册用户名输入框(),regName);
        action.Javascriptclick(LoanRegistrationpage.下一步按钮());
       // action.Javascriptclick(LoanRegistrationpage.获取短信验证码());
        String smsCode=CodeTable.CheckSelectCodeForMoblePhoneResult(regName);
        action.sleep(2);
        action.clear(LoanRegistrationpage.短信验证码输入框());
        action.type(LoanRegistrationpage.短信验证码输入框(),smsCode);
        action.clear(LoanRegistrationpage.注册密码输入框());
        action.type(LoanRegistrationpage.注册密码输入框(),regPass);
        action.sleep(3);
        action.Javascriptclick(LoanRegistrationpage.完成注册按钮());
     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
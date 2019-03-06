package org.webdriver.mindaiwebui.action;

import java.io.IOException;

import org.webdriver.mindaiwebui.pageObject.LoanAccountPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;
public class XwLoanAccountAction extends TestBaseCase {



	public  XwLoanAccountAction(String regName,String cardId,String bankCard,String phone, String smsCode, String ppassword, String confirmPassword) throws IOException
	{
		//此driver变量继承自TestBase变量
		LoanAccountPage LoanAccountPage=new LoanAccountPage();

		//System.out.println(driver.getCurrentUrl());
		ElementAction action=new ElementAction();
		action.Javascriptclick(LoanAccountPage.个人开户());
		action.clear(LoanAccountPage.真实姓名输入框());
		action.type(LoanAccountPage.真实姓名输入框(),regName);
		action.clear(LoanAccountPage.身份证号输入框());
		action.type(LoanAccountPage.身份证号输入框(),cardId);
		action.sleep(1);
		action.Javascriptclick(LoanAccountPage.下一步按钮());
		action.sleep(1);
		action.clear(LoanAccountPage.银行卡号输入框());
		action.type(LoanAccountPage.银行卡号输入框(),bankCard);
		action.clear(LoanAccountPage.银行卡预留手机号输入框());
		action.type(LoanAccountPage.银行卡预留手机号输入框(),phone);
		action.Javascriptclick(LoanAccountPage.发送验证码());
		action.Javascriptclick(LoanAccountPage.我知道了());
		action.clear(LoanAccountPage.短信验证码输入框());
		action.type(LoanAccountPage.短信验证码输入框(),smsCode);
		action.sleep(1);
		action.executeJS("var q=document.documentElement.scrollTop=100000");
		action.sleep(1);
		action.clear(LoanAccountPage.交易密码输入框());
		action.type(LoanAccountPage.交易密码输入框(),ppassword);
		action.clear(LoanAccountPage.确认密码输入框());
		action.type(LoanAccountPage.确认密码输入框(),confirmPassword);
		action.Javascriptclick(LoanAccountPage.同意协议确定注册按钮());
	}
	
}

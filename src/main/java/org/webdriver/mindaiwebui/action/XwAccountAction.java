package org.webdriver.mindaiwebui.action;

import java.io.IOException;

import org.webdriver.mindaiwebui.pageObject.AccountPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;
import org.webdriver.mindaiwebui.pageObject.RechargePage;
public class XwAccountAction extends TestBaseCase {



	public  XwAccountAction(String regName,String cardId,String bankCard,String phone, String smsCode, String ppassword, String confirmPassword) throws IOException
	{
		//此driver变量继承自TestBase变量
		AccountPage AccountPage=new AccountPage();
		RechargePage RechargePage=new RechargePage();
		//System.out.println(driver.getCurrentUrl());
		ElementAction action=new ElementAction();
		if(!action.isElementDisplayed(RechargePage.立即开通按钮())){
			action.click(RechargePage.充值按钮());
		  }
		action.click(RechargePage.立即开通按钮());
		action.clear(AccountPage.真实姓名输入框());
		action.type(AccountPage.真实姓名输入框(),regName);
		action.clear(AccountPage.身份证号输入框());
		action.type(AccountPage.身份证号输入框(),cardId);
		action.sleep(1);
		action.click(AccountPage.下一步按钮());
		action.sleep(1);
		action.executeJS("var q=document.documentElement.scrollTop=100000");
		action.sleep(2);
		action.clear(AccountPage.银行卡号输入框());
		action.type(AccountPage.银行卡号输入框(),bankCard);
		action.clear(AccountPage.银行卡预留手机号输入框());
		action.type(AccountPage.银行卡预留手机号输入框(),phone);
		action.click(AccountPage.发送验证码());
		action.click(AccountPage.我知道了());
		action.clear(AccountPage.短信验证码输入框());
		action.type(AccountPage.短信验证码输入框(),smsCode);
		action.clear(AccountPage.交易密码输入框());
		action.type(AccountPage.交易密码输入框(),ppassword);
		action.clear(AccountPage.确认密码输入框());
		action.type(AccountPage.确认密码输入框(),confirmPassword);
		action.click(AccountPage.同意协议确定注册按钮());
	}
	
}

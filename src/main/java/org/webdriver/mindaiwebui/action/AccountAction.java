package org.webdriver.mindaiwebui.action;

import java.io.IOException;

import org.webdriver.mindaiwebui.pageObject.AccountPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

public class AccountAction extends TestBaseCase {



	public  AccountAction(String regName,String cardId,String bankCard,String Province,String region,String phone,String smsCode) throws IOException
	{
		//此driver变量继承自TestBase变量
		AccountPage AccountPage=new AccountPage();
		System.out.println(driver.getCurrentUrl());
		ElementAction action=new ElementAction();
		action.clear(AccountPage.真实姓名输入框());
		action.type(AccountPage.真实姓名输入框(),regName);
		action.clear(AccountPage.身份证号输入框());
		action.type(AccountPage.身份证号输入框(),cardId);
		action.clear(AccountPage.银行卡号输入框());
		action.type(AccountPage.银行卡号输入框(),bankCard);
		action.click(AccountPage.银行卡预留手机号输入框());
		action.sleep(3);
		action.selectByText(AccountPage.选择省份(), Province);
		action.click(AccountPage.银行卡预留手机号输入框());
		action.sleep(3);
		action.selectByText(AccountPage.选择地区(), region);
		action.clear(AccountPage.银行卡预留手机号输入框());
		action.type(AccountPage.银行卡预留手机号输入框(),phone);
		action.clear(AccountPage.短信验证码输入框());
		action.type(AccountPage.短信验证码输入框(),smsCode);
		action.click(AccountPage.开通存管账户按钮());

	}
	
}

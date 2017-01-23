package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.FabiaoPage;
import org.webdriver.mindaiwebui.pageObject.LoginPage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;
/**
 * orderId 订单号
 * amount 借款金额
 * interestRate  借款利率
 * borrowTerm  借款期限
 * realName  真实姓名
 * cardId  身份证号
 * bankCardName  银行名称
 * bankCardNo  银行卡号
 * logisticsCompany  物流公司
 * waybillNo  运单号
 * phone   借款人联系方式
 */
public class UpAction extends TestBaseCase{
    public UpAction(String Url, String orderId,String amount,String interestRate,String borrowTerm , String realName ,String  cardId , String bankCardName, String bankCardNo, String logisticsCompany,  String waybillNo, String phone ,String message) throws Exception{ 
    	//此driver变量继承自TestBase变量
    	FabiaoPage fabiaoPage=new FabiaoPage();
    	fabiaoPage.open(Url);
    	System.out.println(driver.getCurrentUrl());
    	ElementAction action=new ElementAction();
    	action.clear(fabiaoPage.订单号输入框());
        action.type(fabiaoPage.订单号输入框(),orderId);
    	action.clear(fabiaoPage.借款金额输入框());
        action.type(fabiaoPage.借款金额输入框(),amount);
    	action.clear(fabiaoPage.借款利率输入框());
        action.type(fabiaoPage.借款利率输入框(),interestRate);
        action.clear(fabiaoPage.借款期限输入框());
        action.type(fabiaoPage.借款期限输入框(),borrowTerm);
        action.clear(fabiaoPage.真实姓名输入框());
        action.type(fabiaoPage.真实姓名输入框(),realName);
		action.clear(fabiaoPage.身份证号输入框());
        action.type(fabiaoPage.身份证号输入框(),cardId);
		action.clear(fabiaoPage.银行名称输入框());
        action.type(fabiaoPage.银行名称输入框(),bankCardName);
        action.clear(fabiaoPage.银行卡号输入框());
        action.type(fabiaoPage.银行卡号输入框(),bankCardNo);
		action.clear(fabiaoPage.物流公司输入框());
        action.type(fabiaoPage.物流公司输入框(),logisticsCompany);
	    action.clear(fabiaoPage.运单号输入框());
        action.type(fabiaoPage.运单号输入框(),waybillNo);
		action.clear(fabiaoPage.借款人联系方式输入框());
        action.type(fabiaoPage.借款人联系方式输入框(),phone);
        action.click(fabiaoPage.提交按钮());
        
    //    String comment = driver.findElement(By.xpath("/html/body")).getText().trim();	

   /*     if(comment.indexOf(message) != -1)  
        {  
             System.out.println("包含"+message); 
             System.out.println(""); 
        } else{
 		System.out.println("期望结果：[" + message+ "] 实际结果[" + comment + "]"); 
        }*/
    }
}

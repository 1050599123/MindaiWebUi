package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.JjFabiaoPage;
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
    public UpAction(String Url, String realName,String cardId,String bankCardNo,String phone , String orderId ,String  channel , String product,  String amount, String interestRate, String isPreReceiveRate,  String platformReceiveServiceRate, String borrowStyle,String borrowTermType,String borrowTermUnit, String borrowTerm, String borrowExpireDate,String address, String message) throws Exception{ 
    	//此driver变量继承自TestBase变量
    	JjFabiaoPage fabiaoPage=new JjFabiaoPage();
    	fabiaoPage.open(Url);
    	System.out.println(driver.getCurrentUrl());
    	ElementAction action=new ElementAction();
    	action.clear(fabiaoPage.真实姓名输入框());
        action.type(fabiaoPage.真实姓名输入框(),realName);
    	action.clear(fabiaoPage.身份证号输入框());
        action.type(fabiaoPage.身份证号输入框(),cardId);
    	action.clear(fabiaoPage.银行卡号输入框());
        action.type(fabiaoPage.银行卡号输入框(),bankCardNo);
        action.clear(fabiaoPage.借款人联系方式输入框());
        action.type(fabiaoPage.借款人联系方式输入框(),phone);
        action.clear(fabiaoPage.订单号输入框());
        action.type(fabiaoPage.订单号输入框(),orderId);
        action.clear(fabiaoPage.渠道编号输入框());
        action.type(fabiaoPage.渠道编号输入框(),channel);
        action.clear(fabiaoPage.产品编号输入框());
        action.type(fabiaoPage.产品编号输入框(),product);
		action.clear(fabiaoPage.借款金额输入框());
        action.type(fabiaoPage.借款金额输入框(),amount);
        action.clear(fabiaoPage.借款利率输入框());
        action.type(fabiaoPage.借款利率输入框(),interestRate);
		action.clear(fabiaoPage.扣费方式输入框());
        action.type(fabiaoPage.扣费方式输入框(),isPreReceiveRate);
        action.clear(fabiaoPage.总费率输入框());
        action.type(fabiaoPage.总费率输入框(),platformReceiveServiceRate);
		action.clear(fabiaoPage.还款方式输入框());
        action.type(fabiaoPage.还款方式输入框(),borrowStyle);
	    action.clear(fabiaoPage.借款期限类型输入框());
        action.type(fabiaoPage.借款期限类型输入框(),borrowTermType);
		action.clear(fabiaoPage.借款期限单位输入框());
        action.type(fabiaoPage.借款期限单位输入框(),borrowTermUnit);
        action.clear(fabiaoPage.项目期限输入框());
        action.type(fabiaoPage.项目期限输入框(),borrowTerm);       
        action.clear(fabiaoPage.到期日输入框());
        action.type(fabiaoPage.到期日输入框(),borrowExpireDate);
        action.clear(fabiaoPage.借款申请所在地输入框());
        action.type(fabiaoPage.借款申请所在地输入框(),address);
        
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

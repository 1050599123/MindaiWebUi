package org.webdriver.mindaiwebui.pageObject;


import java.io.IOException;
import java.io.InputStream;

import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
	public class JjFabiaoPage  extends BaseAction {
	//用于eclipse工程内运行查找对象库文件路径
	private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
	 public   JjFabiaoPage() {
	//工程内读取对象库文件
	setXmlObjectPath(path);
	getLocatorMap();
	}
	  /***
      * 真实姓名输入框
	  * @return
	  * @throws IOException
	  */
	 public Locator 真实姓名输入框() throws IOException
	 {
	 Locator locator=getLocator("真实姓名输入框");
	 return locator;
	 }
	 
	 /***
	 * 身份证号输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 身份证号输入框() throws IOException
	  {
	    Locator locator=getLocator("身份证号输入框");
	    return locator;
	  }
	  
	 /***
	 * 银行卡号输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 银行卡号输入框() throws IOException
	  {
	    Locator locator=getLocator("银行卡号输入框");
	    return locator;
	  }
	 /***
	 * 借款人联系方式输入框
     * @return
     * @throws IOException
	 */
	 public Locator 借款人联系方式输入框() throws IOException
	   {
		  Locator locator=getLocator("借款人联系方式输入框");
		  return locator;
	   }
	 
	 /***
	 * 订单号输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 订单号输入框() throws IOException
	  {
	    Locator locator=getLocator("订单号输入框");
	    return locator;
	  }
    

	 /***
	 * 渠道编号输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 渠道编号输入框() throws IOException
	  {
	    Locator locator=getLocator("渠道编号输入框");
	    return locator;
	  }
	 
	 /***
	 * 产品编号输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 产品编号输入框() throws IOException
	  {
	    Locator locator=getLocator("产品编号输入框");
	    return locator;
	  }


	 /***
	 * 借款金额输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 借款金额输入框() throws IOException
	  {
	    Locator locator=getLocator("借款金额输入框");
	    return locator;
	  }

		 
	/***
	* 借款利率
	* @return
	* @throws IOException
	*/
	public Locator 借款利率输入框() throws IOException
	 {
	 Locator locator=getLocator("借款利率输入框");
	 return locator;
	 }

	/***
	* 扣费方式输入框
	* @return
	* @throws IOException
	*/
	public Locator 扣费方式输入框() throws IOException
	 {
	 Locator locator=getLocator("扣费方式输入框");
	 return locator;
	 }
	/***
	* 总费率输入框
	* @return
	* @throws IOException
	*/
	public Locator 总费率输入框() throws IOException
	 {
	 Locator locator=getLocator("总费率输入框");
	 return locator;
	 }
	
	/***
	* 还款方式输入框
	* @return
	* @throws IOException
	*/
	public Locator 还款方式输入框() throws IOException
	 {
	 Locator locator=getLocator("还款方式输入框");
	 return locator;
	 }
	
	/***
	* 借款期限类型输入框
	* @return
	* @throws IOException
	*/
	public Locator 借款期限类型输入框() throws IOException
	 {
	 Locator locator=getLocator("借款期限类型输入框");
	 return locator;
	 }
	
	/***
	* 借款期限单位输入框
	* @return
	* @throws IOException
	*/
	public Locator 借款期限单位输入框() throws IOException
	 {
	 Locator locator=getLocator("借款期限单位输入框");
	 return locator;
	 }
	/***
	* 项目期限输入框
	* @return
	* @throws IOException
	*/
	public Locator 项目期限输入框() throws IOException
	 {
	 Locator locator=getLocator("项目期限输入框");
	 return locator;
	 }
	
	/***
	* 借款申请所在地输入框
	* @return
	* @throws IOException
	*/
	public Locator 借款申请所在地输入框() throws IOException
	 {
	 Locator locator=getLocator("借款申请所在地输入框");
	 return locator;
	 }
	
	/***
	* 到期日输入框
	* @return
	* @throws IOException
	*/
	public Locator 到期日输入框() throws IOException
	 {
	 Locator locator=getLocator("到期日输入框");
	 return locator;
	 }


	 /***
	 * 提交按钮
	 * @return
	 * @throws IOException
	 */
	 public Locator 提交按钮() throws IOException
	  {
	    Locator locator=getLocator("提交按钮");
	    return locator;
	  }
	 /***
	 * 提示信息
	 * @return
	 * @throws IOException
	 */
	 public Locator 提示信息() throws IOException
	  {
	    Locator locator=getLocator("提示信息");
	    return locator;
	  }
	 }
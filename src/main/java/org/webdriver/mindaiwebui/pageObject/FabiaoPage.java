package org.webdriver.mindaiwebui.pageObject;


	import java.io.IOException;
import java.io.InputStream;

import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
	public class FabiaoPage  extends BaseAction {
	//用于eclipse工程内运行查找对象库文件路径
	private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
	 public   FabiaoPage() {
	//工程内读取对象库文件
	setXmlObjectPath(path);
	getLocatorMap();
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
	 * 借款利率输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 借款利率输入框() throws IOException
	  {
	    Locator locator=getLocator("借款利率输入框");
	    return locator;
	  }
	 /***
	 * 借款期限输入框
     @return
     * @throws IOException
	 */
	public Locator 借款期限输入框() throws IOException
		 {
		    Locator locator=getLocator("借款期限输入框");
		    return locator;
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
	* 银行名称
	* @return
	* @throws IOException
	*/
	public Locator 银行名称输入框() throws IOException
	 {
	 Locator locator=getLocator("银行名称输入框");
	 return locator;
	 }
	/***
	* 银行名称输入框
	* @return
	* @throws IOException
	*/
	public Locator 银行卡号输入框() throws IOException
	 {
	 Locator locator=getLocator("银行卡号输入框");
	 return locator;
	 }
	/***
	* 物流公司输入框
	* @return
	* @throws IOException
	*/
	public Locator 物流公司输入框() throws IOException
	 {
	 Locator locator=getLocator("物流公司输入框");
	 return locator;
	 }
	/***
	* 运单号输入框
	* @return
	* @throws IOException
	*/
	public Locator 运单号输入框() throws IOException
	 {
	 Locator locator=getLocator("运单号输入框");
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
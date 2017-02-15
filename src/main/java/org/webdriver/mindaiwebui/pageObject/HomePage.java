package org.webdriver.mindaiwebui.pageObject;


	
import java.io.IOException;
import java.io.InputStream;
import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
	public class HomePage  extends BaseAction {
	//用于eclipse工程内运行查找对象库文件路径
	private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
	 public   HomePage() {
	//工程内读取对象库文件
	setXmlObjectPath(path);
	getLocatorMap();
	}
	 /***
	 * 首页按钮
	 * @return
	 * @throws IOException
	 */
	 public Locator 首页按钮() throws IOException
	  {
	    Locator locator=getLocator("首页按钮");
	    return locator;
	  }

	 /***
	 * 我要投资按钮
	 * @return
	 * @throws IOException
	 */
	 public Locator 我要投资按钮() throws IOException
	  {
	    Locator locator=getLocator("我要投资按钮");
	    return locator;
	  }

	 /***
	 * 下载APP按钮
	 * @return
	 * @throws IOException
	 */
	 public Locator 下载APP按钮() throws IOException
	  {
	    Locator locator=getLocator("下载APP按钮");
	    return locator;
	  }
	 /***
	 *安全保障按钮
     @return
     * @throws IOException
	 */
	public Locator 安全保障按钮() throws IOException
		 {
		    Locator locator=getLocator("安全保障按钮");
		    return locator;
		  }
		 
	/***
	* 帮助中心按钮
	* @return
	* @throws IOException
	*/
	public Locator 帮助中心按钮() throws IOException
	 {
	 Locator locator=getLocator("帮助中心按钮");
	 return locator;
	 }
	/***
	* 我的账户按钮
	* @return
	* @throws IOException
	*/
	public Locator 我的账户按钮() throws IOException
	 {
	 Locator locator=getLocator("我的账户按钮");
	 return locator;
	 }
	/***
	* 账户总览按钮
	* @return
	* @throws IOException
	*/
	public Locator 账户总览按钮() throws IOException
	 {
	 Locator locator=getLocator("账户总览按钮");
	 return locator;
	 }
	/***
	* 立即退出按钮
	* @return
	* @throws IOException
	*/
	public Locator 立即退出按钮() throws IOException
	 {
	 Locator locator=getLocator("立即退出按钮");
	 return locator;
	 }
	/***
	* 返回普通版系统
	* @return
	* @throws IOException
	*/
	public Locator 返回普通版系统() throws IOException
	 {
	 Locator locator=getLocator("返回普通版系统");
	 return locator;
	 }
	/***
	* 用户名
	* @return
	* @throws IOException
	*/
	public Locator 用户名() throws IOException
	 {
	 Locator locator=getLocator("用户名");
	 return locator;
	 }
	/***
	* 退出按钮
	* @return
	* @throws IOException
	*/
	public Locator 退出按钮() throws IOException
	 {
	 Locator locator=getLocator("退出按钮");
	 return locator;
	 }
	/***
	* 登录按钮
	* @return
	* @throws IOException
	*/
	public Locator 登录按钮() throws IOException
	 {
	 Locator locator=getLocator("登录按钮");
	 return locator;
	 }
	/***
	* 登录按钮
	* @return
	* @throws IOException
	*/
	public Locator 注册按钮() throws IOException
	 {
	 Locator locator=getLocator("注册按钮");
	 return locator;
	 }
	
	 }

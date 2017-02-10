package org.webdriver.mindaiwebui.pageObject;


	import java.io.IOException;
	import java.io.InputStream;
	import org.webdriver.mindaiwebui.utils.BaseAction;
	import org.webdriver.mindaiwebui.utils.Locator;
	import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;//客服后台主页_对象库类
	
	/**
	 * Created by lirenjie on 2017/2/10 .
	 */
	public class FabiaoPage  extends BaseAction {
	//用于eclipse工程内运行查找对象库文件路径
	private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
	 public   FabiaoPage() {
	//工程内读取对象库文件
	setXmlObjectPath(path);
	getLocatorMap();
	}
	 
	 
	 /***
	 * 借款人用户名输入框
	 * @return
	 * @throws IOException
	 */
	 public Locator 借款人用户名输入框() throws IOException
	  {
	    Locator locator=getLocator("借款人用户名输入框");
	    return locator;
	  }
	 
	 
	 /***
	 * 选择是新手标
	 * @return
	 * @throws IOException
	 */
	 public Locator 选择是新手标() throws IOException
	  {
	    Locator locator=getLocator("选择是新手标");
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
	 * 期限类型选择
	 * @return
	 * @throws IOException
	 */
	 public Locator 期限类型选择() throws IOException
	  {
	    Locator locator=getLocator("期限类型选择");
	    return locator;
	  }
	 
	 /***
	 * 固定期限选择
	 * @return
	 * @throws IOException
	 */
	 public Locator 固定期限选择() throws IOException
	  {
	    Locator locator=getLocator("固定期限选择");
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
		 *业务类型选择
	     @return
	     * @throws IOException
		 */
		public Locator 业务类型选择() throws IOException
			 {
			    Locator locator=getLocator("业务类型选择");
			    return locator;
			  }
		
		 /***
		 * 选择民担保
	     @return
	     * @throws IOException
		 */
		public Locator 选择民担保() throws IOException
			 {
			    Locator locator=getLocator("选择民担保");
			    return locator;
			  }

		 /***
		 * 备注输入框
	     @return
	     * @throws IOException
		 */
		public Locator 备注输入框() throws IOException
			 {
			    Locator locator=getLocator("备注输入框");
			    return locator;
			  }
		
		 /***
		 * 勾选代收账户
	     @return
	     * @throws IOException
		 */
		public Locator 勾选代收账户() throws IOException
			 {
			    Locator locator=getLocator("勾选代收账户");
			    return locator;
			  }
		
		 /***
		 * 代收账户输入框
	     @return
	     * @throws IOException
		 */
		public Locator 代收账户输入框() throws IOException
			 {
			    Locator locator=getLocator("代收账户输入框");
			    return locator;
			  }

		 /***
		 * 勾选代还账户
	     @return
	     * @throws IOException
		 */
		public Locator 勾选代还账户() throws IOException
			 {
			    Locator locator=getLocator("勾选代还账户");
			    return locator;
			  }
		
		 /***
		 * 代还账户输入框
	     @return
	     * @throws IOException
		 */
		public Locator 代还账户输入框() throws IOException
			 {
			    Locator locator=getLocator("代还账户输入框");
			    return locator;
			  }		

		 /***
		 * 勾选标题是否自动
	     @return
	     * @throws IOException
		 */
		public Locator 勾选标题是否自动() throws IOException
			 {
			    Locator locator=getLocator("勾选标题是否自动");
			    return locator;
			  }	
		
		 /***
		 * 标题选择否
	     @return
	     * @throws IOException
		 */
		public Locator 标题选择否() throws IOException
			 {
			    Locator locator=getLocator("标题选择否");
			    return locator;
			  }	
		
		 /***
		 *标题输入框
	     @return
	     * @throws IOException
		 */
		public Locator 标题输入框() throws IOException
			 {
			    Locator locator=getLocator("标题输入框");
			    return locator;
			  }	
		
		 /***
		 *投资人利息为前置扣费
	     @return
	     * @throws IOException
		 */
		public Locator 投资人利息为前置扣费() throws IOException
			 {
			    Locator locator=getLocator("投资人利息为前置扣费");
			    return locator;
			  }	
		
		 /***
		 *借款人提前还款违约金费率
	     @return
	     * @throws IOException
		 */
		public Locator 借款人提前还款违约金费率() throws IOException
			 {
			    Locator locator=getLocator("借款人提前还款违约金费率");
			    return locator;
			  }	
		
		 /***
		 *借款人提前还款违约金天数
	     @return
	     * @throws IOException
		 */
		public Locator 借款人提前还款违约金天数() throws IOException
			 {
			    Locator locator=getLocator("借款人提前还款违约金天数");
			    return locator;
			  }	
		
		 /***
		 *投资人提前还款补偿金费率
	     @return
	     * @throws IOException
		 */
		public Locator 投资人提前还款补偿金费率() throws IOException
			 {
			    Locator locator=getLocator("投资人提前还款补偿金费率");
			    return locator;
			  }	
		
		 /***
		 *投资人提前还款补偿金天数
	     @return
	     * @throws IOException
		 */
		public Locator 投资人提前还款补偿金天数() throws IOException
			 {
			    Locator locator=getLocator("投资人提前还款补偿金天数");
			    return locator;
			  }	
		
		 /***
		 *借款费用扣收为前置扣费
	     @return
	     * @throws IOException
		 */
		public Locator 借款费用扣收为前置扣费() throws IOException
			 {
			    Locator locator=getLocator("借款费用扣收为前置扣费");
			    return locator;
			  }	
		
		 /***
		 *支付费率
	     @return
	     * @throws IOException
		 */
		public Locator 支付费率() throws IOException
			 {
			    Locator locator=getLocator("支付费率");
			    return locator;
			  }	
		
		 /***
		 *担保费率
	     @return
	     * @throws IOException
		 */
		public Locator 担保费率() throws IOException
			 {
			    Locator locator=getLocator("担保费率");
			    return locator;
			  }	
		
		 /***
		 *咨询费率
	     @return
	     * @throws IOException
		 */
		public Locator 咨询费率() throws IOException
			 {
			    Locator locator=getLocator("咨询费率");
			    return locator;
			  }	
		
		 /***
		 *佣金费率
	     @return
	     * @throws IOException
		 */
		public Locator 佣金费率() throws IOException
			 {
			    Locator locator=getLocator("佣金费率");
			    return locator;
			  }	
		
		 /***
		 *平台服务费率
	     @return
	     * @throws IOException
		 */
		public Locator 平台服务费率() throws IOException
			 {
			    Locator locator=getLocator("平台服务费率");
			    return locator;
			  }	
		
		

	
	 /***
	 * 保存按钮
	 * @return
	 * @throws IOException
	 */
	 public Locator 保存按钮() throws IOException
	  {
	    Locator locator=getLocator("保存按钮");
	    return locator;
	  }
	 
//	 /***
//	 * 提示信息
//	 * @return
//	 * @throws IOException
//	 */
//	 public Locator 提示信息() throws IOException
//	  {
//	    Locator locator=getLocator("提示信息");
//	    return locator;
//	  }
	 }
package org.webdriver.mindaiwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;

import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
public class InvestmentPage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
 public   InvestmentPage() {
//工程内读取对象库文件
setXmlObjectPath(path);
getLocatorMap();
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
* 项目列表
* @return
* @throws IOException
*/
public Locator 项目列表() throws IOException
 {
   Locator locator=getLocator("项目列表");
   return locator;
 }
/***
* 验证码
* @return
* @throws IOException
*/
public Locator 立即去投资按钮() throws IOException
{
  Locator locator=getLocator("立即去投资按钮");
  return locator;
}
/***
* 投资金额输入框
* @return
* @throws IOException
*/
public Locator 投资金额输入框() throws IOException
 {
   Locator locator=getLocator("投资金额输入框");
   return locator;
 }
/***
* 立即投资按钮
* @return
* @throws IOException
*/
public Locator 立即投资按钮() throws IOException
 {
   Locator locator=getLocator("立即投资按钮");
   return locator;
 }
/***
* 关闭按钮
* @return
* @throws IOException
*/
public Locator 关闭按钮() throws IOException
 {
   Locator locator=getLocator("关闭按钮");
   return locator;
 }
/***
* 短信验证码输入框
* @return
* @throws IOException
*/
public Locator 短信验证码输入框() throws IOException
 {
   Locator locator=getLocator("短信验证码输入框");
   return locator;
 }
/***
* 立即投资按钮
* @return
* @throws IOException
*/
public Locator 确认投资按钮() throws IOException
 {
   Locator locator=getLocator("确认投资按钮");
   return locator;
 }

}
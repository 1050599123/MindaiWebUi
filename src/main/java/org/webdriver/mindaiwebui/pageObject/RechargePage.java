package org.webdriver.mindaiwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;

import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
public class RechargePage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
 public   RechargePage() {
//工程内读取对象库文件
setXmlObjectPath(path);
getLocatorMap();
}


/***
* 充值按钮
* @return
* @throws IOException
*/
public Locator 充值按钮() throws IOException
 {
   Locator locator=getLocator("充值按钮");
   return locator;
 }

/***
* 充值金额输入框
* @return
* @throws IOException
*/
public Locator 充值金额输入框() throws IOException
 {
   Locator locator=getLocator("充值金额输入框");
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
* 充值提示框
* @return
* @throws IOException
*/
public Locator 充值提示框() throws IOException
{
  Locator locator=getLocator("充值提示框");
  return locator;
}
/***
* 我的账户
* @return
* @throws IOException
*/
public Locator 我的账户() throws IOException
{
  Locator locator=getLocator("我的账户");
  return locator;
}
/***
* 确认按钮
* @return
* @throws IOException
*/
public Locator 确认按钮() throws IOException
{
  Locator locator=getLocator("确认按钮");
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
* 提交
* @return
* @throws IOException
*/
public Locator 提交按钮() throws IOException
 {
   Locator locator=getLocator("提交按钮");
   return locator;
 }

}
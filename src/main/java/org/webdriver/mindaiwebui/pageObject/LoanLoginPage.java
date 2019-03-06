package org.webdriver.mindaiwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;

import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
public class LoanLoginPage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
 public   LoanLoginPage() {
//工程内读取对象库文件
setXmlObjectPath(path);
getLocatorMap();
}


/***
* 用户名
* @return
* @throws IOException
*/
public Locator 用户名输入框() throws IOException
 {
   Locator locator=getLocator("用户名输入框");
   return locator;
 }

/***
* 密码
* @return
* @throws IOException
*/
public Locator 密码输入框() throws IOException
 {
   Locator locator=getLocator("密码输入框");
   return locator;
 }
/***
* 注册按钮
* @return
* @throws IOException
*/
public Locator 注册按钮() throws IOException
{
  Locator locator=getLocator("注册按钮");
  return locator;
}
/***
* 找回密码按钮
* @return
* @throws IOException
*/
public Locator 找回密码按钮() throws IOException
{
  Locator locator=getLocator("找回密码按钮");
  return locator;
}
/***
* 登录
* @return
* @throws IOException
*/
public Locator 登录按钮() throws IOException
 {
   Locator locator=getLocator("登录按钮");
   return locator;
 }

}
package org.webdriver.mindaiwebui.pageObject;

import java.io.IOException;

import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;

public class HouTai_LoginPage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
 public   HouTai_LoginPage() {
//工程内读取对象库文件
setXmlObjectPath(path);
getLocatorMap();
}


/***
* 用户名
* @return
* @throws IOException
*/
public Locator 后台登陆用户名输入框() throws IOException
 {
   Locator locator=getLocator("后台登陆用户名输入框");
   return locator;
 }

/***
* 密码
* @return
* @throws IOException
*/
public Locator 后台密码输入框() throws IOException
 {
   Locator locator=getLocator("后台密码输入框");
   return locator;
 }
/***
* 验证码
* @return
* @throws IOException
*/
public Locator 后台验证码输入框() throws IOException
{
  Locator locator=getLocator("后台验证码输入框");
  return locator;
}
/***
* 登录
* @return
* @throws IOException
*/
public Locator 后台登录按钮() throws IOException
 {
   Locator locator=getLocator("后台登录按钮");
   return locator;
 }
}
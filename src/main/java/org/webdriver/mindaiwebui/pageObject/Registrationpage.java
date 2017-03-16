package org.webdriver.mindaiwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;
import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
public class Registrationpage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
 public   Registrationpage() {
//工程内读取对象库文件
setXmlObjectPath(path);
getLocatorMap();
}


/***
* 用户名
* @return
* @throws IOException
*/
public Locator 注册用户名输入框() throws IOException
 {
   Locator locator=getLocator("注册用户名输入框");
   return locator;
 }

/***
* 密码
* @return
* @throws IOException
*/
public Locator 注册密码输入框() throws IOException
 {
   Locator locator=getLocator("注册密码输入框");
   return locator;
 }
/***
* 图形验证码
* @return
* @throws IOException
*/
public Locator 图形验证码输入框() throws IOException
{
  Locator locator=getLocator("图形验证码输入框");
  return locator;
}
/***
* 短信验证码
* @return
* @throws IOException
*/
public Locator 短信验证码输入框() throws IOException
{
  Locator locator=getLocator("短信验证码输入框");
  return locator;
}
/***
* 获取短信验证码
* @return
* @throws IOException
*/
public Locator 获取短信验证码() throws IOException
{
  Locator locator=getLocator("获取短信验证码");
  return locator;
}
/***
* 推荐人
* @return
* @throws IOException
*/
public Locator 推荐人输入框() throws IOException
{
  Locator locator=getLocator("推荐人输入框");
  return locator;
}
/***
* 立即注册按钮
* @return
* @throws IOException
*/
public Locator 立即注册按钮() throws IOException
 {
   Locator locator=getLocator("立即注册按钮");
   return locator;
 }

}
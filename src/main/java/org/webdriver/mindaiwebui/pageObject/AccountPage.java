package org.webdriver.mindaiwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;

import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
public class AccountPage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
 public   AccountPage() {
//工程内读取对象库文件
setXmlObjectPath(path);
getLocatorMap();
}


/***
* 真实姓名
* @return
* @throws IOException
*/
public Locator 真实姓名输入框() throws IOException
 {
   Locator locator=getLocator("真实姓名输入框");
   return locator;
 }

/***
* 身份证号
* @return
* @throws IOException
*/
public Locator 身份证号输入框() throws IOException
 {
   Locator locator=getLocator("身份证号输入框");
   return locator;
 }
/***
* 银行卡号
* @return
* @throws IOException
*/
public Locator 银行卡号输入框() throws IOException
{
  Locator locator=getLocator("银行卡号输入框");
  return locator;
}
/***
* 选择省份
* @return
* @throws IOException
*/
public Locator 选择省份() throws IOException
{
  Locator locator=getLocator("选择省份");
  return locator;
}
/***
* 选择地区
* @return
* @throws IOException
*/
public Locator 选择地区() throws IOException
{
  Locator locator=getLocator("选择地区");
  return locator;
}
/***
* 银行卡预留手机号
* @return
* @throws IOException
*/
public Locator 银行卡预留手机号输入框() throws IOException
{
  Locator locator=getLocator("银行卡预留手机号输入框");
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
* 开通存管账户按钮
* @return
* @throws IOException
*/
public Locator 开通存管账户按钮() throws IOException
 {
   Locator locator=getLocator("开通存管账户按钮");
   return locator;
 }

}
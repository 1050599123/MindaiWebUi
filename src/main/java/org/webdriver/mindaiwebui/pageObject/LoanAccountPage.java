package org.webdriver.mindaiwebui.pageObject;
import java.io.IOException;
import java.io.InputStream;

import org.webdriver.mindaiwebui.pageObjectConfig.PageObjectAutoCode;
import org.webdriver.mindaiwebui.utils.BaseAction;
import org.webdriver.mindaiwebui.utils.Locator;
public class LoanAccountPage extends BaseAction {
//用于eclipse工程内运行查找对象库文件路径
private String path="src/main/java/org/webdriver/mindaiwebui/pageObjectConfig/UILibrary.xml";
 public   LoanAccountPage() {
//工程内读取对象库文件
setXmlObjectPath(path);
getLocatorMap();
}

 
 /***
 * 个人开户
 * @return
 * @throws IOException
 */
 public Locator 个人开户() throws IOException
  {
    Locator locator=getLocator("个人开户");
    return locator;
  }
 /***
 * 企业开户
 * @return
 * @throws IOException
 */
 public Locator 企业开户() throws IOException
  {
    Locator locator=getLocator("企业开户");
    return locator;
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
* 发送验证码
* @return
* @throws IOException
*/
public Locator 发送验证码() throws IOException
{
  Locator locator=getLocator("发送验证码");
  return locator;
}
/***
* 我知道了
* @return
* @throws IOException
*/
public Locator 我知道了() throws IOException
{
  Locator locator=getLocator("我知道了");
  return locator;
}
/***
* 交易密码输入框
* @return
* @throws IOException
*/
public Locator 交易密码输入框() throws IOException
{
  Locator locator=getLocator("交易密码输入框");
  return locator;
}
/***
* 确认密码输入框
* @return
* @throws IOException
*/
public Locator 确认密码输入框() throws IOException
{
  Locator locator=getLocator("确认密码输入框");
  return locator;
}
/***
* 下一步按钮
* @return
* @throws IOException
*/
public Locator 下一步按钮() throws IOException
 {
   Locator locator=getLocator("下一步按钮");
   return locator;
 }
/***
* 同意协议确定注册按钮
* @return
* @throws IOException
*/
public Locator 同意协议确定注册按钮() throws IOException
 {
   Locator locator=getLocator("同意协议确定注册按钮");
   return locator;
 }


}
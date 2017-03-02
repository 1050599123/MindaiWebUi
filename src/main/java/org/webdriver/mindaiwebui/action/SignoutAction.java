package org.webdriver.mindaiwebui.action;

import org.openqa.selenium.By;
import org.webdriver.mindaiwebui.pageObject.HomePage;
import org.webdriver.mindaiwebui.utils.ElementAction;
import org.webdriver.mindaiwebui.utils.TestBaseCase;

import java.io.IOException;

/**
 * 
 * 退出
 * 
 */
public class SignoutAction extends TestBaseCase{
    public SignoutAction( ) throws IOException
    {
  
    	HomePage HomePage=new HomePage();
        ElementAction action=new ElementAction();     
        action.click(HomePage.退出按钮());

     //   System.out.println("当前网址为:"+action.getUrl());
        
  
    }
 
}
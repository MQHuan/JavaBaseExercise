package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

/**
 * Created by Administrator on 2016/4/10.
 */
public class SecondDayDemoActivity extends DemoBaseActivity {

  public void testFirstMethod() {
    log("Test", "testShowInHtml");
    logThreadTips();
  }

  public void testSecondMethod() {
    int result = 1+1;
    log("Test" + result + "test", result);
    fastLog("Test" + result + "test");
    logThreadTips();
  }


}


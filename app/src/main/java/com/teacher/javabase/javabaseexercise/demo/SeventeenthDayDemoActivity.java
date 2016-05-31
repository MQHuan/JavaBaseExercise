package com.teacher.javabase.javabaseexercise.demo;


import android.net.Uri;
import android.os.Bundle;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SeventeenthDayDemoActivity extends DemoBaseActivity {


  /**
   * ATTENTION: This was auto-generated to implement the App Indexing API.
   * See https://g.co/AppIndexing/AndroidStudio for more information.
   */
  private GoogleApiClient client;

  public void testMain() {
    HashSet h = new HashSet();
    h.add("1st");
    h.add("2nd");
    h.add(new Integer(3));
    h.add(new Double(4.0));
    h.add("2nd");            //重复元素，未被添加
    h.add(new Integer(3));      //重复元素，未被添加
    h.add(new Date());
    fastLog("开始：size=" + h.size());
    Iterator it = h.iterator();
    while (it.hasNext()) {
      Object o = it.next();
      fastLog(o);
    }

    h.remove("2nd");
    fastLog("移除元素后：size=" + h.size());
    fastLog(h);

    TreeSet ts=new TreeSet();
    ts.add("orange");
    ts.add("apple");
    ts.add("banana");
    ts.add("grape");

    Iterator it2=ts.iterator();
    while(it2.hasNext())
    {
      String fruit=(String)it2.next();
      fastLog(fruit);
    }
  }

  public void testConclusion() {
    /*
1、HashSet类
         Java.util.HashSet类实现了Java.util.Set接口。
l  它不允许出现重复元素；
l  不保证和政集合中元素的顺序
l  允许包含值为null的元素，但最多只能有一个null元素。

2、TreeSet
TreeSet描述的是Set的一种变体——可以实现排序等功能的集合，
它在讲对象元素添加到集合中时会自动按照某种比较规则将其插入到有序的对象序列中，
并保证该集合元素组成的读uixiangxulie时刻按照“升序”排列。
    * */
  }



}

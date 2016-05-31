package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

import java.util.Date;

public class FourteenthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    fastLog("Date类和Calendar类");

    Date d = new Date();

    fastLog("时间:" + d);

    //Date -> long 通过日期获取毫秒值
    long time = d.getTime();

    fastLog("时间毫秒值:"+time);

    //long -> Date 通过毫秒值获取日期

    Date d2 = new Date(1);

    fastLog("通过构造指定的时间:" + d2);

    Date d3 = new Date();
    d3.setTime(100000000);

    fastLog("通过setTime指定的时间:" + d3);

  }

  public void testConclusion()
  {
    /*
/*
一、Date类的概述

1、注意：
去查API  Date类的时候要去查util包下的.
------------------------------
二、Date类的使用

1、Date()
获取当前的时间,以时期形式(对象)

2、Date( long time )
通过给定的毫秒值获取日期对象

3、public long getTime();
根据日期对象获取相对应的毫秒值

4 public void setTime(long time);
设置日期对象的毫秒值.
-------------------------------
三、DateFormat类格式化简单使用
Date --> String 转换过程叫 格式化。

重点代码：
//创建日期对象
Date d = new Date();
//创建格式对象
SimpleDateFormat sdf = new SimpleDateFormat();
String s = sdf.format( d );
System.out.println( s );

查看API都需要看什么
1 是否是lang包下,不是的话需要导包
2 看一下这个类或接口的描述
3 看一下这个类的修饰符.
4 想要使用这个类就要学习这个类的构造方法,以便创建对象

如果以后在一个类中你认为它应该具备某个功能,但是在这个类中没有找到
就要去它的父类中找,因为父类有的就相当于子类也具备.
------------------------------
四、SimpleDateFormat格式化解析指定格式的日期

1、想把日期转换成我们想要的指定模式需要用到哪个构造方法？
需要用到SimpleDateFormat的带参构造,然后把要指定的格式传入就可以了.

注意:从字符串>日期 需要注意 你指定的日期格式要与字符串的格式相匹配.
------------------------------
五、Calendar类的概述和使用

1、 Calendar c = Calendar.getInstance();
这一步是创建对象的操作创建了Calendar对象(更严谨的说这一步创建了Calendar的子类对象.)
-----------------------------
六、计算某一年的2月份有多少天
涉及到的方法

1、public final void set ( int year, int month, int date );
设置字段,中的年 月 日.

2、public abstract void add ( int field, int amount );
根据日历的规则,为给定的日历字段增加或减少指定的天数.
---------------------------
七、对象数组的使用

对对象数组的理解
其实就是原来定义这个数组中存储的数据类型是基本类型(比如说int [])
现在定义的数组类型是引用数据类型(比如说Student[])
----------------------------
八、对象数组内存图
-----------------------------
九、案例改进：通过键盘录入学生
-----------------------------
十、用户登陆注册的分析
在写一个工程的时候，如果你想让你的代码更符合面向对象的思需要有明确的框架？
A：明确有几个类
B：明确每个类功能。
C：明确类与类之间的关系
----------------------------------
十一、用户登陆注册的包划分

一般写一个项目的时候要分包两种方式
A：按模块分
B：按操作分
cn.itcast.dao
cn.itcast.impl
www.itcast.cn
com.baidu

-----------------------------------
十二、用户描述类的实现
建包步骤
1、建用户描述类的包 package cn.itcast.pojo;
同时在包下创建User用户类

2、用户操作类的包 package cn.itcast.dao;
同时在包内创建UserDao接口

3、创建用户实现类的包 package cn.itcast.dao.impl;
同时在包内创建UserDaoImpl实体类

4、测试类的包 package cn.itcast.test;
同时在包内创建UserTest实体类。
---------------------------------
十三、用户操作类的实现
如果传递的参数过多我们一般采取什么措施？

一般我们采取传递对象的形式,因为对象中可以包含这些参数.
------------------------------------
十四、用户测试类的实现
思路：
1、搭建欢迎界面（注册，登陆，退出）

2、用switch来判断用户的选择项

3、根据用户的选择项进行相应的操作。登陆、注册或者退出。

*/
  }

}

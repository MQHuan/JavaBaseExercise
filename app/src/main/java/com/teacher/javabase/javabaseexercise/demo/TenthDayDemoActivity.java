package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class TenthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    fastLog("内部类的使用规范:");

    /*
    *
    * 内部类访问规则
    * •内部类可以直接访问外部类中的成员，包括私有。访问格式：外部类名.this
    * •外部类要访问内部类必须创建内部类对象。
    * •内部类在成员位置上，可以被成员修饰符修饰。
    *
    * 静态内部类
    *•内部类定义了静态成员，内部类必须是静态的。
    *
    * 局部内部类
    *•内部类定义在局部时，可以直接访问外部类中的成员。
    *•访问局部变量必须被final修饰。
    *
    * 匿名内部类
    *•匿名内部类是内部类的简写格式。
    *•匿名内部类的前提：内部类必须继承一个类或者实现接口。
    *•匿名内部类不能创建构造函数。
    */
    }





}

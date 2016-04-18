package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class FourthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    fastLog("体现多态的例子");

    /*
	体现继承,封装,多态的例子
	多态体现在:父类Vessel的引用可以指向它的子类(Refrigerater,WashMachine)的对象.
*/
    class Elephant
    {
      public void say()
      {
        fastLog("elephant: I am in!");

      }
    }

    class Vessel
    {

      private Elephant object;

      public void open()
      {
        fastLog("the Vessel is open.");
      }
      public void load(Elephant elephant)
      {
        object = elephant;
        object.say();
      }
      public void close()
      {
        fastLog("the Vessel is close.");
      }

    }

    class Refrigerater extends Vessel
    {
      public void open()
      {
        fastLog("the Refrigerater is open.");
      }

      public void close()
      {
        fastLog("the Refrigerater is close.");
      }

    }

    class WashMachine extends Vessel
    {
      public void open()
      {
        fastLog("the WashMachine is open.");
      }

      public void close()
      {
        fastLog("the WashMachine is close.");
      }

    }

    Vessel vessel = new Vessel();
    vessel.open();
    vessel.load(new Elephant());
    vessel.close();

    fastLog("-------------------------");

    vessel = new Refrigerater();
    vessel.open();
    vessel.load(new Elephant());
    vessel.close();

    fastLog("-------------------------");

    vessel = new WashMachine();
    vessel.open();
    vessel.load(new Elephant());
    vessel.close();

    fastLog("-------------------------");


  }

  public void testConclusion()
  {
    /*

子类访问不到父类的局部变量.

--------------------------------------
06、this和super的区别和应用
一概述
this :代表的是本类对象的引用
super :代表的是父类内存空间的标识(可以理解为父类的对象引用)

二 this 和 super 的使用

成员变量： this.变量名	调用本类成员位置的变量
		   super.变量名  调用父类成员位置的变量

成员方法： this.方法名	调用的是本类方法
		   super.方法名  调用的是父类的方法

构造方法(写在构造方法之中)： this(参数)		调用本类中其他的构造方法
							 super(参数)	调用父类中的构造方法
------------------------------------
07、方法的重写

什么是方法重写：在子父类中,方法名相同,参数列表相同,返回值类型相同(方法声明相同)
什么是方法重载：在同一个类中,方法名相同,参数列表不同,与返回值类型无关

------------------------------------
08、子父类间成员方法的注意事项

一 子父类间的成员方法需要注意的地方
A：父类中的私有方法不能被重写
B：子类方法的访问权限修饰符要大于等于父类的访问权限修饰符
C：静态的方法只能重写静态方法

二 什么时候考虑使用重写
当子类需要父类的功能的基础上，又需要有自己特有的功能时,可以重写父类的方法
这样既可以使用父类的功能又可以定义子类特有的内容.
--------------------------------------
09、子父类间构造方法的执行顺序

一 为什么父类的构造会在子类之前执行?
A:因为子类的构造方法中第一行会默认有一个super()会调用父类的无参构造.

B:因为可以用子类对象调用父类中的非私有成员,那么必然要对父类进行初始化

注意:如果在构造方法中手动给出 this() 或 super()的话这两个代码一定要是第一行有效代码.

二 如果父类中没有无参的构造方法，那么，子类的super()就调用不到父类的构造了肿么办？
可以在子类中手动给出 super(参数)来访问父类的带参构造

一个类的构造方法第一行一定有个super(),假如说这个类没有继承的话,那么super()访问的是谁呢?
访问的是Object类中的构造方法.

---------------------------------------
10、代码块的面试
一 子父类中如果有 构造方法,构造代码块,静态代码块在创建对象时他们的执行顺序是怎么样的?

执行顺序:
父静态代码块
子静态代码块
父构造代码块
父构造方法
子构造代码块
子构造方法

注意:当创建多个对象的时候静态代码块只执行一次(class字节码文件对象只加载一次的前提下)
--------------------------------------------
11、完整的子父关系的内存图

完整的子父类内存图执行顺序见资料
---------------------------------------------

12、子类如何使用父类的私有成员变量
一 如果成员变量被私有了，那么，在子类中怎么使用呢？
子类不能直接去使用父类的私有成员
如果子类想要访问父类私有成员的话 只能通过get和set方法或者 用父类的带参构造赋值

-----------------------------------------------
13、final关键字的概述和使用
final 可以修饰谁?
类:不能被继承
成员变量:就变成了一个常量
成员方法:不可以被重写*/
  }

}

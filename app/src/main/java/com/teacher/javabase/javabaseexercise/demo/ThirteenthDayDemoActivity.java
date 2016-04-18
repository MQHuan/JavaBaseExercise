package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

import java.util.Arrays;

public class ThirteenthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    //how to turn a string to an array
    String s = "5 4 3 2 1 0";

    String[] SA = s.split(" ");

    int [] IA = new int[SA.length];

    for (int i = 0; i < IA.length; i++) {
      IA[i] = Integer.parseInt(SA[i]);
    }

    Arrays.sort(IA);

    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < IA.length; i++) {
      sb.append(IA[i]);
    }

    fastLog(sb);
  }

  public void testKonwledage()
  {

 /*
一、数组排序（冒泡排序原理分析）

冒泡排序的原理：
    相邻元素两两比较,大的往后走
	第一次比较后最大值就在最大索引处了
		第二次继续比较完之后第二大的值就在第二大的索引处
			......
---------------------------
二、数组排序（冒泡排序思路代码）

以后开发想要对数组进行排序用谁？
*Arrays.sort();方法就可以了

--------------------------
三、对字符串中的字符进行排序

思路：
   1、可以通过toCharArray( )方法把字符串转换成字符数组
   2、对这个字符数组进行排序
   3、把排序后的数组转换成字符串,String类的构造方法,也可以用valueOf();
----------------------------
四、数组二分查找
前提条件：数组必须是有序的

思路：A、把要查找的数据从中间位置查找,如果相同则直接返回索引,如果不同,看是大了还是小了
	  B、如果大了在右边继续进行A的操作,如果小了在左边进行A的操作.

------------------------------
五、Arrays工具的概述
六、Arrays工具类的方法使用

*public static String toString( int[] a )
把一个整形的数组转换成字符串

*public static void sort( int[] a )
把数组进行排序

*public static int binarySearch ( int[] a, int key)
对数组进行二分查找.

-----------------------------
七、System类常用方法使用
*public static void exit ( int status)
退出虚拟机

**public static long currentTimeMillis()
返回当前时间的毫秒值

-----------------------------
八、System类中的复制数组的方法
*public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length )
从指定数组中复制一个数组,复制从指定位置开始,到目标数组的指定位置结束.
----------------------------
九、StringBuffer类的概述及构造方法

1、问题：StringBuffer和String的区别？
String 一但被赋值不可以被改变,而StringBuffer是可以被改变的 (因为它是使用了一个缓冲区机制)

2、创建StringBuffer对象的三种方式
StringBuffer()
创建一个StringBuffer对象默认长度是16

StringBuffer( int capacity )
创建一个指定长度的StringBuffer对象.

StringBuffer( String str)
相当把String类型转换成StringBuffer类型.

3、
public int length ()
获取实际长度

public int capacity ()
获取理论长度

4、想把String和StringBuffer互相转换怎么办？
使用它们对应类中的构造方法可以实现.

-----------------------------
十、StringBuffer的添加功能

public StringBuffer append ( int i )
在末尾追加元素

public StringBuffer insert ( int index, String i )
在指定索引处增加元素.

---------------------------
十一、StringBuffer的删除功能

StringBuffer deleteCharAt ( int index )
删除指定索引处的字符

StringBuffer delete ( int start , int end )
删除从位置开始到指定索引结束

StringBuffer replace(int start, int end, String str)
 把指定索引到指定索引之间的字符用一个字符串替换

String substring(int start)
从指定索引开始截取到末尾

String substring(int start, int end)
从指定索引开始截取到指定索引

StringBuffer reverse()
把字符串反转

注意:以后写文件名或类名时不要用系统已有的类名.
----------------------------
十二、把字符串反转
方式1
	A：把字符串转换成字符数组
	B：把字符数组倒序输出

方式2
	A：把String类型先转换成StringBuffer类型. 构造方法
	B：调用反转功能
	C：把StringBuffer类型在转换成String类型.构造方法

-----------------------------
十三、String类的测试_面试题
之前的理解
基本类型：形式参数的改变不会影响实际参数(因为传递的是实际的值)
引用类型：形式参数的改变会影响实际参数(传递的是地址值)
但是：String类型除外

2、结论
常量相加会直接累加,然后在常量池中找对应的值去使用.
变量相加会重新开辟一块空间.
-------------------------
十四、Integer类的概述和使用
Integer类是基本类型int的包装类

public static String toBinaryString( int i )
把int类型数据转换成二进制的变现形式

public static String toOctalString( int i )
把int类型数据转换成八进制的变现形式

public static String toHexString( int i )
把int类型数据转换成十六进制的变现形式

-----------------------------
十五、Integer类的构造方法
基本类型		 包装类
byte			Byte
short			Short
int 			Integer
long 			Long
float			Float
double			Double
char			Character
boolean			Boolean

通过Integer的构造方法可以把String类型转换成Integer类型
注意:这个字符串必须是由纯数字组成才可以.
----------------------------
十六、String和int的相互转化
int转成String
      方式1（理解）int num = 100;
                   String s = 100 + "";
      方式2（掌握）String s = String.valueOf(num);
      方式3（理解）Integer i = new Integer( num );
                   String s = i.toString();
      方式4（掌握）String  s= Integer.toString( num );

String转成int
      方式1（理解）String s = "123";
                   Integer i = new Integer ( s );
                   int number = i.intValue();

     **方式2:（掌握）int number = Integer.parseInt( String s );
---------------------------
十七、把字符串中的数字字符排序

思路：
A：把字符串转换成字符串数组
B：把字符串数组转换成int数组
C：把int数组进行排序
D：把排序后的数组在转换成字符串

-----------------------------
十八、JDK5以后Integer类的新特性
自动装箱：就是把基本数据类型直接赋值给引用数据类型.
自动拆箱：就是把引用数据类型,拆分成基本数据类型进行运算.

开发原则:如果对象不是自己创建的,是从其他地方传递过来的,那么在调方法之前要
先做一下不为null判断.
---------------------------
十九、byte常量池测试

----------------------------
二十、常用API的方法
1：Object(重点)
	toString():为了让对象的显示有意义，一般重写该方法。
	equals():默认比较的是地址值，一般重写该方法，按照自己的需求。

2：Math

3：Random


4：Scanner
	nextInt():获取int类型
	nextLine():获取String类型

5：String(重点)
	把day13总结里面的几种功能补齐中文意思在看一遍。

6：StringBuffer(重点)
	append():添加
	insert():在指定位置添加

StringBuffer()
创建一个StringBuffer对象默认长度是16

StringBuffer( int capacity )
创建一个指定长度的StringBuffer对象.

StringBuffer( String str)
相当把String类型转换成StringBuffer类型.

StringBuffer deleteCharAt ( int index )
删除指定索引处的字符

StringBuffer delete ( int start , int end )
删除从位置开始到指定索引结束

StringBuffer replace(int start, int end, String str)
 把指定索引到指定索引之间的字符用一个字符串替换

String substring(int start)
从指定索引开始截取到末尾

String substring(int start, int end)
从指定索引开始截取到指定索引

7：System
	exit():退出

	public static long currentTimeMillis()
	返回当前时间的毫秒值

8：Arrays
	sort():排序
	binarySearch():二分查找

9：Integer(重点)
	parseInt(String s):把String -- int



1 把总结答案删除 再去敲一遍
2 把最后总结出来的重点方法亲自测试一遍(包括String类的)
3 把字符串反转操作代码实现
4 编程题
	定义一个标准学生类(name,age)
	定义一个学生数组。
	存储5个学生，然后遍历。
	String[]
	Student[]

*/
  }

  public void testConclusion()
  {
/*
1：数组操作(理解)
	查找
		--普通查找:数组无序
		--二分查找(折半查找):数组有序

代码：
public static int getIndex(int[] arr,int value)
{
  int maxIndex = arr.length-1;
  int minIndex = 0;
  int midIndex = (maxIndex+minIndex)/2;

  while(arr[midIndex]!=value)
  {
      if(arr[midIndex]>value)
      {
          maxIndex = midIndex - 1;
      }
      else if(arr[midIndex]<value)
      {
          minIndex = midIndex + 1;
      }

      if(minIndex > maxIndex)
      {
          return -1;
      }

      midIndex = (maxIndex+minIndex)/2;
  }

    return midIndex;
}

2：Arrays工具类的使用(掌握)
  (1)Arrays是针对数组操作的工具类。
  (2)成员方法：
      public static String toString(数组):把数组变成字符串。
      public static void sort(数组):对数组进行排序。
      public static int binarySearch(int[] arr,int value):二分查找

3：System的方法(掌握)
  (1)系统类，提供了静态的变量和方法供我们使用。
  (2)成员方法：
      public static void exit(int value):退出jvm，非0表示异常退出。
      public static long currentTimeMillis():返回当前系统时间的毫秒值。
          和1970 年 1 月 1 日午夜之间的时间差

4：StringBuffer(掌握)
  (1)字符个数可以发生改变的字符串类。字符串缓冲区类。
  (2)构造方法：
      A:StringBuffer()
      B:StringBuffer(int capacity)
      C:StringBuffer(String str)
  (3)成员方法：(自己补齐)
      A:添加功能

      B:删除功能

      C:替换功能

      D:截取功能

      E:反转功能
  (4)案例：
      字符串反转。

5：基本类型包装类(掌握)
(1)基本类型的数据我们只能使用值，不能做更多的操作。为了方便我们操作，
   java就把每种基本类型进行了包装。提供方法供我们使用。
(2)基本类型和包装类的对应关系
    byte
    short
    int		Integer
    long
    float
    double
    char		Character
    boolean
(3)Integer构造方法
    A:Integer i = new Integer(int num);
    B:Integer i = new Integer(String s);
        注意：s必须是一个由数字字符组成的字符串。
(4)String和int类型的转换
  A:String -- int
      Integer:
          public static int parseInt(String s)
  B:int -- String
      Integer:
          public static String toString(int i)
      String:
          public static String valueOf(int i)
(5)JDK5以后的新特性
  A:自动装箱	基本类型--引用类型
  B:自动拆箱	引用类型--基本类型

  举例：
    Integer i = 100;
    i += 200;
(6)面试题：byte常量池
(7)案例：
  把字符串中的数字字符排序。
  需求："23 98 16 38 42"
  结果："16 23 38 42 98"
     */
  }



}

package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

import java.util.Arrays;
import java.util.Scanner;

public class TwelfthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    //Integer 面试题
    //byte常量池,也就是byte常量范围内的值,直接赋给Integer,是从常量池中获取的

    Integer i1 = new Integer(127);
    Integer i2 = new Integer(127);

    fastLog(i1 == i2);
    fastLog(i1.equals(i2));

    Integer i3 = new Integer(128);
    Integer i4 = new Integer(128);

    fastLog(i3 == i4);
    fastLog(i3.equals(i4));

    Integer i5 = 127;
    Integer i6 = 127;

    fastLog(i5 == i6);
    fastLog(i5.equals(i6));

    Integer i7 = 128;
    Integer i8 = 128;

    fastLog(i7 == i8);
    fastLog(i7.equals(i8));

  }

  public void testExtra(){
//    //title:如何使用Scanner先获取一个int再获取一个字符串
//    Scanner sc = new Scanner(System.in);
//
//    int i = sc.nextInt();
//
//    sc = new Scanner(System.in);
//
//    String s = sc.nextLine();
//
//    fastLog(i + "-------" + s);
  }
  public void testConclusion()
  {
    /*
String类方法 （对字符串进行操作的类）
 构造方法：
 * String()
 * String(byte[] bytes)   			把字节数组转换为字符串
 * String(byte[] bytes, int index, int length)  把字节数组的一部分转换为字符串
 * String(char[] value) 			把字符数组转换为字符串
 * String(char[] value, int index, int length)  把字符数组的一部分转换为字符串
 * String(String str)
 * 判断功能：
 * boolean equals(Object obj)：判断字符串的内容是否相同,区分大小写。
 * boolean equalsIgnoreCase(String str):判断字符串的内容是否相同,不区分大小写。
 * boolean contains(String str):判断字符串对象是否包含给定的字符串。
 * boolean startsWith(String str):判断字符串对象是否以给定的字符串开始。
 * boolean endsWith(String str):判断字符串对象是否以给定的字符串结束。
 * boolean isEmpty():判断字符串对象是否为空。数据是否为空。


 * 字符串的获取功能：
 * int length():获取字符串的长度
 * char charAt(int index):返回字符串中给定索引处的字符
 * int indexOf(int ch):返回指定字符在此字符串中第一次出现的索引
 * int indexOf(String str):返回指定字符串在此字符串中第一次出现的索引
 * int indexOf(int ch,int fromIndex):返回在此字符串中第一次出现指定字符的索引，从指定的索引开始搜索。
 * int indexOf(String str,int fromIndex):返回在此字符串中第一次出现指定字符串的索引，从指定的索引开始搜索。
 * String substring(int start):截取字符串。返回从指定位置开始截取后的字符串。
 * String substring(int start,int end)截取字符串。返回从指定位置开始到指定位置结束截取后的字符串。

/*转换功能
 * byte[] getBytes():把字符串转换成字节数组。
 * char[] toCharArray()：把字符串转换成字符数组。
 * static String copyValueOf(char[] chs):把字符数组转换成字符串。
 * static String valueOf(char[] chs):把字符数组转换成字符串。
 * static String valueOf(int i)基本类型：把int（基本类型）转换成字符串。
 * String toLowerCase()：把字符串变成小写
 * String toUpperCase():把字符串变成大写
 * String concat(String str):拼接字符串。

 *替换功能
 *String replace(char oldChar,char newChar)：用新的字符去替换指定的旧字符
 *String replace(String oldString,String newString)：用新的字符串去替换指定的旧字符串
 *
 *切割功能
 *String[] split(String regex)
 *
 *去除字符串两端空格
 *String trim()
 *
 *按字典顺序比较两个字符串
 *int compareTo(String str)



Arrays类（对数组进行操作的类）
功能：
 *	public static String toString(int[] a):把整型数组转变成字符串。
 *	public static void sort(int[] a)：对数组进行排序
 *	public static int binarySearch(int[] a,int key):对数组进行二分查找。

System类

 * System:System 类包含一些有用的类字段和方法。它不能被实例化。
 *
 * 成员方法：
 * 	public static void exit(int status)：终止当前正在运行的 Java 虚拟机。
 * 	public static long currentTimeMillis():返回以毫秒为单位的当前时间。
 *
 * 自学一个方法，并测试。
 * 		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * 		从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。



StringBuffer类

 * 与String的区别?
 * 		String一旦被赋值，值不能发生改变。而StringBuffer，值还可以改变。
 * 为什么呢?
 * 	StringBuffer采用的是缓冲区机制。
 * 	一开始，首先开辟一些空间，然后，随着数据的最多，然后，还可以继续开辟空间。这些操作针对的是同一个对象。
 *
 * 构造方法：
 * 		StringBuffer()
 * 		StringBuffer(int capacity)
 * 		StringBuffer(String str)
 *
 * String和StringBuffer的转换：通过构造方法可以实现。
 *
 * 成员方法：
 * 		public int length()：字符个数。实际长度。
 * 		public int capacity():字符容量。理论长度。

 * 添加功能
 * 		public StringBuffer append(int i):在末尾追加元素
 * 		public StringBuffer insert(int index,int i):在指定位置添加元素

 * 删除功能：
 * StringBuffer deleteCharAt(int index):删除指定位置字符
 * StringBuffer delete(int start, int end):删除指定开始位置和结束位置间的字符


 *StringBuffer replace(int start, int end, String str)*把开始到结束位置的字符用一个新的字符串给替换。
 * String substring(int start):从指定位置到末尾截取
 * String substring(int start, int end): 从指定位置到结束位置截取
 *StringBuffer reverse()将此字符序列用其反转形式取代


Integer类
int-String

String-int   互相转换
/*
 * int -- String
 * 		String.valueOf(int i)
 * 		Integer.toString(int i)
 *
 * String -- int
 * 		Integer.parseInt(String s)
* 开发原则：
  只要是对象，就先做不为null判断。（前提是这个对象不是你自己写的）

 Person p =?; 传递的参数

  if(p!=null)
  {
      p.show();
  }


*/

  }

  public void testKnowledage()
  {
    /*
java常量池概念

在class文件中，“常量池”是最复杂也最值得关注的内容。

Java是一种动态连接的语言，常量池的作用非常重要，常量池中除了包含代码中所定义的各种基本类型（如int、long等等）和对象型（如String及数组）的常量值还，还包含一些以文本形式出现的符号引用，比如：

类和接口的全限定名；

字段的名称和描述符；

方法和名称和描述符。

在C语言中，如果一个程序要调用其它库中的函数，在连接时，该函数在库中的位置（即相对于库文件开头的偏移量）会被写在程序中，在运行时，直接去这个地址调用函数；

而在Java语言中不是这样，一切都是动态的。编译时，如果发现对其它类方法的调用或者对其它类字段的引用的话，记录进class文件中的，只能是一个文本形式的符号引用，在连接过程中，虚拟机根据这个文本信息去查找对应的方法或字段。

所以，与Java语言中的所谓“常量”不同，class文件中的“常量”内容很非富，这些常量集中在class中的一个区域存放，一个紧接着一个，这里就称为“常量池”。

java中的常量池技术，是为了方便快捷地创建某些对象而出现的，当需要一个对象时，就可以从池中取一个出来（如果池中没有则创建一个），则在需要重复重复创建相等变量时节省了很多时间。常量池其实也就是一个内存空间，不同于使用new关键字创建的对象所在的堆空间。本文只从java使用者的角度来探讨java常量池技术，并不涉及常量池的原理及实现方法。个人认为，如果是真的专注java,就必须对这些细节方面有一定的了解。但知道它的原理和具体的实现方法则不是必须的。

常量池中对象和堆中的对象
[java] view plain copy
public class Test{

Integer i1=new Integer(1);
   Integer i2=new Integer(1);
//i1,i2分别位于堆中不同的内存空间

   System.out.println(i1==i2);//输出false


   Integer i3=1;
   Integer i4=1;
//i3,i4指向常量池中同一个内存空间

   System.out.println(i3==i4);//输出true

//很显然，i1,i3位于不同的内存空间

System.out.println(i1==i3);//输出false

}
8种基本类型的包装类和对象池
java中基本类型的包装类的大部分都实现了常量池技术，这些类是Byte,Short,Integer,Long,Character,Boolean,另外两种浮点数类型的包装类则没有实现。另外Byte,Short,Integer,Long,Character这5种整型的包装类也只是在对应值小于等于127时才可使用对象池，也即对象不负责创建和管理大于127的这些类的对象。以下是一些对应的测试代码：

[java] view plain copy
public class Test{

public static void main(String[] args){

   //5种整形的包装类Byte,Short,Integer,Long,Character的对象，

   //在值小于127时可以使用常量池

   Integer i1=127;

   Integer i2=127;

   System.out.println(i1==i2)//输出true

   //值大于127时，不会从常量池中取对象

   Integer i3=128;

   Integer i4=128;

   System.out.println(i3==i4)//输出false

   //Boolean类也实现了常量池技术

   Boolean bool1=true;

   Boolean bool2=true;

   System.out.println(bool1==bool2);//输出true

   //浮点类型的包装类没有实现常量池技术

   Double d1=1.0;

   Double d2=1.0;

   System.out.println(d1==d2)//输出false



}

}
String也实现了常量池技术
String类也是java中用得多的类，同样为了创建String对象的方便，也实现了常量池的技术,测试代码如下:

[java] view plain copy
public class Test{

public static void main(String[] args){

//s1,s2分别位于堆中不同空间

String s1=new String("hello");

String s2=new String("hello");

System.out.println(s1==s2)//输出false

//s3,s4位于池中同一空间

String s3="hello";

String s4="hello";

System.out.println(s3==s4);//输出true

}

}
最后
细节决定成败，写代码更是如此。

在JDK5.0之前是不允许直接将基本数据类型的数据直接赋值给其对应地包装类的，如：Integer i = 5;

但是在JDK5.0中支持这种写法，因为编译器会自动将上面的代码转换成如下代码：Integer i=Integer.valueOf(5);

这就是Java的装箱.JDK5.0也提供了自动拆箱. Integer i =5;  int j = i;

Integer的封装：

[java] view plain copy
public static Integer valueOf(int i) {
    final int offset = 128;
    if (i >= -128 && i <= 127) { // must cache
        return IntegerCache.cache[i + offset];
    }
      return new Integer(i);
 }


private static class IntegerCache {



private IntegerCache(){}
static final Integer cache[] = new Integer[-(-128) + 127 + 1];
    static {
        for(int i = 0; i < cache.length; i++)
        cache[i] = new Integer(i - 128);
    }
}
由于cache[]在IntegerCache类中是静态数组，也就是只需要初始化一次，即static｛......｝部分，所以，如果Integer对象初始化时是-128~127的范围，就不需要再重新定义申请空间，都是同一个对象---在IntegerCache.cache中，这样可以在一定程度上提高效率。

*/
  }
}

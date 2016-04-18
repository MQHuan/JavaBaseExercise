package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class ThirdDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    fastLog("类实例化过程");
    // Demo d = new Demo();

//    class Demo
//    {
//      //构造代码块
//      {
//
//        System.out.println("构造代码块执行!");
//      }
//
//      //静态代码块
//      static{
//
//        System.out.println("静态代码块执行!");
//      }
//
//      //静态函数
//      static void Print()
//      {
//        System.out.println("静态函数执行执行!");
//
//      }
//      //构造函数
//      Demo()
//      {
//        System.out.println("构造函数执行!");
//      }
//  }


    //以上代码的输出结果为
//    静态代码块执行!
//    构造代码块执行!
//    构造函数执行!


  }

  public void testKnowledage()
  {

    /*
    *
    知识点1
private  可以修饰成员变量
	 可以修饰成员方法
 用private成员变量和成员方法只可以在本类中访问

假如我要在其他类中访问被私有的成员变量和成员方法？怎么办
方法一：可以通过本类中公共的方法访问，也就是咱们的标准代码get 和set （标准代码一定掌握）
方法二：可以通过带参构造去访问。



知识点2 this关键字
this代表谁，哪个对象调用的这个方法，那么这个方法中的this就代表哪个对象。
this 关键字什么时候用？  在局部变量和成员变量重名的时候。 解决了局部变量隐藏了成员变量。



知识点3 构造方法
特点：
函数名与类名相同!
没有返回值类型!
没有具体的返回值!
作用：
	给对象进行初始化(给对象的成员变量赋值)。

假如说你没有给出构造方法，那么系统是会默认给出无参构造方法。
假如你给出了构造方法，那么系统将不会给出构造方法了。


知识点4  static
static可以修饰成员变量 ， 被static修饰的成员变量：新特性被该类下所有的对象所共享。
static可以修饰成员方法，  被static修饰的成员方法新特性：这个方法只能访问静态的成员变量和静态的成员方法

被static修饰的成员 可以直接被类名所调用。也可以通过对象调用。
被static修饰的成员 是随着class文件的加载而加载，它优先于对象存在。
需要注意的地方：被static修饰的方法里面是没有this的
*/
  }

  public void testConclusion()
  {

/*
1：封装(理解)
  (1)隐藏实现的细节，提供公共的访问方式。
	类，方法等其实都是封装的具体体现。
  (2)private关键字
	A:用于修饰成员变量和成员方法。
	B:被修饰的内容在其他类中是不可以被访问的。
  (3)常见的应用：(掌握)
	类中的所有成员变量私有，给出对应的get/set方法。

代码体现：

class Student
{
	private String name;
	private int age;

	public Student(){}

	public Student(String name,int age)
	{
	  this.name = name;
	  this.age = age;
	}

	public void setName(String name)
	{
	  this.name = name;
	}

	public String getName()
	{
	  return name;
	}

	public void setAge(int age)
	{
	  this.age = age;
	}

	public int getAge()
	{
	  return age;
	}
}

2：构造方法(掌握)
  (1)格式及特点
	  格式：
		访问权限修饰符	类名(参数...){}

		访问权限修饰符:
			public,private
	  特点：
		A:方法名和类名相同
		B:没有返回值类型
		C:没有具体的返回值
  (2)注意事项：
	  A:如果你不给构造方法，jvm会自动给你一个无参构造方法。
	  B:如果你给出了构造方法，那么，jvm将不再提供无参构造方法。
		这个时候，你如果要使用无参构造方法：只能自己提供

		推荐：永远手动给出无参构造方法。

3：this关键字(掌握)
	(1)是一个关键字。代表当前类对象的引用。
		简单记：在方法中，哪个对象调用方法，this就代表谁。
		除了静态方法外，所有的方法中有隐含的有一个this引用
	(2)应用场景：
		解决局部变量隐藏成员变量问题。

4：static关键字(理解)
  (1)是一个关键字。可以修饰成员变量和成员方法。
  (2)静态的特点：
	A:随着类的加载而加载
	B:优先于对象存在
	C:被类的所有对象共享
	D:可以通过类名调用
  (3)静态的注意事项：
	A:在静态方法中是没有this关键字的。
	B:静态方法只能访问静态成员。
  (4)静态内容的调用：
	A:被对象调用
	B:被类名调用

	推荐被类名调用。
  (5)什么时候该用static呢?
	如果某个内容是所有对象共享的，就用静态修饰。
	举例：
		水杯和饮水机。
		厕所和人。
		老师和学生。

5：Math类的随机数(掌握)
	类名调用静态方法。

	包：java.lang
	类：Math
	方法：public static double random():

	java.lang包下的类是不用导包就可以直接使用的。

	产生1-100之间的随机数：
	int number = (int)(Math.random()*100)+1;
	*/
  }

}

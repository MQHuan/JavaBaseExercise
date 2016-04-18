package com.teacher.javabase.javabaseexercise.demo;


import android.util.Log;

import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

/**
 * Created by Administrator on 2016/4/10.
 */
public class SecondDay_Sort_BaseGrammarDemoActivity extends DemoBaseActivity {

  public void testMain() {
    //title:SortArithmetic
    //下述排序中,每次符合交互条件的两个元素都会在在堆内存中交换,因为堆内存中存在比较耗内存.
//    为了提高速度,可以不先交换元素的位置,可以对元素的角标进行排序,这样就把在堆内存中的消耗转到栈内存中,从而提高了运算的速度.
//
//     然而实际开发时,我们可以直接用java自带的排序方法,
//     Arrays.sort(array);

    int [] array1 = {9,8,7,6,5,4,3,2,1};
    int [] array2 = {1,7,4,3,5,8,6,9,2};

    fastLog("原数组:   ");
    testPrintArray(array1);
    fastLog("冒泡排序: ");
    testBubble(array1);
    testPrintArray(array1);

    fastLog("原数组:   ");
    testPrintArray(array2);
    fastLog("选择排序: ");
    testSort(array2);
    testPrintArray(array2);
  }

  public void testSort(int [] arr)
  {

    for(int i = 0; i < arr.length;i++){

      for(int j = i + 1; j < arr.length;j++)
      {
        if(arr[i] > arr[j])
        {
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }

  }


  public void testBubble(int [] arr)
  {

    for(int n = 1; n < arr.length;n++)
      for(int i = 0; i < arr.length - n;i++){

        if(arr[i] > arr[i+1])
        {

          int temp = arr[i+1];
          arr[i+1] = arr[i];
          arr[i] = temp;
        }
      }


  }


  public void testPrintArray(int [] arr)
  {
    StringBuffer sb = new StringBuffer();

    for(int i = 0; i < arr.length;i++)
    {
      sb.append(arr[i]);
    }

    fastLog(sb.reverse());
  }

  public void testConclusion()
  {
    /*
1：函数(掌握)
  (1)定义在类中，有特定功能的一段小程序。
  (2)函数的格式：
	修饰符 返回值类型 函数名(形参类型 形式参数1,形参类型 形式参数2...)
	{
		函数体;
		reutrn 返回值;
	}

	A:修饰符	public static
	B:返回值类型	程序最终结果的数据类型
	C:函数名	其实就是函数的名称,方便我们调用。
	D:参数
		形参类型	数据类型
		形式参数	就是接收实际参数的变量
		实际参数	就是实际参与操作的变量(常量)
	E:函数体	就是按照正常的逻辑完成功能的代码。
	F:返回值	就是程序的最终结果
	G:reutrn 返回值	哪里调用程序，return就把结果返回到哪里。
(3)函数的特点：
	A:函数与函数之间是平级关系。不能在函数中定义函数。
	B:运行特点	函数只有被调用才执行。
(4)案例：
	有明确返回值的例子：

	A:求两个数据的和
	B:求两个数据的最大值
	C:比较两个数是否相等

	void类型例子：

	A:nn乘法表
	B:根据给定的行和列输出一个*组成的长方形
(5)函数的调用
	A:有明确返回值
		a:单独调用	一般没有意义。
		b:输出调用	但是如果想拿结果继续操作，就有问题了。所以，不好。
		c:赋值调用	推荐方式。

	B:void类型
		单独调用
(6)函数重载
  A:函数名相同,参数列表不同(个数不同,对应的类型不同)。
	与返回值类型无关。

  B:举例：
	public static int sum(int a,int b){...}
	public static int sum(int a,int b,int c){...}
	public static int sum(float a,float b){...}

2：数组(掌握)
  (1)数组是存储同一种类型的多个元素的容器。
  (2)好处：数组中的元素会被自动从0开始编号，方便我们获取。
  (3)格式：
	A:int[] arr = new int[3];
	B:int arr[] = new int[3];
	C:int[] arr = new int[]{1,2,3};
	D:int[] arr = {1,2,3};

	推荐A和D。
(4)Java内存图：
	A:栈	存储局部变量使用。
			使用完毕，立马消失。

	B:堆	所有new出来的都在堆里面。
		a:每一个实体都有地址值
		b:每一个实体内的内容都有默认值
			整数：0
			浮点数：0.0
			字符：'\u0000'
			布尔：false
		c:在垃圾回收器空闲的时候被回收。

	C:方法区
	D:本地方法区
	E:寄存器
(5)操作：(请自己补齐)

	数组的索引。
	数组的长度。
	数组名.length

	A:数组的遍历

	B:数组获取最值

	C:数组的查找
(6)二维数组：
	格式：
		A:int[][] arr = new int[3][2];
		B:int[][] arr = new int[3][];
		C:int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};


	遍历：(请自己补齐)

	应用：遍历求和。
*/
  }

  public void testKeyWord(int [] arr)
  {
	  /*
	   *生僻的关键字：
	    *  native
	    *  strictfp
	    *  transient
	    *  volatile
	    *  assert
	    *
	   */
  }


  public void testNameStandard(int [] arr) {
	  /*
包名：多单词组成时所有字母都小写。
例如：xxxyyyzzz

类名接口名：多单词组成时，所有单词的首字母大写。
例如：XxxYyyZzz

变量名和函数名：多单词组成时，第一个单词首字母小写，第二个单词开始每个单词首字母大写。
例如：xxxYyyZzz

常量名：所有字母都大写。 多单词时每个单词用下划线连接。
例如：XXX_YYY_ZZZ

	    *
	   */
  }

  public void testNote(){

//1.单行注释
//格式：//注释文字
//
//2.多行注释
//格式：/*注释文字*/
//
//3.文档注释
//格式：/**注释文字*/
//文档注释，是java特有的注释，其中注释内容可以被JDK提供的工具javadoc所解析，生成一
//套以网页文件形式体现的该程序的说明文档。*/
  }

  public void testDataType(){
/*
byte1个字节
short2个字节
int4个字节
long8个字节
float4个字节
double8个字节
char2个字节
*****************************
				   整数类型(byte, short, int, long)
			数值型 浮点类型(float, double)
基本数据类型 字符型(char)
			布尔型(boolean)

			 类(class)
引用数据类型	 接口(interface)
			 数值([ ])
************************
1、 整数默认类型：int类型，小数默认类型：double类型。
2、 double类型的小数精度比float类型的小数更高。
* */
  }

  public void testInterview(){
/*
表达式的数据类型自动提升：
所有的byte型、 short型和char的值将被提升到int型。
如果一个操作数是long型，计算结果就是long型；
如果一个操作数是float型，计算结果就是float型；
如果一个操作数是double型，计算结果就是double型。*/

/***************question 1**************/
	  byte b = 3 + 7;
	  byte b1 = 3;
	  byte b2 = 7;
//	  b = b1 + b2; error
/*
错误原因：涉及到编译器编译程序时候的细节，之所以byteb=3+7;，没有报错，是因为3和7都是
常量，编译器知道结果是10，并且在byte范围之内，因此就自动进行了强转，所以不会报错。 而b=b1
+b2;中b1和b2都是变量，编译器编译程序是一行一行编译的，它根本不知道b1和b2到底是多少，两个
byte类型的数据相加时，首先都会被提升为int类型，他们的和也是int类型，其值可能会超过byte的范
围，因此就会报错*/

/***************question 2**************/
	  short s = 3;
	  s += 4;
	  fastLog("s = "+s);
//在执行s+=4;语句时，编译器在编译的时候，默认进行了强制类型转换，也就是将int类型的数
//据转换成short类型的数据。
	  short s1 = 3;
//	  s1 = s1 + 4; error
//在执行s=s+4;语句时，编译器在编译的时候，默认并没有强制类型转换。 所以，s是short类
//型，4是int类型，s会自动提升为int类型，相加的和也是int类型，赋值给short类型的变量肯定会损失精
//度。 这时候就需要进行强制类型转换：s=(short)(s+4);。
  }

}



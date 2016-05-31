package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class FirstDaySummaryHexadecimalConversionDemoActivity extends DemoBaseActivity {



  public void testMain() {
    //title:NumTranslate

    int num = 15;

    testToBinary(num);
    testToOctonary(num);
    testToHexadecimal(num);

  }
  public void testToBinary(int num)
  {
    StringBuffer sb = new StringBuffer();

    fastLog("the binary      of "+ num + " is :");

    while(num!=0)
    {
      int temp = num & 1;
      sb.append(temp);

      num = num>>1;
    }

    fastLog(sb.reverse());

  }

  public void testToOctonary(int num)
  {
    StringBuffer sb = new StringBuffer();

    fastLog("the Octonary    of "+ num + " is :");

    while(num!=0)
    {
      int temp = num & 7;
      sb.append(temp);

      num = num>>3;
    }

    fastLog(sb.reverse());

  }

  public void testToHexadecimal(int num)
  {
    StringBuffer sb = new StringBuffer();

    fastLog("the Hexadecimal of "+ num + " is :");

    while(num!=0)
    {
      int temp = num & 15;
      if(temp > 9)
        sb.append((char)((temp-10) + 'A'));
      else
        sb.append(temp);

      num = num>>4;
    }

    fastLog(sb.reverse());

  }

  public void testConclusion()
  {
    /*
2：面试题(理解)
(1)请用最有效率的代码写出2乘以8
    2<<3
(2)请交换两个变量。
  int a = 10;
  int b = 20;

  开发：临时变量
      int temp = a;
      a = b;
      b = temp;

  面试：位^运算符
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;


  强制转换的原理;

比如int强转为byte,
就是在int的二进制表示式上截取最右变的八位(即byte的长度)


二进制中负数的大小等于它的反码的补码的大小
(即"取反加一"即可得到大小)

数据结构中的栈是一种抽象概念,是一种理论
内存中的栈是具体的实现,是操作系统中的一种存储数据的方法
无论哪种栈,都遵循后进先出的概念


byte相关面试题:

byte b1 = 1;
byte b2 = 2;
byte b3 = b1 + b2;
byte b4 = 1 + 2;

b3报错,因为在编译时b1 + b2运算首先进行了类型的提升,
byte提升为int型再进行运算,当把int赋值给byte时,会有损失精度的风险,
所以编译报错.
而右边是常量相加时,编译器先计算结果,看该值是否是左边能表示的范围,
如果是,就不报错

*/
  }

  public  void testQuickButton()
  {
    /*
Ctrl+G / Ctrl+Alt+Shift+G：查询变量或者函数或者类在哪里被使用或被调用，后者是前者的复杂表现，可以选择查询范围等。

Alt+H：查找功能，全局查找

F4：查看类继承关系

F2：查看文档说明（函数使用说明）

Ctrl+E：查看最近打开过的文件

Ctrl+Shift+E：查看最近编辑过的文件

double Shift：全局查找，这个查看和Alt+H稍稍有些不同，这个是全局文件查找，到文件名称层面。

Ctrl+Shift+R：快速定位到你所想打开的文件。

Alt+↑：光标所在位置那行代码往上移动

Alt+↓：光标所在位置那行代码往下移动

Ctrl+D：删除光标所在位置那行代码

Ctrl+X：剪切光标所在位置那行代码

Alt+Shift+↓/Ctrl+C：复制光标所在行代码到下一行

Ctrl+O:快捷查找当前类中的函数，变量

Ctrl+Shift+R：修改名称

Alt+Enter：导入包

Alt+←：后退，定位到上个查看或者编辑的地方

Alt+→：往前定位，比如你定位到上个点后，想回去，就可以用这个快捷键

Ctrl+/：当行注释，反注释再按一次即可

Ctrl+Shift+/：模块注释，反注释再按一次即可,注意这边的”/“不能用小键盘的

Ctrl+Shift+小键盘/：折叠代码（Ctrl+Shift+小键盘*这个不灵了，今天没空了，后面会针对这个问题做解决，并更新上来），当然笔记本没小键盘，你可以自己改快捷键

Ctrl+Alt+S：打开settings界面

Ctrl+Alt+Shift+S：打开Project Structure界面

Alt+Shift+X：运行（Run）

Alt+Shift+D：调试运行（Debug）

Ctrl+F9：编译工程

Ctrl+Shift+K：push文件到Server（git）

Debug类快捷键

F5：但不调试进入函数内部。

F6：但不调试不进入函数内部。

F7：由函数内部返回调用处。

F8：执行到下一个断点，没断点则执行完成。

Action	Mac OSX	Win/Linux
注释代码(//)	Cmd + /	Ctrl + /
注释代码	Cmd + Option + 	Ctrl + Shift + /
格式化代码	Cmd + Option + L
            Ctrl + Alt + L
清除无效包引用	Option + Control + O
                Alt + Ctrl + O
查找	Cmd + F	Ctrl + F
查找+替换	Cmd + R	Ctrl + R
上下移动代码	Option + Shift + Up/Down
                Alt + Shift + Up/Down
删除行	Cmd + Delete	Ctrl + Y
扩大缩小选中范围	Option + Up/Down
                    Ctrl + W/Ctrl + Shift + W
快捷生成结构体	Cmd + Option + T
                Ctrl + Alt + T
快捷覆写方法	Ctrl + O	Ctrl + O
快捷定位到行首/尾	Cmd + Left/Right
                    Ctrl + Left/Right
折叠展开代码块	Cmd + Plus,Minus
                Ctrl + Plus/Minus
折叠展开全部代码块	Cmd + Shift + Plus,Minus
                    Ctrl + Shift + Plus,Minus
文件方法结构	Cmd + F12
                Ctrl + F12
查找调用的位置	Ctrl + Option + H
                Ctrl + Alt + H
大小写转换	Cmd + Shift + U
            Ctrl + Shift + U
          */
  }


  public void testBasicConcepts() {

	  /*
J2EE(JavaEE): Java 2 Platform Enterprise Edition
J2SE(JavaSE): Java 2 Platform Standard Edition
J2ME(JavaME): Java 2 Platform Micro Edition

JVM : Java Virtual Machine
JRE: Java Runtime Environment
JDK: Java Development Kit
JRE: JVM+类库(Java library)
JDK: JRE+JAVA的开发工具

	   */
  }

  public void testWindowsDosCommand() {
	  /*
Windows的DOS命令：
dir: 列出当前目录下文件及文件夹
md : 创建目录
rd : 删除目录
cd : 进入指定目录
cd .. ：退回到上一级目录
cd \：退回到根目录
del : 删除文件
exit : 退出DOS命令行
D: ：切换到D盘
	   */
  }

  public void testJavaCompileProcess() {
	  /*
.java文件=(javac.exe编译)=》.class文件=(java.exe运行)=》结果
	    */
  }



}

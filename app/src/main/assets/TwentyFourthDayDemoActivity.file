package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class TwentyFourthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {

  }
  public void testKnowledage(){
    /*
网络编程:就是用语言(java)实现多台计算机的通讯

三大要素:
A:IP地址
  网络中每一台计算机的唯一标识

B:端口号:
  用于标识进程的的逻辑地址,

C:协议
  定义通讯规则


一:IP地址:
  要想让网络中的计算机进行通讯,你必须为每一台计算机定义一个标识号.
  通过这个标识号来指定要接收数据的计算机和识别发送数据的计算机.
  在TCP/IP协议中,这个标识号就是IP地址.

1.使用IP地址
  那么,我们如何获取和操作IP地址呢?
  为了方便我们对IP地址的获取和操作
  java提供了一个类InetAddress供我们使用

  给出一个十进制的IP地址
  192.163.8.100
  而它在网络中实际上是如下表示的:
  11000000 10101000 00000011 01100100

  因为采用二进制配置IP地址不方便记忆
  所以,为了方便记忆,把这种表示方式做了改进,"点分十进制"


IP地址的分类：
A类	1.0.0.1---127.255.255.254
  (1)10.X.X.X是私有地址(私有地址就是在互联网上不使用，而被用在局域网络中的地址)
  (2)127.X.X.X是保留地址，用做循环测试用的。
B类	128.0.0.1---191.255.255.254	172.16.0.0---
  (1)172.31.255.255是私有地址。
  (2)169.254.X.X是保留地址。
C类	192.0.0.1---223.255.255.
  (1)254	192.168.X.X是私有地址
D类	224.0.0.1---239.255.255.254
E类	240.0.0.1---247.255.255.254

IP地址的组成
  IP地址 = 网络号码 +  主机地址

IP地址的组成：
  IP地址 = 网络号码+主机地址

  A类IP地址:第一段号码为网络号码，剩下的三段号码为本地计算机的号码
      256*256*256	---	16777216
  B类IP地址:前二段号码为网络号码，剩下的二段号码为本地计算机的号码
      256*256	---	65536
  C类IP地址:前三段号码为网络号码，剩下的一段号码为本地计算机的号码
      256

查看本机IP:
命令行输入ipconfig
IPv4后面就是,
IPv4，是互联网协议（Internet Protocol，IP）的第四版，也是第一个被广泛使用，构成现今互联网技术的基石的协议。


二:端口
  逻辑端口 我们指的就是逻辑端口
  A:每个网络程序都会至少有一个逻辑端口
  B:用于标识进程的逻辑地址,不同的进程的表示不一样
  C:有效端口:0~65535,其中的0~1024系统使用或保留端口.
  (可以通过360查看端口)

三:协议
定义的规则
  TCP
    建立连接通道
    数据无限制
    面向连接(三次握手)
    可靠
    速度慢

  举例:蓝牙,QQ单聊,打电话

  UDP
    把数据打包
    数据有限制
    面向无连接
    不可靠
    速度快

  举例:QQ聊天室(群聊)

Socket:
  是为网络编程提供的一种机制,包装了有端口和IP地址

  通讯的两端都有Socket间的通讯;
  网络通讯其实就是Socket间的通讯.
  数据在两个Socket间通过IO传输

  Socket编程 = 套接字编程 = 网络编程


InetAddress:表示IP地址
没有构造方法,想到那些问题?
A.成员都是静态的
B.肯定有静态方法返回该类的对象

例子:
  InetAddress address = Inet4Address.getByName("USER-20160219QF");
  //InetAddress address = Inet4Address.getByName("192.168.1.109");

  String ip= address.getHostAddress();
  String nameString = address.getHostName();
  System.out.println(ip + "--------" + nameString);


UDP协议发送数据步骤:
  A.创建发送端Socket服务对象
  B.创建数据,并把数据打包.
  C.发送数据
  D.释放资源

例子:
//创建发送端Socket服务对象
DatagramSocket ds = new DatagramSocket();

//创建数据,把数据打包
String s = "Hello UDP,我来了";
int length = s.length();

byte[] b = s.getBytes();
InetAddress address = InetAddress.getByName("USER-20160219QF");

int port = 12306;

DatagramPacket dp = new DatagramPacket(b, length,address,port);

//发送数据
ds.send(dp);

//释放资源
ds.close();


UDP协议接收数据步骤:
  A:创建接收端Socket服务对象
  B:创建数据包(接收容器)
  C:调用接收方法
  D:解析数据包,把数据显示在控制台
  E:释放资源


实例:
//1.创建接收端Socket服务对象
DatagramSocket ds = new DatagramSocket(12306);

//2.创建接收数据包对象(接收容器)
byte[] bytes = new byte[1024];

DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

//3.调用接收方法
ds.receive(dp);

//4.解析数据包
InetAddress ia = dp.getAddress();
String ip = ia.getHostAddress();

byte []bytes2 = dp.getData();
String data = new String(bytes2);

System.out.println(ip + "....." + data);
//5.释放资源
ds.close();

    * */
  }
  public void testConclusion(){
    /*

    * */
  }


}

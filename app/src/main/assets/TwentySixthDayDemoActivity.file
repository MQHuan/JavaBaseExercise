package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class TwentySixthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {

  }

  public void testConclusion(){
    /*

JAVA反射机制

JAVA反射机制是在运行状态中，对于任意一个类，
都能够知道这个类的所有属性和方法；对于任意一个对象，
都能够调用它的任意一个方法和属性；
这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制。

JAVA反射（放射）机制：“程序运行时，允许改变程序结构或变量类型，
这种语言称为动态语言”。从这个观点看，Perl，Python，Ruby是动态语言，
C++，Java，C#不是动态语言。但是JAVA有着一个非常突出的动态相关机制：
Reflection，用在Java身上指的是我们可以于运行时加载、探知、使用编译期间完全未知的classes。
换句话说，Java程序可以加载一个运行时才得知名称的class，
获悉其完整构造（但不包括methods定义），并生成其对象实体、或对其fields设值、或唤起其methods。

JAVA反射机制是在运行状态中,对于任意一个类,都能够得到这个类的所有属性和方法;对于任意一个对象,都能够调用它的任意一个方法;这种动态获取的信息以及动态调用对象的方法的功能称为java语言的反射机制.

    概括一下:

    反射就是让你可以通过名称来得到对象(类,属性,方法)的技术。

    例如我们可以通过类名来生成一个类的实例;

    知道了方法名,就可以调用这个方法;知道了属性名就可以访问这个属性的值。

    1、获取类对应的Class对象

    运用(已知对象)getClass():Object类中的方法,每个类都拥有此方法。

    如: String str = new String();

    Class strClass = str.getClass();运用(已知子类的class) Class.getSuperclass():Class类中的方法,返回该Class的父类的Class;运用(已知类全名):Class.forName() 静态方法运用(已知类): 类名.class

    2、通过类名来构造一个类的实例

    a、调用无参的构造函数:

    Class newoneClass = Class.forName(类全名); newoneClass.newInstance();

    b、调用有参的构造函数：我们可以自定义一个函数。

    public Object newInstance(String className, Object[] args) throws Exception {

    //args为参数数组

    Class newoneClass = Class.forName(className); //得到参数的Class数组(每个参数的class组成的数组),由此来决定调用那个构造函数Class[] argsClass = new Class[args.length]; for (int i = 0, j = args.length; i < j; i++) { argsClass[i] = args[i].getClass();

    }

    Constructor cons = newoneClass.getConstructor(argsClass); //根据argsClass选择函数return cons.newInstance(args); //根据具体参数实例化对象。

    }

    3、得到某个对象的属性

    a、非静态属性:首先得到class,然后得到这个class具有的field,然后以具体实例为参数调用这个field

    public Object getProperty(Object owner, String fieldName) throws Exception { Class ownerClass = owner.getClass();//首先得到class Field field = ownerClass.getField(fieldName); //然后得到这个class具有的field,也可以通过getFields()得到所有的field Object property = field.get(owner); //owner指出了取得那个实例的这个属性值,如果这个属性是非公有的,这里会报IllegalAccessException。

    return property;

    }

    b、静态属性：

    只有最后一步不同,由于静态属性属于这个类,所以只要在这个类上调用这个field即可Object property = field.get(ownerClass);

    4、执行某对象的方法

    public Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception { Class ownerClass = owner.getClass(); //也是从class开始的//得到参数的class数组,相当于得到参数列表的类型数组,来取决我们选择哪个函数。

    Class[] argsClass = new Class[args.length]; for (int i = 0, j = args.length; i < j; i++) { argsClass[i] = args[i].getClass();

    }

    //根据函数名和函数类型来选择函数

    Method method = ownerClass.getMethod(methodName, argsClass); return method.invoke(owner, args);//具体实例下,具体参数值下调用此函数

    }

    5、执行类的静态方法

    和上面的相似只是最后一行不需要指定具体实例

    return method.invoke(null, args);

    6、判断是否为某个类的实例

    public boolean isInstance(Object obj, Class cls) { return cls.isInstance(obj);

    }

    测试bean类:SimpleBean.java

    Java代码

    package com.royzhou.bean;

    public class SimpleBean {

    private String name;

    private String[] hobby;

    public SimpleBean() {

    }

    public SimpleBean(String name, String[] hobby) { this.name = name; this.hobby = hobby;

    }

    public void setName(String name) {

    this.name = name;

    }

    public String getName() {

    return this.name;

    }

    public void setHobby(String[] hobby) {

    this.hobby = hobby;

    }

    public String[] getHobby() {

    return this.hobby;

    }

    public String toString() {

    String returnValue = super.toString() + "\n"; returnValue += "name:=" + this.name + "\n"; if(this.hobby != null) {

    returnValue += "hobby:";

    for(String s : this.hobby) { returnValue += s + ",";

    }

    returnValue += "\n";

    }

    return returnValue;

    }

    }

    package com.royzhou.bean;

    public class SimpleBean {

    private String name;

    private String[] hobby;

    public SimpleBean() {

    }

    public SimpleBean(String name, String[] hobby) { this.name = name; this.hobby = hobby;

    }

    public void setName(String name) {

    this.name = name;

    }

    public String getName() {

    return this.name;

    }

    public void setHobby(String[] hobby) {

    this.hobby = hobby;

    }

    public String[] getHobby() {

    return this.hobby;

    }

    public String toString() {

    String returnValue = super.toString() + "\n"; returnValue += "name:=" + this.name + "\n"; if(this.hobby != null) {

    returnValue += "hobby:";

    for(String s : this.hobby) { returnValue += s + ",";

    }

    returnValue += "\n";

    }

    return returnValue;

    }

    }

    * */
  }


}

package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

import java.util.HashMap;
import java.util.Map;

public class EighteenthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {
    Map map = new HashMap();

    map.put("炒粉","六块");
    map.put("炒饭","十块");
    map.put("炒鱿鱼","八块");

    for(Object obj : map.keySet()){
      Object value = map.get(obj);
      fastLog(obj);
      fastLog(value);
    }

  }

  public void testConclusion()
  {
/*
Map简介
将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值。此接口取代 Dictionary 类，后者完全是一个抽象类，而不是一个接口。
　　Map 接口提供三种collection 视图，允许以键集、值集或键-值映射关系集的形式查看某个映射的内容。映射顺序 定义为迭代器在映射的 collection 视图上返回其元素的顺序。某些映射实现可明确保证其顺序，如 TreeMap 类；另一些映射实现则不保证顺序，如HashMap 类。
　　注：将可变对象用作映射键时必须格外小心。当对象是映射中某个键时，如果以影响 equals 比较的方式更改了对象的值，则映射的行为将是不确定的。此项禁止的一种特殊情况是不允许某个映射将自身作为一个键包含。虽然允许某个映射将自身作为值包 含，但请格外小心：在这样的映射上 equals 和 hashCode 方法的定义将不再是明确的。
　　所有通用的映射实现类应该提供两个“标准的”构造方法：一个 void （无 参数）构造方法，用于创建空映射；一个是带有单个 Map 类型参数的构造方法，用于创建一个与其参数具有相同键-值映射关系的新映射。实际上，后一个构造方法允许用户复制任意映射，生成所需类的一个等价映射。尽 管无法强制执行此建议（因为接口不能包含构造方法），但是 JDK 中所有通用的映射实现都遵从它。
　　此接口中包含的“破坏”方法可修改其操作的映射，如果此映射不支持该操作，这些方法将抛出 UnsupportedOperationException。如果是这样，那么在调用对映射无效时，这些方法可以（但不要求）抛出 UnsupportedOperationException。例如，如果某个不可修改的映射（其映射关系是“重叠”的）为空，则对该映射调用 putAll(Map) 方法时，可以（但不要求）抛出异常。
　　某些映射实现对可能包含的键和值有所限制。例如，某些实现禁止 null 键和值，另一些则对其键的类型有限制。尝试插入不合格的键或值将抛出一个未经检查的异常，通常是 NullPointerException 或 ClassCastException。试图查询是否存在不合格的键或值可能抛出异常，或者返回 false；某些实现将表现出前一种行为，而另一些则表现后一种。一般来说，试图对不合格的键或值执行操作且该操作的完成不会导致不合格的元素被插入映射 中时，将可能抛出一个异常，也可能操作成功，这取决于实现本身。这样的异常在此接口的规范中标记为“可选”。
　　此接口是 Java Collections Framework 的成员。
　　Collections Framework 接口中的很多方法是根据 equals 方法定义的。例如，containsKey(Object key) 方法的规范中写道：“当且仅当此映射包含针对满足 (key==null ? k==null : key.equals(k)) 的键 k 的映射关系时，返回 true”。不 应将此规范解释为：调用具有非空参数 key 的 Map.containsKey 将导致对任意的键 k 调用 key.equals(k)。实现可随意进行优化，以避免调用 equals，例如，可首先比较两个键的哈希码（Object.hashCode() 规范保证哈希码不相等的两个对象不会相等）。一般来说，只要实现者认为合适，各种 Collections Framework 接口的实现可随意利用底层 Object 方法的指定行为。
　　常用操作说明
　　void clear()
　　从此映射中移除所有映射关系（可选操作）。
　　boolean containsKey(Object key)
　　如果此映射包含指定键的映射关系，则返回 true。
　　boolean containsValue(Object value)
　　如果此映射将一个或多个键映射到指定值，则返回 true。
　　Set<Map.Entry<K,V>> entrySet()
　　返回此映射中包含的映射关系的 Set 视图。
　　boolean equals(Object o)
　　比较指定的对象与此映射是否相等。
　　V get(Object key)
　　返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
　　int hashCode()
　　返回此映射的哈希码值。
　　boolean isEmpty()
　　如果此映射未包含键-值映射关系，则返回 true。
　　Set<K> keySet()
　　返回此映射中包含的键的 Set 视图。
　　V put(K key, V value)
　　将指定的值与此映射中的指定键关联（可选操作）。
　　void putAll(Map<? extends K,? extends V> m)
　　从指定映射中将所有映射关系复制到此映射中（可选操作）。
　　V remove(Object key)
　　如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
　　int size()
　　返回此映射中的键-值映射关系数。
　　Collection<V> values()
　　返回此映射中包含的值的 Collection 视图。
Map的一般用法
1.声明一个Map :
Map map = new HashMap();
2 .向map中放值 ，注意： map是key-value的形式存放的，如：
map.put("sa","dd");
3 .从map中取值 :
String str = map.get("sa").toString,
结果是： str = "dd'
4 .遍历一个map,从中取得key和value :
Map m= new HashMap();
for(Object obj : map.keySet()){
Object value = map.get(obj );
}

    * */
  }


}

package com.teacher.javabase.javabaseexercise.demo;


import com.teacher.javabase.javabaseexercise.DemoBaseActivity;

public class FifteenthDayDemoActivity extends DemoBaseActivity {



  public void testMain() {



  }

  public void testConclusion()
  {
    /*
Java中的集合类
Java集合类与数组的区别：Java的集合类的长度是动态的，数组则是固定长度的。

Java集合类与数组的联系：使用相应的toArray()和Arrays.asList()方法可以回想转换。

首先来看看Java集合框架中的接口：

Collection接口实现类中存放的是元素和Map接口实现类中存放的是键值对。

Set接口和List接口：Set接口不保证维护元素的顺序，而且元素不能重复。List接口维护元素的顺序，而且元素可以重复。

SortedSet和SortedMap提供了排序的功能。

再来看看接口的实现：

HashSet和LinkedHashSet：HashSet，为快速查找而设计的Set。存入HashSet的对象必须实现hashCode()和equals()。LinkedHashSet，具有HashSet的查询速度，且内部使用链表维护元素的顺序(插入的次序)，于是在使用迭代器遍历Set时，结果会按元素插入的次序显示。

TreeSet: 提供排序功能的Set，底层为树结构 。相比较HashSet其查询速度低，如果只是进行元素的查询，我们一般使用HashSet。

ArrayList和LinkedList：ArrayList底层采用数组实现，具有较高的查询速度。LinkedList底层采用双向循环列表实现，进行插入和删除操作时具有较高的速度，我们还可以使用LinkedList来实现队列和栈。

TreeMap和HashMap：HashMap具有较高的速度(查询增删)，TreeMap则提供了按照键进行排序的功能。

Properties:该类也是集合类，里面的键和值都是String类型，通过它我们可以获取系统属性，读取配置文件。

Collections:通过该类，我们可以对集合类进行一些排序和查找最大最小操作。

Arrays：该类提供了操作数组的一些方法。
*/
  }

  public void testArray()
  {
    /*
Arrays:

Array是Java特有的数组。在你知道所要处理数据元素个数的情况下非常好用。java.util.Arrays 包含了许多处理数据的实用方法：

Arrays.asList：可以从 Array 转换成 List。可以作为其他集合类型构造器的参数。
Arrays.binarySearch：在一个已排序的或者其中一段中快速查找。
Arrays.copyOf：如果你想扩大数组容量又不想改变它的内容的时候可以使用这个方法。
Arrays.copyOfRange：可以复制整个数组或其中的一部分。
Arrays.deepEquals、Arrays.deepHashCode：Arrays.equals/hashCode的高级版本，支持子数组的操作。
Arrays.equals：如果你想要比较两个数组是否相等，应该调用这个方法而不是数组对象中的 equals方法（数组对象中没有重写equals()方法，所以这个方法之比较引用而不比较内容）。这个方法集合了Java 5的自动装箱和无参变量的特性，来实现将一个变量快速地传给 equals() 方法——所以这个方法在比较了对象的类型之后是直接传值进去比较的。
Arrays.fill：用一个给定的值填充整个数组或其中的一部分。
Arrays.hashCode：用来根据数组的内容计算其哈希值（数组对象的hashCode()不可用）。这个方法集合了Java 5的自动装箱和无参变量的特性，来实现将一个变量快速地传给 Arrays.hashcode方法——只是传值进去，不是对象。
Arrays.sort：对整个数组或者数组的一部分进行排序。也可以使用此方法用给定的比较器对对象数组进行排序。
Arrays.toString：打印数组的内容。

 如果想要复制整个数组或其中一部分到另一个数组，可以调用 System.arraycopy方法。此方法从源数组中指定的位置复制指定个数的元素到目标数组里。这无疑是一个简便的方法。.

 最后，所有的集合都可以用T[] Collection.toArray( T[] a ) 这个方法复制到数组中。通常会用这样的方式调用：

return coll.toArray( new T[ coll.size() ] );
       这个方法会分配足够大的数组来储存所有的集合，这样 toArray 在返回值时就不必再分配空间了。
    * */
  }
  public void testList()
  {
    /*
List

ArrayList：最有用的List集合实现。由一个整形数字或数组存储了集合的大小（数组中第一个没有使用的元素）。像所有的List集合一样，ArrayList可以在必要的时候扩展它的大小。ArrayList访问元素的时间开销固定。在尾部添加元素成本低（为常数复杂度），而在头部添加元素成本很高（线性复杂度）。这是由ArrayList的实现原理——所有的元素的从角标为0开始一个接着一个排列造成的。也就是说，从要插入的元素位置往后，每个元素都要向后移动一个位置。CPU缓存友好的集合是基于数组的。（其实也不是很友好，因为有时数组会包含对象，这样存储的只是指向实际对象的指针）。

LinkedList：Deque实现：每一个节点都保存着上一个节点和下一个节点的指针。这就意味着数据的存取和更新具有线性复杂度（这也是一个最佳化的实现，每次操作都不会遍历数组一半以上，操作成本最高的元素就是数组中间的那个）。如果想写出高效的LinkedList代码可以使用 ListIterators 。如果你想用一个Queue/Deque实现的话（你只需读取第一个和最后一个元素就行了）——考虑用ArrayDeque代替。
Vector：一个带有线程同步方法的ArrayList版本。现在直接用ArrayList代替了。
Queues/deques
ArrayDeque：Deque是基于有首尾指针的数组（环形缓冲区）实现的。和LinkedList不同，这个类没有实现List接口。因此，如果没有首尾元素的话就不能取出任何元素。这个类比LinkedList要好一些，因为它产生的垃圾数量较少（在扩展的时候旧的数组会被丢弃）。
Stack：一种后进先出的队列。不要在生产代码中使用，使用别的Deque来代替（ArrayDeque比较好）。
PriorityQueue：一个基于优先级的队列。使用自然顺序或者制定的比较器来排序。他的主要属性——poll/peek/remove/element会返回一个队列的最小值。不仅如此，PriorityQueue还实现了Iterable接口，队列迭代时不进行排序（或者其他顺序）。在需要排序的集合中，使用这个队列会比TreeSet等其他队列要方便。
Maps
HashMap：最常用的Map实现。只是将一个键和值相对应，并没有其他的功能。对于复杂的hashCode method，get/put方法有固定的复杂度。
EnumMap：枚举类型作为键值的Map。因为键的数量相对固定，所以在内部用一个数组储存对应值。通常来说，效率要高于HashMap。
HashTable：旧HashMap的同步版本，新的代码中也使用了HashMap。
IdentityHashMap：这是一个特殊的Map版本，它违背了一般Map的规则：它使用 “==” 来比较引用而不是调用Object.equals来判断相等。这个特性使得此集合在遍历图表的算法中非常实用——可以方便地在IdentityHashMap中存储处理过的节点以及相关的数据。
LinkedHashMap ：HashMap和LinkedList的结合，所有元素的插入顺序存储在LinkedList中。这就是为什么迭代LinkedHashMap的条目（entry）、键和值的时候总是遵循插入的顺序。在JDK中，这是每元素消耗内存最大的集合。
TreeMap：一种基于已排序且带导向信息Map的红黑树。每次插入都会按照自然顺序或者给定的比较器排序。这个Map需要实现equals方法和Comparable/Comparator。compareTo需要前后一致。这个类实现了一个NavigableMap接口：可以带有与键数量不同的入口，可以得到键的上一个或者下一个入口，可以得到另一Map某一范围的键（大致和SQL的BETWEEN运算符相同），以及其他的一些方法。
WeakHashMap：这种Map通常用在数据缓存中。它将键存储在WeakReference中，就是说，如果没有强引用指向键对象的话，这些键就可以被垃圾回收线程回收。值被保存在强引用中。因此，你要确保没有引用从值指向键或者将值也保存在弱引用中m.put(key, new WeakReference(value))。
Sets
HashSet：一个基于HashMap的Set实现。其中，所有的值为“假值”（同一个Object对象具备和HashMap同样的性能。基于这个特性，这个数据结构会消耗更多不必要的内存。
EnumSet：值为枚举类型的Set。Java的每一个enum都映射成一个不同的int。这就允许使用BitSet——一个类似的集合结构，其中每一比特都映射成不同的enum。EnumSet有两种实现，RegularEnumSet——由一个单独的long存储（能够存储64个枚举值，99.9%的情况下是够用的），JumboEnumSet——由long[]存储。
BitSet：一个比特Set。需要时常考虑用BitSet处理一组密集的整数Set（比如从一个预先知道的数字开始的id集合）。这个类用 long[]来存储bit。
LinkedHashMap：与HashSet一样，这个类基于LinkedHashMap实现。这是唯一一个保持了插入顺序的Set。
TreeSet：与HashSet类似。这个类是基于一个TreeMap实例的。这是在单线程部分唯一一个排序的Set。
java.util.Collections
       就像有专门的java.util.Arrays来处理数组，Java中对集合也有java.util.Collections来处理。

       第一组方法主要返回集合的各种数据：
Collections.checkedCollection / checkedList / checkedMap / checkedSet / checkedSortedMap / checkedSortedSet：
检查要添加的元素的类型并返回结果。任何尝试添加非法类型的变量都会抛出一个ClassCastException异常。这个功能可以防止在运行的时候出错。//fixme
Collections.emptyList / emptyMap / emptySet ：返回一个固定的空集合，不能添加任何元素。
Collections.singleton / singletonList / singletonMap：返回一个只有一个入口的 set/list/map 集合。
Collections.synchronizedCollection / synchronizedList / synchronizedMap / synchronizedSet / synchronizedSortedMap / synchronizedSortedSet：获得集合的线程安全版本（多线程操作时开销低但不高效，而且不支持类似put或update这样的复合操作）
Collections.unmodifiableCollection / unmodifiableList / unmodifiableMap / unmodifiableSet / unmodifiableSortedMap / unmodifiableSortedSet：返回一个不可变的集合。当一个不可变对象中包含集合的时候，可以使用此方法。
       第二组方法中，其中有一些方法因为某些原因没有加入到集合中：

Collections.addAll：添加一些元素或者一个数组的内容到集合中。
Collections.binarySearch：和数组的Arrays.binarySearch功能相同。
Collections.disjoint：检查两个集合是不是没有相同的元素。
Collections.fill：用一个指定的值代替集合中的所有元素。
Collections.frequency：集合中有多少元素是和给定元素相同的。
Collections.indexOfSubList / lastIndexOfSubList：和String.indexOf(String) / lastIndexOf(String)方法类似——找出给定的List中第一个出现或者最后一个出现的子表。
Collections.max / min：找出基于自然顺序或者比较器排序的集合中，最大的或者最小的元素。
Collections.replaceAll：将集合中的某一元素替换成另一个元素。
Collections.reverse：颠倒排列元素在集合中的顺序。如果你要在排序之后使用这个方法的话，在列表排序时，最好使用Collections.reverseOrder比较器。
Collections.rotate：根据给定的距离旋转元素。
Collections.shuffle：随机排放List集合中的节点，可以给定你自己的生成器——例如 java.util.Random / java.util.ThreadLocalRandom or java.security.SecureRandom。
Collections.sort：将集合按照自然顺序或者给定的顺序排序。
Collections.swap：交换集合中两个元素的位置（多数开发者都是自己实现这个操作的）。
    * */
  }

  public void testLists()
  {
    /*
Lists

CopyOnWriteArrayList：list的实现每一次更新都会产生一个新的隐含数组副本，所以这个操作成本很高。通常用在遍历操作比更新操作多的集合，比如listeners/observers集合。
Queues/deques

ArrayBlockingQueue：基于数组实现的一个有界阻塞队，大小不能重新定义。所以当你试图向一个满的队列添加元素的时候，就会受到阻塞，直到另一个方法从队列中取出元素。
ConcurrentLinkedDeque / ConcurrentLinkedQueue：基于链表实现的无界队列，添加元素不会堵塞。但是这就要求这个集合的消费者工作速度至少要和生产这一样快，不然内存就会耗尽。严重依赖于CAS(compare-and-set)操作。
DelayQueue：无界的保存Delayed元素的集合。元素只有在延时已经过期的时候才能被取出。队列的第一个元素延期最小（包含负值——延时已经过期）。当你要实现一个延期任务的队列的时候使用（不要自己手动实现——使用ScheduledThreadPoolExecutor）。
LinkedBlockingDeque / LinkedBlockingQueue：可选择有界或者无界基于链表的实现。在队列为空或者满的情况下使用ReentrantLock-s。
LinkedTransferQueue：基于链表的无界队列。除了通常的队列操作，它还有一系列的transfer方法，可以让生产者直接给等待的消费者传递信息，这样就不用将元素存储到队列中了。这是一个基于CAS操作的无锁集合。
PriorityBlockingQueue：PriorityQueue的无界的版本。
SynchronousQueue：一个有界队列，其中没有任何内存容量。这就意味着任何插入操作必须等到响应的取出操作才能执行，反之亦反。如果不需要Queue接口的话，通过Exchanger类也能完成响应的功能。
Maps

ConcurrentHashMap：get操作全并发访问，put操作可配置并发操作的哈希表。并发的级别可以通过构造函数中concurrencyLevel参数设置（默认级别16）。该参数会在Map内部划分一些分区。在put操作的时候只有只有更新的分区是锁住的。这种Map不是代替HashMap的线程安全版本——任何 get-then-put的操作都需要在外部进行同步。
ConcurrentSkipListMap：基于跳跃列表（Skip List）的ConcurrentNavigableMap实现。本质上这种集合可以当做一种TreeMap的线程安全版本来使用。
Sets

ConcurrentSkipListSet：使用 ConcurrentSkipListMap来存储的线程安全的Set。
CopyOnWriteArraySet：使用CopyOnWriteArrayList来存储的线程安全的Set。
    * */
  }
}

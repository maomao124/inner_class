/**
 * Project name(项目名称)：内部类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/14
 * Time(创建时间)： 13:28
 * Version(版本): 1.0
 * Description(描述)： 在类内部可定义成员变量和方法，且在类内部也可以定义另一个类。如果在类 Outer 的内部再定义一个类 Inner，
 * 此时类 Inner 就称为内部类（或称为嵌套类），而类 Outer 则称为外部类（或称为宿主类）。
 * 内部类可以很好地实现隐藏，一般的非内部类是不允许有 private 与 protected 权限的，但内部类可以。内部类拥有外部类的所有元素的访问权限。
 * 内部类可以分为：实例内部类、静态内部类和成员内部类，每种内部类都有它特定的一些特点，本节先详细介绍一些和内部类相关的知识。
 * 在类 A 中定义类 B，那么类 B 就是内部类，也称为嵌套类，相对而言，类 A 就是外部类。如果有多层嵌套，
 * 例如类 A 中有内部类 B，而类 B 中还有内部类 C，那么通常将最外层的类称为顶层类（或者顶级类）。
 * 内部类的特点如下：
 * 内部类仍然是一个独立的类，在编译之后内部类会被编译成独立的.class文件，但是前面冠以外部类的类名和$符号。
 * 内部类不能用普通的方式访问。内部类是外部类的一个成员，因此内部类可以自由地访问外部类的成员变量，无论是否为 private 的。
 * 内部类声明成静态的，就不能随便访问外部类的成员变量，仍然是只能访问外部类的静态成员变量。
 * 外部类只有两种访问级别：public 和默认；内部类则有 4 种访问级别：public、protected、 private 和默认。
 * 在外部类中可以直接通过内部类的类名访问内部类。
 * InnerClass ic = new InnerClass();    // InnerClass为内部类的类名
 * 在外部类以外的其他类中则需要通过内部类的完整类名访问内部类。
 * Test.InnerClass ti = newTest().new InnerClass();    // Test.innerClass是内部类的完整类名
 * 内部类与外部类不能重名。
 */

public class test
{
    private String s1 = "外部类";

    public class test1
    {
        private String s = "内部类";

        public int getSum(int x, int y)
        {
            return x + y;
        }

        test1()
        {
            System.out.println("内部类构造函数被调用");
        }

        public void display()
        {
            System.out.print("调用内部类的成员变量：");
            System.out.println(s);
            System.out.println("调用外部类的成员变量：" + s1);
        }
    }

    public test()
    {
        System.out.println("外部类的构造函数被调用");
    }

    public void display()
    {
        test1 t = new test1();
        t.display();
    }
}

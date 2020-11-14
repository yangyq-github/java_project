import java.util.Scanner;

public class ReadStringAndIntFromConsole {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请问你的名字是？");
        String str = in.nextLine();
        System.out.println(str+",你好");
        System.out.println("请问你几岁了？");
        int age = in.nextInt();
        System.out.println("好的，"+str+age+"岁了。");
    }
}

/**
1.从标准输出读取字符串和整数
 *    2.1 Scanner in = new Scanner(System.in)连接标准输入，在例子里也就是命令行。in也是变量，只是不是基本类型。
 *    2.2 in.nexline()可以从命令行读取一行字符串。
 *    2.3 in.nextInt()可以从命令行读取一个正整数。
 *    2.4 点操作符也是Java中的操作符，和System.out.println()以及Math.random()中的点是一样的操作符。是对点前面的“变量”进行点后面
 *        的“操作”。这里所谓的操作，就是指方法，也就是我们一直写的main方法的那个方法。这些操作都是使用一个个的方法。使用方法我们叫调用
 *        方法(invoke a method)。方法是Java中的重中之重，
 *    2.5 import java.util.Scanner;是告诉程序，Scaner这个类型在哪里。
 *    2.6 创建Scanner类型的“变量”，它就是我们提过的工具，可以帮我们从标准收入读取数据。
 *    2.7 nextline()和nextInt()两个方法可以从命令行读取一行字符串或者一行字符串代表的整数。
**/
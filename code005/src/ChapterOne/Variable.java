public class Variable {
    public static void main(String[] args){
//      基本数据类型--int，用来表示一个整数，取值范围在 -2^31~~2^31-1
        int a = 3;
        int b = 5;
        int c = 7;

        int x = 1;
        int y = a*x + b*x*x + c*x*x*x;
        System.out.println(y);
    }
}
/***
关键字(key world)和标示符(Identifier)
标示符:
    由大小写英文字符,数字和下划线_组成的，区分大小写的,不以数字开头的文字。
    可以用作Java中的各种东西的名字，比如类名，方法名等。
    标示符是区分大小写的。

关键字是Java语法的保留字，不能用来做名字。
我们接触到的关键字：public,class,static,void,int

 Java代码三级跳----表达式，语句和代码块
    表达式(expression)：Java中最基本的一个运算。比如一个加法运算表达式。
    语句(statement)：类似于平时说话时的一句话，由表达式组成，以;结束。
    代码块：一对大括号括起来的就是一个代码块。

 Java区分大小写：
    关键字和标示符都是区分大小写的
    类名必须与文件名一致，包括大小写要求
    使用变量时，名字必须和声明变量时的标示符大小写一致
    方法名也区分大小写。main和Main是两个名字
    类型也区分大小写。int是数据类型，Int则不是
    System.out.println 可以被Java认识，SYSTEM.Out.Println就不可以

 字面值不简单
    整数的字面值默认类型是int
    超过int的范围会怎么样？需要使用取值范围更大的数据类型
 ***/

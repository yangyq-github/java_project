public class CharsetEncoding {
    public static void main(String[] args) {
        String content = "a\tb\"\tcc\n\tee\t";
        String align = "1111222233334444";
        int a1 = 65;
        char cha = (char) a1;
        char zang = '\u81e7';

        System.out.println(content);
        System.out.println(align);
        System.out.println(cha);
        System.out.println(zang);


        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("a+b="+c);

        boolean aBiggerThanB = a>b;
        System.out.println("a>b是"+aBiggerThanB+"的");
        System.out.println("a+b ="+a+b);//相当于拼接，所以是1020
        System.out.println("a+b="+(a+b));
        System.out.println("a+b="+a*b);

        int a2 =10;
        String str = "a2的值是";
        str = str +a2;
        System.out.println(str);

        String s2 = "a的值是";
        System.out.println(s2+a2);
        System.out.println(s2);
    }
}


/** 字符集编码和字符串
 * 1.什么是字符集和编码
 *    1.1 什么是字符集(Charset)
 *      a.字符集就是字符的集合。一般会包含一种语言的字符。比如GBK，是包含所有常用汉字字符的字符集。ASCII是包含英文字符的字符集。
 *      b.字符就是Java中的char，chars是character的简写。
 *    1.2 什么是编码(Encoding)
 *      a.char代表一个字符，char的本质也是数字。将数字映射到字符，就叫编码。
 *      b.将一个字符集映射到数字，就是给这个字符集编码。编码是有标准的，所有的计算机系统按照同一个编码标准执行。
 *      c.有时候编码和字符集会混用。
 * 2. 编码和字符集介绍
 *     2.1 常用字符集简介
 *       a.ASCII码，ASCII表
 *       b.Unicode 包含世界上所有常用字符，编码也有几种，包括 UTF-8，UTF-16等。
 *       c.Unicode,GBK等所有常用的字符集，都会兼容ASCII。举个例子，字符A在这些所有常用的字符集里，都是对应数字65.
 *     2.2 Java种的字符集
 *       a.Java中用的是UTF-16编码的Unicode。
 *       b.UTF-16用16个 bit,即两个 byte，这也是char占用两个byte的原因。当把char转成数字的时候，需要用int。
 * 3.ASCII码和转义符
 *    3.1 如何输出特殊字符
 *      a.ASCII码+char，通过ASCII表可以找到需要的字符对应的数字。将这个数字转换为char，然后输出这个char,
 *      b.转义符。转义符用来给字符赋值，也可以用在字符串里面，作为字符串中的一个字符。
 *    3.2 转义符语法和常用转义符
 *      a.\n：换行符
 *      b.\"：双引号
 *      c.\t：制表符
 * 4.字符串的加法
 *    4.1 将变量穿插在字符串中输出
 *      a.字符串可以和任何类型进行加法计算，则回将这个值的字符拼接到字符串上。
 *      b.字符串也可以使用 += 操作符来拼接。
 *      c.字符串的加法运算符符合加法运算符本身的优先级。
 *    4.2 字符串不是Java中的基本数据类型
 *       a.字符串类型的名字叫做 String。
 *       b.虽然String不是Java的基础类型，但是也可以使用类似的语法String,str="abc"；来创建。开始的时候将其当成基础类型，更容易理解。
 *    4.3 String 的加法不会改变原 String 变量的值，改变其值要用赋值语句。
 */
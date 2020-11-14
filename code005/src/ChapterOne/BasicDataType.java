public class BasicDataType {
    public static void main(String[] args) {
        int a = 0;
        int b = a+1;
        System.out.println(b);

        int intVal = 99;
        long longVal = intVal;
        long longVal2 = intVal + 1;
        System.out.println(longVal2);

        float floatVal = 11.32f;
        double doubleVal = floatVal;
        double doubleVal2 = floatVal * 2;
        System.out.println(doubleVal2);
        System.out.println(doubleVal);

        doubleVal = longVal;
        doubleVal = intVal;
        floatVal = intVal;
        floatVal = longVal;
        System.out.println(doubleVal);

        int a1 = 99;
        double b1 = 5;
        System.out.println(a1/b1);

        char a2 = 'A';
        int chNum = a2;
        int chNumCalc = a2+10;
        System.out.println(a2);
        System.out.println(chNum);

        int intVal1 = 99;
        long longVal1= 19999;
        intVal1 = (int) longVal1;

        float floatVal3 = 11.32f;
        double doubleVal1 = 3344556.789;
        floatVal3 = (float) doubleVal1;

        System.out.println(intVal1);
        System.out.println(floatVal3);

    }
}


/** 基本数据类型的更多语法点
 * 1.变量要先赋值后使用
 *    1.1 不给变量赋值代表什么？
 *    1.2 不赋值就使用会怎么样？
 * 2.计算并赋值运算符
 *    2.1 作用是为了让代码更简洁。比如 a = a+10,
 * 3.数据类型自动转换
 *    3.1 自动类型转换
 *      a. 不会出现问题的类型转换，编程语言可以做自动类型转换，比如低精度的数字向高精度的数字转换。
 *      b. 自动转换类型可以发生在算数运算，也可以发生在赋值。
 *    3.2 数值精度顺序：double>float>long>int>short>byte.
 *    3.3 char 可以转为为 int
 *      a. char 可以转换为 int
 *      b. 虽然同样是两个 byte，但是因为 char是无符号数，值域超出了 short可以表示的范围，所以不可以自动转为short.
 * 4.强制类型转换和数字溢出
 *    4.1 强制类型转换
 *      a. 可能出现问题的类型转换，需要使用强制类型转换，比如高精度数值向低精度数值转换。
 *      b. 强制类型转换也是操作符。
 *      c. 语法是用小括号括起来的目标类型放在被转换的值前面。
 *      d. 强制转换会造成数据精度丢失。
 *    4.2 数值溢出
 *      a. 数值计算一旦溢出，结果将失去其原有意义。比如，两个正数会加出负数。
 *      b. 要对能够处理的值有大概的估计。
 * 5.从数值计算溢出理解程序员和编程语言
 *    5.1 编程语言的作用【编程语言负责按照语法执行；编程语言负责和计算机交互】
 *    5.2 程序员的任务【程序员负责理解问题；程序员负责理解程序，并将问题转换为程序；编程语言不负责解决问题，程序员才负责解决问题】
 * **/
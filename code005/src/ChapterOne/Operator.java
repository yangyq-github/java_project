public class Operator {
    public static void main(String[] args) {
        int a =100;
        System.out.println(a+1);
        System.out.println(a);
        a = a+6;//先右边后左边
        System.out.println(a);

        int num = 10;//如果是-10，则结果与10相比，结果多了一个-，
        // 所以说被取模的数的正负直接影响结果的正负
        System.out.println(num % 2);
        System.out.println(num % -3);
        System.out.println(num % 4);
        System.out.println(num % 5);
        System.out.println(num % -6);

        int b = 10;
        int c = 3;
        System.out.println(b / c);

        int b1 = 10;
        double c1 = 3;
        System.out.println(b1 / c1);

        int a2 = 10;
        int b2 = 15;
        int c2 = 10;

        System.out.println(a2 > b2);//false
        System.out.println(a2 >= b2);//false
        System.out.println(a2 < b2);//true
        System.out.println(a2 <= b2);//true
        System.out.println(a2 != b2);//true

        System.out.println(a2 != c2);//false
        System.out.println(a2 >= c2);//true
        System.out.println(a2 <= c2);//true
        System.out.println(a2 == b2);//false
        System.out.println(a2 == c2);//true


        boolean a3 = true;
        boolean b3 = false;

        System.out.println(a3 && b3);//false
        System.out.println(a3 & b3);//false
        System.out.println(a3 || b3);//true
        System.out.println(a3 | b3);//true

        System.out.println(a3 || (10 / 0 >1));//true
    }
}




/**
 * Java 中的运算符
 *    什么是运算符？
*          1. 运算符对一个或多个值进行运算，并得出一个运算结果。
*          2. 运算符的运算结果类型有的是固定的，有时候会根据被计算的值变化。比如两个int相加，结果的类型就是int。
*              两个byte相加，返回值的类型就是int.
*          3. 混淆点：除赋值运算符外，运算符本身不会更改变量的值。
*      取模运算符%
 *          1. 用来计算余数
 *          2. 负数也可以被取模
 *          3. 负数也可以取模
 *          4. 小数也可以取模
 *     整数的除法运算
 *          int除以int还是int，不会变成浮点数
 *     比较运算符和布尔运算符：
 *          比较运算符：> >=  < <=  != ==
 *          布尔运算符：
 *          1.!:叫做非运算符，not运算符。!true是false，!false是true
 *          2.&:叫做且运算符，and运算符。true&true是true，true&false是false。
 *          3.&&:叫做且且运算符，andand运算符。运算结果和&一样。
 *          4.|:叫做或运算符，or运算符。true|false是true，false|false是false，true|true是true.
 *          5.||:叫做或或运算符，oror运算符。运算结果和|一样。
 *      小括号运算符
 *          小括号运算符内可以包含任何运算符，决定运算符的顺序。
 *
 *      运算符优先级
 *          1.运算符优先级：() ! *,/,% +,- >,>=,<,<= == != &,&&,|,|| =
 *          2.为什么等号的优先级最低？因为等号是赋值运算符，需要等号右边都算出来，才能给赋值
 *          3.为什么布尔运算符的优先级低于比较运算符？因为布尔运算符的操作符是布尔，是通过比较运算符来得到布尔值
 *          4.为什么比较运算符的优先级比算数运算符低？因为比较运算符的结果是通过算数运算符来得到要比较的值
 *
 * **/
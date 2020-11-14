public class SummaryOne {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a++="+ a++);//加加在后面，先用值，再加且赋值
        System.out.println("a="+a);

        System.out.println("++a ="+ (++a));//加加在前面，先加且赋值，再用值
        System.out.println("a="+a);

        int b = 10;
        System.out.println("b-- ="+b--);
        System.out.println("b="+b);

        System.out.println("--b ="+(--b));
        System.out.println("b="+b);

        char ch = 'a';
        int num = ch;
        for (int i=0;i<26;i++) {
            System.out.println(num + "\t" + (char) (num++));
        }

        int div = 77;
        int divisor = 9;
        System.out.println(div+"可以整除"+divisor+"吗？"+(div++%divisor == 0));
    }
}



/**
 * 1.自增和自减操作符
 *  1.1自增自减操作符是可以直接改变变量值的操作符。
 *  1.2前加加和前减减。
 *  1.3后加加和后减减。
 *  1.4其实是一个+1/-1操作和一个赋值操作的缩写。
 * 2.打印26个连续的字符。
 *  程序中的知识点：
 *  a.自动类型转换：char 到 int
 *  b.强制类型转换：int 到 char
 *  c.字符和数字的对应关系，字符集和编码
 *  d.字符串的加法：任何数据和字符串都可以相加，将这个数据的字符串和另一个字符串拼接起来。
 *  e.自增操作符。
 * 3.找到可以被整除的数
 *  程序中的知识点：
 *  a.取模运算：整数的取模运算
 *  b.布尔运算：==操作符
 *  c.自增运算
 * **/
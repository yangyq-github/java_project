public class WhileLearn {
    public static void main(String[] args) {
        int n = 10;
        int divided = 100;
        int divisor = 2000000000;//出现正数的加法溢出，已经超出int的范围
        int found = 0;

        String start = "从" + divided + "开始,";

        while (found < n) {
            if (divided < 0) {
                System.out.println("被除数溢出，计算结束");
                break;
            }

            if (divided % divisor == 0) {
                System.out.println(divided + "除以" + divisor + "的商是：" + (divided / divisor));
                found++;
            }
            divided++;

        }
        System.out.println(start + "共找到" + found + "个可以整除" + divisor + "的数");
        System.out.println(divided);

/*
        do {
            System.out.println("do-while会执行一次");
        }while (false);
*/
    }
}


/**
 * 程序循环之while语句
 * 1.用while语句增强找整除数的程序
 * 1.1 增强点：找出n个可以被整除的数。
 * 1.2 while 语句的语法
 * a.条件表达式的结果是一个Boolean值，如果为true，则执行循环体，如果为false,则循环结束。
 * b.while循环体是一个代码块。所以while循环也是可以嵌套别的语句的，包括while语句，for语句，if-else语句等。
 * 1.3 while语句格式：while(条件表达式) {while循环体}
 * 2.do-while语句-至少执行一次
 * 2.1 do-while语句语法
 * 2.2 do-while语句的循环体至少执行一次
 * 2.3 语法格式：do {while 循环体} while (条件表达式);
 * 3.死循环（endless loop）
 * 3.1 死循环：无法结束的循环-endless loop/infinite loop
 * 3.2 死循环是因为没有设置好结束条件，循环的结束条件很重要，要充分考虑各种边界情况。
 * 4.一个看似死循环却不是死循环的例子
 * 4.1 用while找出5个能被2000000000整除的数
 * 4.2 程序最终还是结束了，但是结果并不是我们想要的。
 * 5.使用break语句结束循环
 * 5.1 break语句可以结束任何循环
 * 5.2 不考虑负数的情况，使用break改善程序
 * 5.3 理解String start的内容，为什么不是”从 -2147483648开始递增“
 **/
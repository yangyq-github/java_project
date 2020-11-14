public class IfElseOne {
    public static void main(String[] args) {
        int baozi = 3;
        boolean  re = false;

/*        if (re) {
            baozi += 2;
            System.out.println("包子刚出笼，买了" + baozi + "个肉包子");
        }
        else {
            System.out.println("买了" + baozi + "个肉包子");
        }*/

/*        for (int i=0;i<=100;i++){
            if (i % 2 ==0){
            System.out.println(i +"除以2的商是:"+(i/2));
            }
        }*/
        int a = 99,b=990,c=990;
        if (a == b && b == c){
            System.out.println("三个数一样大");
        }else {
            if (a > b){
                if (a == c){
                    System.out.println("a和c一样大");
                } else {
                    if (a > c){
                        System.out.println("a最大");
                    }else {
                        System.out.println("c最大");
                    }
                }
            }else {
                if (b <= c){
                    if (b == c){
                    System.out.println("b和c一样大");
                    }else {
                        System.out.println("c最大");
                    }
                }else {
                    if(b > c){
                        if (a == b){
                            System.out.println("a和b一样大");
                        }else {
                            System.out.println("b最大");
                        }
                    }
                }
            }
        }

    }
}



/**1.顺序执行
 *  1.1 代码块的执行是顺序执行
 *  1.2 只要程序运行过程中不出错，就会一行行的向下顺序执行
 *2.if-else语法
 *  2.1 if-else语法，只有一个语句块被执行
 *  2.2 if和else都是Java中的关键字
 *  2.3 if语法
 *  2.4 把if-else看做一个表达式，程序整体还是顺序执行的
 *  2.5 if (boolean值){
 *      if语句块
 *  }else{
 *      else 语句块
 *  }
 * 3.if-else的嵌套
 *  3.1 if-else就是一个语句，可以是另一个语句的一部分，也可以是if-else的一部分，即嵌套
 *
 * 例子
 *   1.增强寻找可以被整除的程序
 *      增强点【只输出可以整除的数，输出商】
 *   2.求最大的数
 *      即：求 a,b和c三个数的最大数。
 *
 * **/
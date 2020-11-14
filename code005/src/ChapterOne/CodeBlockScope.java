public class CodeBlockScope {
    public static void main(String[] args) {
        System.out.println("九九乘法表如下：");
        for (int i = 1;i <=9;i++){
            String line = "";
            for (int j =1;j<=9;j++){
                line = line +j+"*"+i+"="+(i*j)+"\t";
                if (i == j) break;
            }
            System.out.println(line);
        }


        for (int i = 1;i <=9;i++){
            String line = "";
            for (int j =1;j<=i;j++){
                line = line +j+"*"+i+"="+(i*j)+"\t";
            }
            System.out.println(line);
        }

        for (int i = 1; i < 10; i ++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print(i + "x" + j + "=" + i * j + "\t");
            }

            System.out.print("\n");
        }
    }
}


/**代码块和变量的作用域i
 * 1.大括号括起来的就是代码块i
 *  1.1 代码块的示例
 *  1.2 有名字的代码块--if-else代码块，for循环代码块，main方法代码块。
 *  1.3 代码块也叫体，比如for循环体，main 方法体
 *  1.4 代码块以嵌套
 * 2.变量的作用域
 *  2.1 代码块里创建和使用变量
 *    a.代码块里使用外层代码块的变量
 *    b.代码块里创建变量
 *    c.不能在外层代码块里使用内层代码块的变量。是否可以使用变量，也称作变量在某个代码块的可见性。也就是说，
 *      外层代码块创建的变量对内存代码可见。内层代码块中创建的变量对外层代码块不可见。
 *    d.内层命名空间不可以重复定义外层代码块的变量，但是可以使用外层代码块的变量
 *    e.代码块无论嵌套多少层，都遵守上述变量可见性的。
 * 3.理解作用域和命名空间
 *  3.1同一个命名空间中的变量不可以重名。
 *  3.2为了避免变量名冲突，所以必须有命名空间。
 * 4.for循环嵌套-计算乘法表
 *  4.1两个数相乘，外层循环代码乘数，内层是被乘数。
 *  4.2循环嵌套，变量名不可以重复。
 *  4.3使用break语句让输出的乘法表更简洁。
 *  4.4使用String变量，做String的加法。
 *
 * **/
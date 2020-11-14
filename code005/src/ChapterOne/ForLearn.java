public class ForLearn {
    public static void main(String[] args) {
        char ch = 'A';
        int startNum = ch;

/*
        for (int i = 0; i < 26; i++) {
            System.out.println((startNum + i) + "\t" + (char) (startNum + i));
        }
*/


/*        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "可以整除2，商是：" + (i / 2));
                sum += 1;
            }
            if (sum == 10) break;
        }*/

        int divided = 5;
        int divisor = 30;

        int found = 0;
        int toBeFound = 10;

        for (int i = 0; i < 600; i++) {

            if (divided < divisor){
                System.out.println(divided + "小于"+divisor+"当前循环跳出");
                divided ++;
                continue;
            }
            else {
                if (divided % divisor == 0) {
                    System.out.println(divided + "可以整除" + divisor + ",商为" + (divided / divisor));
                    found++;
                }
                if (found >= toBeFound) {
                    System.out.println("\n" + "已经找到" + toBeFound + "个数,循环退出。");
                    break;
                }

            }

        }
    }
}


/**
 * 1.for语句
 * 1.1 让程序在满足条件时，重复执行某个代码块。for是Java中的关键字
 * 1.2 for语句语法和简单的示例程
 * 1.3 初始语句在 for 循环开始前执行一次，以后不再执行；循环体条件表达式在每次循环体执行前会执行，
 * 如果为true，则执行循环体，否则混合结束；循环体后语句会在每次循环执行后被执行；
 * 1.4 for (初始语句，循环体条件表达式；循环体后语句){for 循环体}
 * 2.简化并增强找整除数的程序
 * 2.1 使用 for 语句让程序简洁
 * 2.2 增加新功能，输出最多10个可以整除的数
 * 2.3 条件布尔表达式可以用 for 语句外部的变量
 * 2.4 循环体执行后的语句可以有多个表达式，用逗号分开
 * 3. break语句
 * 3.1 break语句可以结束循环
 * 3.2 在求整除程序中使用 break 提前结束循环
 * 4.continue语句：跳过不符合条件的循环
 * 4.1 continue 语句可以结束当次循环的执行，开始下一次循环体的执行
 **/
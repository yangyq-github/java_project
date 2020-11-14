public class IfElseTwo {
    public static void main(String[] args) {
        int a = 7, b =9, c = 8;

        if (a == b && b == c) {
            System.out.println("三个等大");
        } else if (a > b && a > c) {
            System.out.println("a最大");
        } else if (b > a && b > c) {
            System.out.println("b最大");
        } else if (c > a && c > b) {
            System.out.println("c最大");
        } else if (a == b && a > c) {
            System.out.println("a和b一样大");
        } else if (a == c && b < c) {
            System.out.println("a和c一样大");
        } else if (b == c && c > a) {
            System.out.println("b和c一样大");
        }
    }
}

/**
 * 1.if-else的简化
 * 1.1 if-else省略大括号
 * a.如果if或者else的语句块只有一个语句，可以省略大括号
 * b.简化最大数程序
 * c.if(boolean值) if 语句块  else else语句块
 * d.if(boolean值){if语句块} else if (){if语句块 else{ else 语句块}}
 **/
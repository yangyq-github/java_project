public class PositionOper {
    public static void main(String[] args) {
        int a = 05;
        int b = 011;
        int c = 0xF;
        int d = 0X11;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int a1 = 0xF8;//二进制的1111 1000
        int b1 = 0xF4;//二进制的1111 0100
        int c1 = 0xFF;//二进制的1111 1111

        System.out.println(a1 & b1);
        System.out.println(a1 | b1);
        System.out.println(a1 ^ b1);
        System.out.println(~c1);

        int a2 = 0X400;
        System.out.println(a2);
        System.out.println(a2 >> 1 );
        System.out.println(a2 >> 2);

    }
}


/**
 * 字面值的八进制和十六进制
 *   以0开头的整数为八进制
*        05:就是十进制的5
*        011:就是十进制的9
 *   以0x开头的整数位十六进制
 *      0xF:就是十进制的15
 *      0x11:就是十进制的17
 * 按位运算符
 *      1. 按位并（AND）:&
 *      2. 按位或（OR）:|
 *      3. 按位异或（XOR）:^
 *      4. 按位取反：~
 * 位移运算符
 *      1.>>:符号位不动，其余位右移，符号位后边正数补0，负数补1.又称带符号右移
 *      2.>>>:符号位一起右移，左边补0，又称无符号右移
 *      3.<<:左移，右边补0.左移没有带符号位一说，因为符号位在最左侧
 * **/
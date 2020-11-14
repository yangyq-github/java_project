public class BigNumber {
    public static void main(String[] args){
        long number = 9999999999L;//支持大小写的L，小写容易和1分不清
        byte bytevar = 127;
        short shortVar = -30000;
        float floatVar = 100.1111111f;
        double doubleVar = 100.1111111;
        boolean condition = true;
        boolean fcondition = false;
        char ch ='A';

        System.out.println(bytevar);
        System.out.println(shortVar);
        System.out.println(number);
        System.out.println(floatVar);
        System.out.println(doubleVar);
        System.out.println(condition);
        System.out.println(fcondition);
        System.out.println(ch);

//        System.out.println(1/3.0);
        System.out.println(1>2);
        System.out.println("ABC");
    }
}


/**Java 中的基本数据类型
 * 认识二进制
 *     十进制：每一位可以是0~9这10个值，到10进位。一百用十进制表示就是100，十就是10
 *     二进制：每一位可以是0和1这两个值，到2进位。一百用二进制表示就是1100100，十就是1010
 *     十六进制：每一位可以是0~F这16个值，到16进位。一百用十六进制表表示就是64，十就是A。
 *     bit和byte：
 *          一个二进制的位叫做一个bit。网络带宽中的单位，都是bit.
 *          八个二进制的位，组成一个byte。硬盘等存储的单位，都是byte.
 *          byte是计算机中基本的衡量存储的单位，计算机在对外使用时不会用bit作为划分存储的单位。
 * 数字的基本数据类型
 *      整数类型
 *          byte：占用1个byte，值域是：-128~127
 *          short：占用2个byte,值域是：-32768~32767
 *          int：占用4个byte,值域是-2147483648~2147483647.Java中整数缺省是int类型
 *          long：占用8个byte，值域是-9223372036854774808~9223372036854774807
 *      浮点（小数）类型
 *          float：占用4个byte，有精度，值域复杂
 *          double：精度是float的两倍，占用8个byte,Java中浮点数缺省是double类型
 *      符号位
 * 布尔和字符数据类型
 *      boolean：占用1个byte，值域是true，false。
 *      char：占用2个byte，值域是所有字符。
 * 使用各种基本数据类型
 *      L后缀
 *      感受浮点数精度
 *      整数缺省是int类型，浮点数缺省是double类型
 *      编译错误的定位和修正
**/

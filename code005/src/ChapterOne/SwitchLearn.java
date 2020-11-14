public class SwitchLearn {
    public static void main(String[] args) {
        int n = 10;
        String str = n+"对应的中文数字是";

        switch (n){
            case 1:
                str += "壹";
                break;
            case 3:
                str += "贰";
                break;
            case 4:
                str += "叁";
                break;
            case 5:
                str += "伍";
                break;
            case 6:
                str += "陆";
                break;
            case 7:
                str += "柒";
                break;
            case 8:
                str += "玐";
                break;
            case 9:
                str += "玖";
                break;
            default:
                System.out.println("错误的值"+n+".值需要在1~9之间。");
        }
        System.out.println(str);
    }
}


/**程序执行流程之 switch语句
 * 1. 将阿拉伯数字转换为中文数字
 *   1.1 使用if可以完成，但是略显不够整洁
 *   1.2 能够根据两个值相比较，进入某个代码块最适合这个情况
 * 2. switch语句的语法
 *   2.1 switch (用于比较的int值){
 *       case 目标值1,对应一个if else(xxx):
 *          匹配后可以执行的语句
 *       case 目标值2,不可以与别的case字句重复:
 *          匹配后可以执行的语句
 *       default (对应最后的else,可选):
 *          default语句
 *   }
 *   2.2 switch里的case子句中也可以有任意合法的语句，比如：if-else，for循环等。
 *3.switch语法中的break
 *  3.1 switch语句如果没有遇到break，会一直执行下去。
 *  3.2 没有break的情况也有用武之地。
 *
 * 4. switch语法点总结
 *  4.1 switch语句中用于比较的值，必须是int类型。
 *  4.2 switch语句适用于有固定多个目标值匹配，然后执行不同的逻辑情况。
 *  4.3 必须使用break语句显示的结束一个case子句，否则switch语句会从第一个match
 *      的case语句开始执行知道遇到break语句或者switch语句结束。
 *  4.4 default子句是可选的，如果所有的case语句都没有匹配上，才会执行default中的代码。
 *  4.5 不能在不同的case中声明相同名字的变量。-变量名会重复
 * **/
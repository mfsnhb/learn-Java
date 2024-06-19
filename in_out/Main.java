package in_out;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 输入输出操作
        Scanner scanner = new Scanner(System.in);
        // int a;
        // double b;
        // String s;
        
        // a = scanner.nextInt();
        // System.out.println("a value :" + a);

        // b = scanner.nextDouble();
        // System.out.printf("b的值为:%.4f\n", b);

        // s = scanner.nextLine();
        // System.out.print(s);
        
        // 输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）
        int score1,score2;
        
        while(true) {
            score1 = scanner.nextInt();

            if(score1 >= 60) {
                System.out.println("第一次成绩及格");
                break;
            }
            else {
                System.out.println("第一次成绩不及格,请重新输入:");
            }
        }

        while(true) {
            score2 = scanner.nextInt();

            if(score2 >= 60) {
                System.out.println("第二次成绩及格");
                break;
            }
            else {
                System.out.println("第二次成绩不及格,请重新输入:");
            }
        }
        double rate = (double)(score2 - score1) / score2;

        System.out.printf("成绩提高了%.2f%%", rate * 100);

        scanner.close();
    }
}

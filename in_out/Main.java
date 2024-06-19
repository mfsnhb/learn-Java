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
        score1 = scanner.nextInt();
        score2 = scanner.nextInt();

        double rate = (double)(score2 - score1) / score2;

        System.out.printf("成绩提高了%.2f%%", rate * 100);

        scanner.close();
    }
}

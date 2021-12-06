package day04;

import java.util.Random;
import java.util.Scanner;

public class OperationGame {

    public static void main(String[] args) {



        System.out.println("~~~~~~ 재미있는 사칙연산 게임 ~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~]");
        System.out.println("=======================================\n");

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int qNum = 1;
        int win = 0,lose = 0;

        while (true) {

            int operationNum = r.nextInt(3) + 1;
            if (operationNum == 1) {
                String plus = "+";

            }

            int number1 = r.nextInt(20) + 1;
            int number2 = r.nextInt(20) + 1;
            System.out.printf("Q%d. %d %s %d = ??\n", qNum, number1, number2);
            System.out.print(">> ");
            int answer = sc.nextInt();

            if (answer == 0) {
                break;
            }

            if (answer == number1 + number2) {
                System.out.println("정답입니다!");
                win++;
            } else {
                System.out.println("틀렸어요~");
                lose++;
            }

            qNum++;
        }
        System.out.printf("정답횟수 : %d회, 틀린횟수 : %d회", win, lose);
    }
}

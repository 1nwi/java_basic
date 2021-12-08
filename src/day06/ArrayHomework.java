package day06;

import java.util.Scanner;

public class ArrayHomework {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrNum = {};

        for (int i = 0; i < 7; i++) {
            System.out.printf("x[%d] : ", i);
            int inputNum = sc.nextInt();
        }

        int[] temp = new int[arrNum.length + 1];

        for (int i = 0; i < arrNum.length; i++) {
            temp[i] = arrNum[i];
        }
        temp[temp.length - 1] = inputNum;
    }
}

package day05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");

        String[] foods = new String[0];
        while (true) {
            System.out.printf("> ");
            String food = sc.next();

            foods = new String[]{};

            String [] temp = new String[foods.length + 1];

            for (int i = 0; i <foods.length; i++) {
                temp[i] = foods[i];
            }
            temp[temp.length -1] = food;

            foods = temp;
            temp = null;

            if (food.equals("그만")) {
                break;
            }
        }

        System.out.println(Arrays.toString(foods));
    }
}

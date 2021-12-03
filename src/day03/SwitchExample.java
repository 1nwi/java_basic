package day03;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[ 여행을 원하는 계절을 입력하세요. ]");
        System.out.print(">> ");
        String season = sc.next();
        sc.close();

        double d = 5.5;

        // switch 안에는 문자, 정수형 변수를 씁니다.
        switch (season) {
            //case 에는 switch 에 작성한 변수에 저장될 값의 경우를
            //리터럴이나 상수형태로 작성함 (변수는 사용금지)
            case "봄": case "spring": case "春":
                System.out.println("봄에는 남산타워를 가보세요~");
                break; //break 를 안해주면 밑에까지 쭈욱 나옴
            case "여름":
                System.out.println("여름에는 낙산해수욕장을 가보세요~");
                break;
            case "가을":
                System.out.println("가을에는 춘천을 가보세요~");
                break;
            case "겨울":
                System.out.println("겨울에는 홍천스키장을 가보세요~");
                break;
            default:
                System.out.println("[ 사계절중 하나의 이름을 정확히 입력하세요 ]");
        } // end switch

    }
}

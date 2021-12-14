package project;

import java.util.Arrays;
import java.util.Scanner;

public class TeamProjectV2 {

    public static void main(String[] args) {

        String[] name = new String[3];

        int[] scoreKor = new int[3];
        int[] scoreEng = new int[3];
        int[] scoreMat = new int[3];

        int[] scoreTotal = new int[3];

        double[] scoreAvg = new double[3];

        Scanner sc = new Scanner(System.in);

        int i = 0;
        int select = 1;

        while(true) {
            //메뉴 출력
            System.out.println("========== 성적 관리 프로그램 ==========");
            System.out.println("1. 학생 성적 입력 || 2. 학생 성적 확인 || 3. 프로그램 종료");
            System.out.print(">> ");
            int scoreMenu = sc.nextInt();

            if (scoreMenu == 3) {
                break;
            }

            switch(scoreMenu) {
                case 1:
                    System.out.print("이름을 입력하세요 : ");
                    name[i] = sc.next();
                    System.out.print("국어점수를 입력하세요 : ");
                    scoreKor[i] = sc.nextInt();
                    System.out.print("영어점수를 입력하세요 : ");
                    scoreEng[i] = sc.nextInt();
                    System.out.print("수학점수를 입력하세요 : ");
                    scoreMat[i] = sc.nextInt();
                    i++;
                    break; // end case1
                case 2:
                    System.out.print("학생의 이름을 입력하세요 : ");
                    String checkStudentScore = sc.next();

                    int index = -1;   // 찾은 인덱스를 저장할 변수
                    for (int j = 0; j < name.length; j++) {
                        if (checkStudentScore.equals(name[j])) {
                            index = j;
                            break;
                        }
                    }// end for

                    scoreTotal[index] = scoreKor[index] + scoreEng[index] + scoreMat[index];
                    scoreAvg[index] = (double) scoreTotal[index] / 3;

                    if (index != -1) {
                        System.out.printf("%s의 성적을 확인합니다.\n",checkStudentScore);
                        System.out.printf("국어점수 : %d\n",scoreKor[index]);
                        System.out.printf("영어점수 : %d\n",scoreEng[index]);
                        System.out.printf("수학점수 : %d\n",scoreMat[index]);
                        System.out.printf("총점 : %d | 평균 : %.2f\n",scoreTotal[index], scoreAvg[index]);
                        break;
                    } else {
                        System.out.printf("%s은(는) 없는 이름입니다.\n",checkStudentScore);
                    }

                default:
                    System.out.println("없는 메뉴입니다.");

            } // end switch
        }//end while

    }
}

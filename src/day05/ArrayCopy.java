package day05;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        // 배열 복사 알고리즘
        String[] pets = {"멍멍이", "야옹이", "짹짹이"};

        // 1. 원본배열과 사이즈가 같은 새 배열을 하나 더 생성
        String[] pCopy = new String[pets.length];

        // 2. 원본배열의 값들을 일일히 사본배열로 값복사
//        pCopy[0] = pets[0];
//        pCopy[1] = pets[1];
//        pCopy[2] = pets[2];
        for (int i = 0; i < pets.length; i++) {
            pCopy[i] = pets[i];
        }

        System.out.println("원본: " + Arrays.toString(pets));
        System.out.println("사본: " + Arrays.toString(pCopy));

        pets[1] = "어흥이";
        pCopy[0] = "켁켁이";

        System.out.println("원본: " + Arrays.toString(pets));
        System.out.println("사본: " + Arrays.toString(pCopy));

    }
}

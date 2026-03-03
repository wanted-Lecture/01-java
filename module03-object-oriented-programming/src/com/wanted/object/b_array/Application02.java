package com.wanted.object.b_array;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {
        /**
         * comment, 배열을 활용한 여러 명의 Java 시험점수 계산기
         *  요구사항
         * 1. 5명의 Java 점수를 정수로 입력 받는다.
         * 2. 점수를 입력 받아서 합계와 평균을 실수로 구하는 프로그램
         */

        // 5명의 java 점수를 저장할 배열 생성
        double sum = 0.0, avg = 0.0;
        int[] scores = new int[5];

        Scanner sc = new Scanner(System.in);

        // 배열의 연속적인 공간이라는 특성을 활용하여 반복문을 써보자.
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "번 째 학생의 점수를 입력해주세요 : ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        // 평균 : 합계의 길이만큼 나눠준다.
        avg = sum / scores.length;

        System.out.println("5명 점수의 합계 : " + sum);
        System.out.println("5명 점수의 평균 : " + avg);
    }
}

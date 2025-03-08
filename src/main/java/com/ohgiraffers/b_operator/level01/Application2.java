package com.ohgiraffers.b_operator.level01;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 정수형 변수를 선언하여 점수를 저장하고,
         * 삼항 연산자를 사용하여 점수가 60점 이상이면 “합격입니다”,
         * 그렇지 않으면 “아쉽지만 불합격입니다.” 을 출력하는 프로그램을 작성해본다.
         *
         *
         * -- 출력 예시 --
         *
         * 합격입니다~~!!! 또는 아쉽지만 불합격입니다..
         *
         * */
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.print("정수를 입력하세요: ");
        num1 = scanner.nextInt();

        System.out.println(num1 >= 60 ? "합격입니다~!!!":"불합격입니다...");

    }
}

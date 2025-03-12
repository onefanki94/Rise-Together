package com.mataverse.teams.lesson1;

public class Application {
    public static void main(String[] args) {
       String inputText = "Java Programming Language";
        String result = Application.length(inputText);
        System.out.println(result); // 결과값 출력

    }

    public static String length(String inputText) {
        // 1. 입력 문자열을 `split(" ")`으로 분할하여 단어 배열을 생성한다.
        String[] words = inputText.split(" ");

        // 2. 배열의 인덱스 0, 1, 2의 단어를 변수에 직접 할당한다.
        String word1 = words[0];
        String word2 = words[1];
        String word3 = words[2];

        // 3. 각 단어의 길이를 `length()` 메서드로 계산한다.
        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        // 4. 세 단어의 길이의 합계를 계산한다.
        int totalLength = length1 + length2 + length3;

        // 결과 문자열을 반환
        return "단어1 : " + length1 + ", 단어2 : " + length2 + ", 단어3 : " + length3 + ", 총 길이 : " + totalLength;
    }
}

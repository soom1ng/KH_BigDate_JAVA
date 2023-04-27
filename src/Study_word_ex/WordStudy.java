package Study_word_ex;

import java.util.Scanner;

// 알파벳 대소문자로 이루어진 단어가 주어지면 가장 많이 등장한 알파벳을 찾는 문제
// 입력은 대소문자를 입력하고, 결과는 대소문자 구분을 하지 않음 .
// 만약 가장 많이 등장한 알파벳이 여러 개인 경우는 ? 로 출력
// 출력 결과 예시 : (AaSAbCdaa => A)
// 출력 결과 예시 : (AaCCdb => ?) A와 C가 전부 2번씩 등장했기 때문에 ? 출력 됨 .
public class WordStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳 개수 만큼의 배열 생성 (가장 많이 등장한 알파벳을 count 하기 위함 .)
        int[] alphabet = new int[26];
        int max = 0; // 가장 큰 수 찾기
        char rst = 0; // 결과값으로 출력 할 알파벳을 구하기 위한 변수

        System.out.println("단어 입력 : ");
        String word = sc.next();

        // 'A' - 'Z' : 65 - 90
        // 'a' = 'z' : 97 - 122
        // 입력 받은 단어의 길이만큼 순회하면 alphabet 배열에 횟수 누적
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') alphabet[word.charAt(i) - 'a']++;
            else alphabet[word.charAt(i) - 'A']++;
        }
        for(int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] == max) rst = '?'; // 배열 인덱스 값과 max 값이 같으면 '?' 출력
            else if (alphabet[i] > max)  {
                max = alphabet[i]; // 인덱스에 해당하는 배열 값이 더 크면 max 값을 변경
                // 배열 인덱스에서 'A' 만큼의 값을 증가시켜서 결과 값으로 실제 대문자 ASCII 값을 구함 .
                rst = (char) ('A' + i);
            }
        }
        System.out.println(rst);
    }
}


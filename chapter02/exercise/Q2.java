package chapter02.exercise;

public class Q2 {
    public static void main(String[] args){
        char ch1 ='안';
        System.out.println((int)ch1);   // '글'이라는 한글 문자의 유니코드 값 찾기

        char ch2 = 50504;
        System.out.println(ch2);

        char ch3 = '\uAE00';            // 유니코드 값으로 문자 출력하기 (unicode.org 참조)
        System.out.println(ch3);
    }
}

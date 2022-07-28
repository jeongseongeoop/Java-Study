package chapter02;

public class Constans{
    public static void main(String[] args){
      final int MAX_NUM = 100 ; // 선언과 동시에 초기화
      final int MIN_NUM;

      MIN_NUM = 0; // 사용하기전에 초기화 초기화하지않으면 오류 발생

      System.out.println(MAX_NUM);
      System.out.println(MIN_NUM);
    }
}
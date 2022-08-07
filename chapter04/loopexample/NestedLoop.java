package chapter04.loopexample;

public class NestedLoop {
    public static void main(String[] args){
        int dan;
        int times;

        for (dan=2; dan<=9; dan++){
            System.out.println(dan);
            for(times=1; times<=9; times++){
                System.out.println((dan+"x"+times+"="+dan*times));
            }
            System.out.println();
        }
        // 1분 복습, 3단 ~ 7단까지만 ㅜㄹ력하기

        for (dan=3; dan<=7; dan++){
            System.out.println(dan);
            for(times=1; times<=9; times++){
                System.out.println(dan+"x"+times+"="+dan*times);
            }
        }
    }
}
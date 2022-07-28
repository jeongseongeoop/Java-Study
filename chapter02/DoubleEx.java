package chapter02;

public class DoubleEx{
    public static void main(String[] args){
        double num = 1 ;
        for(int i=0; i<10000; i++){ 
            // 10000번 돌리기
            num = num+1;
        }
        System.out.println(num);
    }
}
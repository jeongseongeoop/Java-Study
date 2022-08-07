package chapter04.loopexample;

public class DoWhileExample {
    public static void main(String[] args){
    int num = 1;
    int num2 = 0;

        do{
            num2 += num;
            num++;
        }while(num<=20);
        System.out.println("1부터 20까지의 합은"+ num2 +"입니다.");
    }
}
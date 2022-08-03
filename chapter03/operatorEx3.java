// 증감 연산자 ++, --

package chapter03;

public class operatorEx3{
    public static void main(String[] args){
        int myAge = 23;
        int teactherAge =38;

        boolean value = (myAge>25);
        System.out.println(value);

        System.out.println(myAge<=25);
        System.out.println(myAge<=teactherAge);
        
        char ch;
        ch = (myAge>teactherAge) ? 'T':'F';
        System.out.println(ch);


    }
}
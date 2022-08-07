package chapter03.operator;

public class operator4 {
    public static void main(String[] args){
        int fatherAge = 58;
        int motherAge = 47;

        char ch;
        ch = ( fatherAge > motherAge ) ? 'T':'F';

        System.out.println(ch);

        //  1분 복습
        int num = 10;
        boolean insEven;

        insEven = ((num%2)==0)? true : false;
        System.out.println(insEven);
    }
}

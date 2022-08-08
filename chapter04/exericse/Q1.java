package chapter04.exericse;


public class Q1 {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 2;

        char operator ='+';
        int result=0;

        if(operator == '+'){
            result = num1+num2;
        }else if(operator == '-'){
            result = num1-num2;
        }else if(operator == '*'){
            result = num1 * num2;
        }else if(operator == '/'){
            result = num1/num2;
        }else{
            System.out.println(" 사칙 연산자가 아닙니다. ");
        }
        System.out.println(operator+"연산 결과는"+result+"입니다.");
    }
}

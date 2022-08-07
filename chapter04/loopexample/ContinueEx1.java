package chapter04.loopexample;

public class ContinueEx1 {
    public static void main(String[] args){
        int total = 0;
        int num;

        for( num=1; num<=100; num++){
            if (num%2 ==0){
            continue;
            }else{
                total+=num;
            }
        }
        System.out.println("1부터 100까지 홀수의 합은:"+total+"입니다.");
        System.out.println();

        // 1분 복습
        System.out.println("(방법1) 3의 배수:");

        for (num=1; num <= 100; num++){
            if(num%3 ==0 ){
            System.out.println(num+"");
            }else{
                continue;
            }
        }
        System.out.println();
		System.out.print("(방법2) 3의 배수 : ");
		for(num=1; num<=100; num++) {
			if(num % 3 != 0) {
				continue;
			}
			System.out.print(num + " ");
		}
    }
}

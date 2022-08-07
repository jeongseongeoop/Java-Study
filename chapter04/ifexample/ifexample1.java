package chapter04.ifexample;

public class ifexample1 {
    public static void main(String[] args){
        int age = 7;
        if(age>=8){
            System.out.println(" 학교에 다닌다. ");
        }
        else {
            System.out.println(" 학교에 안 다닌다. ");
        }
        // 1분 복습
		char gender = 'F';
		
		if (gender == 'F') {		// 만약 gender가 'F'라면
			System.out.println("여성입니다.");
		} else {					// 그렇지 않다면
            System.out.println("남성입니다.");
    }
}
}

package chapter03.operator;

public class operator1 {
    public static void main(String[] args){
        int MathScore = 90;
        int EngScore=70;

        int totalScore = MathScore+ EngScore; // 총점 구하기
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0;			// 평균 구하기
		System.out.println(avgScore);
		
		
		// 1분 복습
		System.out.println();

		int korScore = 95;							// 국어 점수 추가
		totalScore = totalScore + korScore;			// 국어 점수 더해주기
		avgScore = totalScore / 3.0;				// 국어 점수 포함, 국영수 3과목 평균 구하기
		
		System.out.println(totalScore);
		System.out.println(avgScore);
    }
}

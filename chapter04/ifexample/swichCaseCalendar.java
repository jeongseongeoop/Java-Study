package chapter04.ifexample;

public class swichCaseCalendar {
  public static void main(String[] args) {
		int month = 7;
		int day = 0;

		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			//  1월, 3월,5월,7월,8월,10월,12월 은 31일까지
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
			//  4월, 6월, 9월, 11월은 30일까지
				day = 30;
				break;
			case 2:
			//  2월은 28일까지
				day = 28;
				break;
		}
		
		System.out.println(month+"월은"+day+"일 까지입니다.");
	}
}

package chapter06;

class Birthday{
    int Day;
    int Mount;
    int Year;


    public void setYear(int Year){
        this.Year = Year;
        }
    public void printlnThis(){
        System.out.println(this);
    }
}
public class ThisExample {
    public static void main(String[]args){
        Birthday bDay = new Birthday();
        bDay.setYear(2000); // 태어난 연도 지정
        System.out.println(bDay);
        bDay.printlnThis();
    }
}

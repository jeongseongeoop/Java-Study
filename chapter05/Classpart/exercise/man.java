package chapter05.Classpart.exercise;

public class man {
    // 멤버변수
    String ManName;
    int height;
    int age;
    double weight;
    char gender;
    boolean married;
    String childern;
    
    public String getpernsonName(){
        return ManName;
    }

    public static void main(String[] args){
        man ps = new man();

        ps.ManName = "james";
        ps.age = 40;
        ps.married = true;
        ps.childern = "3";

        System.out.println(
            "이름은 :" + ps.ManName+
            "나이는 :" + ps.age+
            "결혼은 :" + ps.married+
            "자식은 :" + ps.childern
            );
    }
}

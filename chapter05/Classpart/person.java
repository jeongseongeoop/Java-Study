package chapter05.Classpart;

public class person {
    // 멤버변수
    String PersonName;
    int height;
    int age;
    double weight;
    char gender;
    boolean married;
    String childern;
    
    public String getpernsonName(){
        return PersonName;
    }

    public static void main(String[] args){
        person ps = new person();

        ps.PersonName = "james";
        ps.age = 40;
        ps.married = true;
        ps.childern = "3";

        System.out.println(
            "이름은 :" +  ps.PersonName+
            "나이는 :" + ps.age+
            "결혼은 :" + ps.married+
            "자식은 :" + ps.childern
            );
    }
}

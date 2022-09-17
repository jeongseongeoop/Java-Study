package chapter05.constructor.person;

public class person {
    String name;
    float height;
    float weight;

    // 디폴트 생성자
    public person(){}
    // 사람이름을 매개변수로 입력 받아서 person 클래스를 생성하는 생성자

    public person(String pname){
        name = pname;
    }
    // 매개변수로 입력을 받는 생성자
    public person(String pname, float pheight, float pweight){
        name = pname;
        height = pheight;
        weight = pweight;
    }
}

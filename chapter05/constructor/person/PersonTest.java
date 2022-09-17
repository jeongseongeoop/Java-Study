package chapter05.constructor.person;

public class PersonTest {
    public static void main(String[] args){
        person personkim = new person();

        personkim.name = "김유신";
        personkim.height = 180.0F;
        personkim.weight = 85.5F;

        person personLee = new person("이순신", 175, 75);

        System.out.println(personLee.name);
        System.out.println(personkim.name);
       }
}

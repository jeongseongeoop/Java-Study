package chapter05.Classpart;

public class student_part2 {
    int StudentID;
    String StudenName;
    int grade;
    String addres;

    public static void main( String[] args){
        student student1 = new student(); // 첫번째 학생
        student1.StudentName = "안연수"; // 멤버변수 사용   
        System.out.println(student1.StudentName);
        
        student student2 = new student(); // 두번째 학생
        student2.StudentName = "안현수";
        System.out.println(student2.StudentName);
    }
}

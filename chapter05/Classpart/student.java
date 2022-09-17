package chapter05.Classpart;
// 클래스를 만드는 예약어 / 클래스 이름
public class student {

    // 멤버변수
    int StudentID; // 학번
    String StudentName; // 학생이름
    int grade; // 학년
    String address; // 사는 곳

        // 메서드
    public String getStudentName(){
        return StudentName;
    }

    public static void main(String[] args){
        student st = new student(); // Student class 생성
        st.StudentName = "메롱";
        
        System.out.println(st.StudentName);
        System.out.println(st.getStudentName());
    }
}
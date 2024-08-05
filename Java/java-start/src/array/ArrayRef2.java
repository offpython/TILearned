package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] student; //배열 변수 선언
        student = new int[5];  //배열 생성

        //변수 값 대입
        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;

        //참조값 확인 -> [I@a09ee92 => I int @ 16진수 
        System.out.println(student);

        //변수 값 사용
        for (int i = 0; i < student.length; i++){
            System.out.println("학생" + (i + 1) + "의 점수 : " + student[i]);
        }
    }
}
package array;

public class ArrayRef4 {
    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};  //배열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i < student.length; i++){
            System.out.println("학생" + (i + 1) + "의 점수 : " + student[i]);
        }
    }
}

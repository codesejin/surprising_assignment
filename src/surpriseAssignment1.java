import java.util.Scanner;

public class surpriseAssignment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<[수강신청]>>>>");
        System.out.println("1. 강의 관리 ");
        System.out.println("2. 교사 관리 ");
        System.out.println("3. 학생 관리 ");
        System.out.println("4. 신청 관리 ");
        System.out.println("5. 종료 ");

        while (true) {
            int input = sc.nextInt();
            sc.nextLine();
            if ( input == 5 ){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if ( input == 1 ) {
                System.out.println("강의 관리 메뉴를 선택했습니다.");
            } else if ( input == 2 ) {
                System.out.println("교사 관리 메뉴를 선택했습니다.");
            } else if ( input == 3 ) {
                System.out.println("학생 관리 메뉴를 선택했습니다.");
            } else if ( input == 4 ) {
                System.out.println("신청 관리 메뉴를 선택했습니다.");
                System.out.println("1. 회원 관리 ");
                System.out.println("2. 과목 관리 ");
                System.out.println("3. 수강 관리 ");
                System.out.println("4. 결제 관리 ");
                System.out.println("5. 종료 ");
            } else {
                System.out.println("입력값이 정확하지 않습니다.");
            }
        }
    }
}
import java.util.Scanner;

public class answer1 {
    // 무한 출력해야 한다는 이슈가 있기에 => 함수로 만들어줌
    // 컨트롤 + > 로 줄어들게 할 수 있음
    // 이렇게 함수로 만드는 과정을 리팩토링이라 함
    // 내용이 길어지면 병적으로 리팩토링으로 분리해서
    // 관심사를 돌려서 다른 걸 처리한다
    public static void displaylecture() {
        // printlin여러개를 배열로 초기화해주면 간단
        String[] lectureList = {
                "<<<<[수강신청]>>>>",
                "1. 강의 관리 ",
                "2. 교사 관리 ",
                "3. 학생 관리 ",
                "4. 신청 관리 ",
                "5. 종료 "
        };
//        for (int i = 0; i < lectureList.length; i++) {
//            System.out.println(lectureList[i]);
//        }
        // for-each문
        for ( String lecture : lectureList){
            System.out.println(lecture);
        }
    }

    // 메인함수에 있던 걸 꺼내서 함수로 만들었는데
    // inputLecture라는 변수는 메인에 있어서 오류가 뜸
    // 이럴때는 selctLecture함수 안에 매개변수로 inputLecture을 넣어주면 됨
    public static void selectLecture(int inputLecture) {
        switch (inputLecture) {
            case 1:
                System.out.println("강의 관리 메뉴를 선택했습니다.");
                break;
            case 2:
                System.out.println("교사 관리 메뉴를 선택했습니다.");
                break;
            case 3:
                System.out.println("학생 관리 메뉴를 선택했습니다.");
                break;
            case 4:
                System.out.println("신청 관리 메뉴를 선택했습니다.");
                break;
            case 5:
                System.out.println("프로그램을 종료합니다.");
                break;
            default: // '그 외'라는 건 switch문에서 default로 처리할수있다
                System.out.println("입력값이 정확하지 않습니다.");
        }
    }

    public static void main(String[] args) {
        // 스캐너는 기본적으로 생성할때 인풋..? 을 필요로 한다
        // 이걸 해줘야 스캐너를 사용할 수 있음
        Scanner sc = new Scanner(System.in);
        boolean exitYn = false;
        while (exitYn == false) { // !exitYn이랑 똑같음
            displaylecture();

            int inputLecture = sc.nextInt();

            selectLecture(inputLecture);

            if (inputLecture == 5) {
                exitYn = true;
            }
        }
//        do {  // 위에 코드를 do while로 바꿀수도 있음
//            displaylecture();
//
//            int inputLecture = sc.nextInt();
//
//            selectLecture(inputLecture);
//        } while (inputLecture !=5) ;
        // while 괄호안에서 에러나는 이유는
        // inputLecture라는 변수의 스코프가 블럭안에 있어서 외부에서 체크가 안됌
        // 그래서 do-while바깥에 inputLecture을 초기화해주면 가능

        //for문은 특정한 조건에 의해 반복되는데, 범위가 있다
        // 시작값, 종료값,스택이있을대
        // while문은 조건이 만족한다면 무한루프
    }
}

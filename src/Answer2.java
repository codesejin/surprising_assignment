public class Answer2 {

    // 자바는 클래스로 되어 있습니다
    // 클래스 ==> 속성, 메소드
    //클래스는 스코프가 있는데, 중괄호기준
    public static void main(String[] args) {
        String filePath = "C:\\Users\\admin\\IdeaProjects\\surprise\\src\\textsample.txt";

        FileUtils2 fileUtils2 = new FileUtils2();

        String fileText = fileUtils2.getLoadText(filePath);
        fileText = fileText.toLowerCase();

        // 변수를 안만들 순 없음 ==> 동일한 작업할때는 배열 사용
//        int aCnt = 0;
        int[] alpCnt = {
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0,0,0,0,0,
                0,0,0,0,0,0
        };

        for (int i = 0; i < fileText.length(); i++) {
            char c1 = fileText.charAt(i);
            if (c1 == 'a') {alpCnt[0]++;}
            else if (c1 == 'b') {alpCnt[1]++;}
            else if (c1 == 'c') {alpCnt[2]++;}
            else if (c1 == 'd') {alpCnt[3]++;}
            else if (c1 == 'e') {alpCnt[4]++;}
            else if (c1 == 'f') {alpCnt[5]++;}
            else if (c1 == 'g') {alpCnt[6]++;}
            else if (c1 == 'h') {alpCnt[7]++;}
            else if (c1 == 'i') {alpCnt[8]++;}
            else if (c1 == 'j') {alpCnt[9]++;}
            else if (c1 == 'k') {alpCnt[10]++;}
            else if (c1 == 'l') {alpCnt[11]++;}
            else if (c1 == 'm') {alpCnt[12]++;}
            else if (c1 == 'n') {alpCnt[13]++;}
            else if (c1 == 'o') {alpCnt[14]++;}
            else if (c1 == 'p') {alpCnt[15]++;}
            else if (c1 == 'q') {alpCnt[16]++;}
            else if (c1 == 'r') {alpCnt[17]++;}
            else if (c1 == 's') {alpCnt[18]++;}
            else if (c1 == 't') {alpCnt[19]++;}
            else if (c1 == 'u') {alpCnt[20]++;}
            else if (c1 == 'v') {alpCnt[21]++;}
            else if (c1 == 'w') {alpCnt[22]++;}
            else if (c1 == 'x') {alpCnt[23]++;}
            else if (c1 == 'y') {alpCnt[24]++;}
            else if (c1 == 'z') {alpCnt[25]++;}
            }
        for (int i = 0; i < alpCnt.length; i++) {
            // i + 65
            String format = String.format("%c = %d, \t %.2f", i +65, alpCnt[i], 0);
            System.out.println(format);
        }
    }

}


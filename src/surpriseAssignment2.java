import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class surpriseAssignment2 {
    public static void main(String[] args) {
   //     String inputFile = "./President19Message.txt";
        FileUtils fileUtils = new FileUtils();
        int[] countAlphabet = new int[26];
        int totalAlphabet = 0;
        String str = fileUtils.getLoadText("/admin/IdeaProjects/surprise/President19Message.txt");

        // [조건 1] 전체 문자열의 길이는 String.length() 함수 이용
        for(int i = 0 ; i < str.length() ; i++){
            // [조건 2] String.charAt(index) 함수 이용
            char c = str.charAt(i);

            // [조건 3] 대소문자 구분하지 않기 위해 모든 문자를 대문자 처리
            String upperCaseString = String.valueOf(c).toUpperCase();

            // 문자 카운트
            int alphabetCode = upperCaseString.charAt(0)-65;
            if(0 <= alphabetCode && alphabetCode <= 25){
                countAlphabet[alphabetCode]++;
                totalAlphabet++;
            }
        }

        for(int i = 0 ; i < countAlphabet.length ; i++){
            System.out.printf("%c = %6d개, %6.2f%%\n", i + 65, countAlphabet[i], (double)countAlphabet[i]/str.length()*100);
        }
    }
}
class FileUtils{
    public String getLoadText(String filePath){
        StringBuilder sb = new StringBuilder();

        try{
            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);
            for(int i = 0; i<lines.size(); i++){
                if(i > 0){
                    sb.append("\n");
                }
                sb.append(lines.get(i));
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        return sb.toString();
    }
}
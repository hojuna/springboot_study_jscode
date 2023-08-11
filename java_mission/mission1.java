
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class mission1 {

    public static boolean isKorean(String input) {
        for (char c : input.toCharArray()) {
            // 한글의 유니코드 범위: 가 ~ 힣
            if (c >= '가' && c <= '힣') {
                return true;
            }
        }
        return false;
    }
    

    public static void print(Object str){
        System.out.println(str);
    }

    public static void main(String[] args){

        print("학생의 이름을 입력하고 엔터를 누르세요. (한글로만 입력해야 합니다.)\n학생들을 다 입력했다면, print라고 입력해주세요.");

        ArrayList<String> arrayList = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        while(true){

            String name= sc.nextLine();



            if (name.equals("print")){
                print("종료");
                break;
            }
            if(!isKorean(name)){
                print("학생의 이름은 한글로만 입력해야 합니다.");
                continue;
            }
            
            arrayList.add(name);
        }

        arrayList.sort(Comparator.naturalOrder());
        
        print("[학생 명단(가나다순)]");
        for( String a: arrayList){
            print(a);
        }
        
        sc.close();

    }


}

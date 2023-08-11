import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class mission2 {

    
    public static void print(Object str){
        System.out.println(str);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<String> playerNumbers = new ArrayList<>();
        List<Double> playerRecords = new ArrayList<>();
    
        while(true){

            print("선수의 번호를 입력하세요.");
            String num= sc.nextLine();

            if(num.equals("print")){
                break;
            }
            playerNumbers.add(num);

            print("이 선수의 100m 달리기 기록이 몇 초인지 입력하세요.");

            double record =sc.nextDouble();
            sc.nextLine();
            
            playerRecords.add(Math.round(record*100)/100.0);

        }

        double maxRecord=Collections.min(playerRecords);

        String bestPlayer = playerNumbers.get(playerRecords.indexOf(maxRecord));

        print("1등 : "+ bestPlayer +"번 선수 / "+maxRecord+" (참가인원 : "+playerNumbers.size()+"명)");
            

        sc.close();
    }
}

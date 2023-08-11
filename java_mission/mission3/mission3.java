package mission3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mission3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        System.out.println("0번 입력시 종료됩니다.!");
        while (true){
            System.out.println(library.toString());
            int num= sc.nextInt();
            if(num==0){
                System.out.println("종료합니다.");
                break;
            }
            if(num>library.size()){
                System.out.println("범위를 벗어납니다 다시 입력해주세요");
                continue;
            }
            library.bringBook(num);

        }

    }
}

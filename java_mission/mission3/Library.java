package mission3;


import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> library = new ArrayList<>(List.of(
            new Book("클린코드(Clean Code)"),
            new Book("객체지향의 사실과 오해"),
            new Book("테스트 주도 개발(TDD)")
        )
    );

    public Library() {

    }

    public void addBook(Book book){
        library.add(book);
    }

    public Book getBook(int id){
        return  library.get(id);
    }

    public void bringBook(int id){
        Book index= getBook(id-1);
        boolean indexState = index.isState();

        if(indexState){
            System.out.println("대여 중인 책은 대여할 수 없습니다.");
        }
        else{
            index.setState(true);
            library.set(id-1,index);
            System.out.println("정상적으로 대여가 완료되었습니다.");
        }
    }
    public int size(){
        return library.size();
    }

    @Override
    public String toString() {
        String index= "대여할 책의 번호를 입력하세요.";
        int num=1;
        for(Book i : library){
            index+= "\n"+num +". "+ i.toString();
            num+=1;
        }
        return index;
    }
}

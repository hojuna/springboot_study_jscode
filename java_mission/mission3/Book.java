package mission3;

public class Book {


    private boolean state = false;
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String index = "대여 가능";
        if(state){
            index="대여 중";
        }
        return name+" - "+index;
    }
}

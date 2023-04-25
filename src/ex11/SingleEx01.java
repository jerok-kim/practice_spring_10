package ex11;

class DoorMan {

    // 1. private로 생성자 호출을 막는다.
    private DoorMan() {
    }

    // 2. static으로 main 시작전에 new 한다.
    private static DoorMan instance = new DoorMan();
    
    public static DoorMan getInstance() {
        return instance;
    }

}

public class SingleEx01 {

    public static void main(String[] args) {
        DoorMan d1 = DoorMan.getInstance();
        DoorMan d2 = DoorMan.getInstance();
        System.out.println(d1);
        System.out.println(d2);
    }

}

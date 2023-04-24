package ex03;

import java.time.LocalDateTime;

class Data {
    public void think() throws InterruptedException {
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.print(".");
        }
        System.out.println();
        LocalDateTime end = LocalDateTime.now();
        System.out.println("시작시간 : " + start);
        System.out.println("끝시간 : " + end);
    }
}

public class MethodEx01 {

    public static void main(String[] args) {
        Data d1 = new Data();
        try {
            d1.think();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

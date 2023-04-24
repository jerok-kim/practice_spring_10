package ex04;

class Car {
    private String 기어상태;  // d(전진), r(후진), p(파킹)
    private int 속력;
    private int 엔진파워;
    private String 색상;

    public Car(int 엔진파워, String 색상) {
        this.엔진파워 = 엔진파워;
        this.색상 = 색상;
        this.기어상태 = "p";
    }

    public void 기어변경(String state) {
        if (state.equals("d")) {
            기어상태 = "전진";
        } else if (state.equals("r")) {
            기어상태 = "후진";
        }
    }

    public void 엑셀밟기(int level) {
        if (!기어상태.equals("전진")) {
            System.out.println("기어 변경을 d로 해주세요");
            return;
        }
        속력 = level * 엔진파워;
    }

    public String get기어상태() {
        return 기어상태;
    }

    public int get속력() {
        return 속력;
    }

    public int get엔진파워() {
        return 엔진파워;
    }

    public String get색상() {
        return 색상;
    }
}

public class OOPEx01 {

    public static void main(String[] args) {
        Car car = new Car(30, "노랑");
        System.out.println("색상 : " + car.get색상());
        System.out.println("엔진파워 : " + car.get엔진파워());
        System.out.println("기어상태 : " + car.get기어상태());
        System.out.println("속력 : " + car.get속력());
        System.out.println("===========================");

        car.엑셀밟기(1);
        System.out.println("속력 : " + car.get속력());
        System.out.println("===========================");

        car.기어변경("d");
        System.out.println("기어상태 : " + car.get기어상태());
        System.out.println("===========================");

        car.엑셀밟기(2);
        System.out.println("속력 : " + car.get속력());
        System.out.println("===========================");
    }

}

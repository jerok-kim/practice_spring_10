package ex08;

/**
 * 지구인 : 걷는다(행위 특징), 말한다(행위 특징)
 * 아시아인 : 황색피부(상태 특징)
 * 아프리카인 : 검정색피부(상태 특징)
 * 일본인(Object) : 일본어로 말한다(행위 특징)
 * 한국인(Object) : 한국어로 말한다(행위 특징)
 * 소말리아인(Object) : 소말리아어로 말한다(행위 특징)
 */
class 지구인 {
    public void walk() {
        System.out.println("걷는다");
    }

    public void speak() {
    }
    
    public String getSkin() {
        return "";  // 내가 무슨 색인지 모르겠어
    }
}

class 아시아인 extends 지구인 {
    String skin = "황색피부";

    // 상대적으로 무효화 (자식이 재정의 할 경우 오버라이드 됨)
    public void speak() {
        System.out.println("아시아인이 무엇을 말할까? 난 모르겠는데!!");
    }
    
    public String getSkin() {
        return skin;
    }
}

class 아프리카인 extends 지구인 {
    String skin = "검정색피부";
}

class 일본인 extends 아시아인 {
    public void speak() {
        System.out.println("일본어로 말한다");
    }
}

class 한국인 extends 아시아인 {
    public void speak() {
        System.out.println("한국어로 말한다");
    }
}

class 소말리아인 extends 아프리카인 {
    public void speak() {
        System.out.println("소말리아어로 말한다");
    }
}

// 새로운 코드를 만드는 것에는 OPEN 되어 있음.
class 중국인 extends 아시아인 {
    public void speak() {
        System.out.println("중국어로 말한다.");
    }
}

/**
 * 타입에 따라 변수를 찾아간다.
 * 상속을 통해 메모리 구조를 디자인할 수 있다.
 */
public class MemEx02 {

    // public static void start() {
    //     한국인 obj = new 한국인();  // (한국인) - 아시아인 - 지구인
    //     System.out.println(obj.skin);
    //     obj.walk();
    //     obj.speak();
    // }

    // 구체적인 한국인에 의존하고 있었는데, 지금은 좀 더 추상적인 아시아인에 의존하고 있음 (DIP)
    // DIP를 지켰음 (구체적인 것이 아닌 추상적인 것에 의존함)
    // OCP를 지켰음 (코드 변경이 일어나지 않음)
    public static void start(지구인 obj) {
        System.out.println(obj.getSkin());  // 동적 바인딩
        obj.walk();
        obj.speak();
    }

    public static void main(String[] args) {

        // start();

        // start(new 한국인());  // (한국인) - 아시아인 - 지구인
        // start(new 일본인());  // (일본인) - 아시아인 - 지구인
        // start(new 소말리아인());  // (소말리아인) - 아프리카인 - 지구인
        
        start(new 중국인());
    }

}

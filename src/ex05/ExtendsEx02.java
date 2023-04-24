package ex05;

/**
 * 추상화와 재사용의 목적이 있다.
 */
class Button {
    String color = "blue";
    String shape = "circle";
    boolean border = true;
}

class TextButton extends Button {
    String text = "완료";
}

public class ExtendsEx02 {

    public static void main(String[] args) {
        TextButton tb = new TextButton();
        System.out.println(tb.text);
        System.out.println(tb.color);
        System.out.println(tb.shape);
        System.out.println(tb.border);
    }

}

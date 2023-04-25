package design_patterns.adapter_pattern;

public class Cat extends Animal {
    private String name = "고양이";

    @Override
    public String getName() {
        return name;
    }
}

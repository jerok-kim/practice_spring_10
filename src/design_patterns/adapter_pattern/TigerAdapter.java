package design_patterns.adapter_pattern;

public class TigerAdapter extends Animal {
    private OuterTiger outerTiger;

    public TigerAdapter(OuterTiger outerTiger) {
        this.outerTiger = outerTiger;
    }

    @Override
    public String getName() {
        return outerTiger.getFullName();
    }
}

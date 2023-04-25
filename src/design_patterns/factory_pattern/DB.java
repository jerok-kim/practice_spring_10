package design_patterns.factory_pattern;

public interface DB {
    public void setUrl(String url);

    public int execute(String sql);
}

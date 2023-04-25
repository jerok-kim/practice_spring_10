package design_patterns.factory_pattern;

public class App {
    public static void main(String[] args) {
        DBFactory dbFactory = DBFactory.getInstance();
        DB db = dbFactory.createDB("oracle");
        db.execute("select");
    }
}

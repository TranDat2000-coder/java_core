package creational_patterns.builder.builder1;

public class Sony extends Company{
    @Override
    public String pack() {
        return "Sony CD";
    }

    @Override
    public int price() {
        return 20;
    }
}

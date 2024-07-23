package creational_patterns.builder.builder1;

public class Panasonic extends Company{
    @Override
    public String pack() {
        return "Panasonnic CD";
    }

    @Override
    public int price() {
        return 34;
    }
}

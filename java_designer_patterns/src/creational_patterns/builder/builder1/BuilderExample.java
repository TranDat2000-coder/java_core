package creational_patterns.builder.builder1;

public class BuilderExample {
    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();
        CDType cdType = cdBuilder.buildSonyCD();
        cdType.showItems();

        CDType cdType1 = cdBuilder.buildSamsungCD();
        cdType1.showItems();

        CDType cdType2 = cdBuilder.buildPanasonic();
        cdType2.showItems();
    }
}

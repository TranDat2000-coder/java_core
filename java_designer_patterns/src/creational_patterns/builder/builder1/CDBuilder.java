package creational_patterns.builder.builder1;

public class CDBuilder {

    public CDType buildSonyCD(){
        CDType cdType = new CDType();
        cdType.addItems(new Sony());
        return cdType;
    }

    public CDType buildSamsungCD(){
        CDType cdType = new CDType();
        cdType.addItems(new Samsung());
        return cdType;
    }

    public CDType buildPanasonic(){
        CDType cdType = new CDType();
        cdType.addItems(new Panasonic());
        return cdType;
    }
}

package creational_patterns.builder.builder1;

import java.util.ArrayList;
import java.util.List;

public class CDType {

    private List<Packing> items = new ArrayList<>();

    public void addItems(Packing packing){
        items.add(packing);
    }

    public void getCost(){
        for(Packing p : items){
            p.price();
        }
    }

    public void showItems(){
        for(Packing p : items){
            System.out.println("CD name: " + p.pack() + ", Price " + p.price());
        }
    }
}

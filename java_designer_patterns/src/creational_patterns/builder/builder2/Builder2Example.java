package creational_patterns.builder.builder2;

public class Builder2Example {
    public static void main(String[] args) {
        House house = new House.HouseBuilder(2)
                .setHasGarage(true)
                .setHasSwimmingPool(false)
                .setHasGarden(true)
                .build();

        System.out.println("House built with: " +
                house.getFloors() + " floors, " +
                (house.isHasGarage() ? "garage, " : "no garage, ") +
                (house.isHasSwimmingPool() ? "swimming pool, " : "no swimming pool, ") +
                (house.isHasGarden() ? "garden." : "no garden."));
    }
}

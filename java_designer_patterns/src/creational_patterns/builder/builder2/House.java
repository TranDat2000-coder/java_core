package creational_patterns.builder.builder2;

public class House {

    private int floors;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    public House(HouseBuilder houseBuilder) {
        this.floors = houseBuilder.floors;
        this.hasGarage = houseBuilder.hasGarage;
        this.hasSwimmingPool = houseBuilder.hasSwimmingPool;
        this.hasGarden = houseBuilder.hasGarden;
    }

    public int getFloors() {
        return floors;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public static class HouseBuilder{
        private int floors;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public HouseBuilder(int floors) {
            this.floors = floors;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}

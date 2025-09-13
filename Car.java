public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final boolean automatic;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.automatic = builder.automatic;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%d) - %s, Automatic: %b",
                brand, model, year, color, automatic);
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private String color;      // 👈 исправлено: маленькая буква
        private boolean automatic; // 👈 boolean вместо String

        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setAutomatic(boolean automatic) {
            this.automatic = automatic;
            return this;
        }

        public Car build() {
            if (brand == null || model == null) {
                throw new IllegalStateException("Brand and Model are required fields.");
            }
            return new Car(this);
        }
    }
}

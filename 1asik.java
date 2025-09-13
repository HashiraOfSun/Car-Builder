public class Car { 
    private final String brand;
    private final String model;
    private final int year;
    private final String Color;
    private final String automatic;

    private Car(CarBuilder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.automatic = builder.automatic;
    }
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public String getColor() {return Color;} 
    public int getYear() {return year;}
    public String getAutomatic() {return automatic;}

    @Override
    public String toString() {
        return String.format("%s %s (%d) - %s, Automatic: %b, brand, model, year, color, automatic");
    }
    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private String color;
        private String automatic;

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
        public CarBuilder setAutomatic(String automatic) {
            this.automatic = automatic;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
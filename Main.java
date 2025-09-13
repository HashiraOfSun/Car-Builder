public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("Camry")
                .setYear(2022)
                .setColor("Black")
                .setAutomatic(true)
                .build();

        System.out.println(car);
    }
}
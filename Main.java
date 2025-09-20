public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car car = director.buildToyotaCamry();
        System.out.println(car);

        Car car2 = director.buildBMWX5();
        System.out.println(car2);
    }
}
package construct;

public class Car {
    private String brand;
    private String corp;
    private Double price;
    private int maxSpeed;

    public Car(String brand, String corp, Double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;
    }

    //toString()基本上就是为了用来测试用的，现实中没有多少用它
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

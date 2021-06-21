package novi.basics;

public class Car {
    private String color;
    private int maxSpeed;
    public String carInfo() {
        return color + "Max Speed:- " + maxSpeed;
    }

    Car(String carColor, int speedLimit) {
    this.color = carColor;
    this.maxSpeed = speedLimit;
    }

}

package racingcar;

public class Car {
    private String name;
    StringBuilder position = new StringBuilder("");

    public StringBuilder move() {
        return position.append("-");
    }

    public Car(String name) {
        this.name = name;
    }

    public String printCarName() {
        return name + " : ";
    }
}

package racingcar;

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
    }

    public String printCarName() {
        return name + " : ";
    }
}

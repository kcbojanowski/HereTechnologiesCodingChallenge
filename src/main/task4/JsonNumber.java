package main.task4;

public class JsonNumber extends JsonElement {
    private final double value;

    public JsonNumber(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

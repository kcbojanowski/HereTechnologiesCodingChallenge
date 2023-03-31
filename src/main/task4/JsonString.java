package main.task4;

public class JsonString extends JsonElement {
    private final String value;

    public JsonString(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

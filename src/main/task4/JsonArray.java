package main.task4;

import java.util.List;

public class JsonArray extends JsonElement {
    private final List<JsonElement> elements;

    public JsonArray(List<JsonElement> elements) {
        this.elements = elements;
    }

    public List<JsonElement> getElements() {
        return elements;
    }
}

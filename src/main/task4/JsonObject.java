package main.task4;

import java.util.Map;

public class JsonObject extends JsonElement {
    private final Map<String, JsonElement> properties;

    public JsonObject(Map<String, JsonElement> properties) {
        this.properties = properties;
    }

    public Map<String, JsonElement> getProperties() {
        return properties;
    }
}

package com.zackeryrobinson.week3test.dummy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class CarContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<Car> ITEMS = new ArrayList<>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, Car> ITEM_MAP = new HashMap<>();

    private static final int COUNT = 3;

    static {

        ITEMS.add(new Car("Elantra", "Hyundai", "2008"));
        ITEMS.add(new Car("Ultima", "Nisson", "2011"));
        ITEMS.add(new Car("Charger", "Dodge", "1967"));

    }

    private static void addItem(Car item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.model, item);
    }

    private static Car createCarItem(int position) {
        return new Car(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class Car {
        public final String model;
        public final String type;
        public final String year;

        public Car(String id, String content, String details) {
            this.model = id;
            this.type = content;
            this.year = details;
        }

        @Override
        public String toString() {
            return model;
        }
    }
}

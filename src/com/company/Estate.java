package com.company;

import java.util.Currency;
import java.util.HashMap;

public class Estate {
private final EstateType type;
private final float area;
private final float price;
private final HashMap<String, Integer> furnishing;
private final Face face;
private final Location location;
private final int roomCount;
private final boolean hasGarage;
private final boolean hasGarden;
private Estate (EstateBuilder builder){
    this.type=builder.type;
    this.area=builder.area;
    this.price=builder.price;
    this.furnishing=builder.furnishing;
    this.face=builder.face;
    this.location=builder.location;
    this.roomCount=builder.roomCount;
    this.hasGarage=builder.hasGarage;
    this.hasGarden=builder.hasGarden;
}
    public EstateType getType() {
        return type;
    }

    public float getArea() {
        return area;
    }

    public float getPrice() {
        return price;
    }

    public HashMap<String, Integer> getFurnishing() {
        return furnishing;
    }

    public Face getFace() {
        return face;
    }

    public Location getLocation() {
        return location;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    @Override
    public String toString() {
        return "Estate{" +
                "type=" + type +
                ", area=" + area +
                ", price=" + price +
                ", furnishing=" + furnishing +
                ", face=" + face +
                ", location=" + location +
                ", roomCount=" + roomCount +
                ", hasGarage=" + hasGarage +
                ", hasGarden=" + hasGarden +
                '}';
    }
    public static class EstateBuilder{
        private final EstateType type;
        private final float area;
        private final float price;
        private final HashMap<String, Integer> furnishing;
        private final Face face;
        private final Location location;
        private final int roomCount;
        private boolean hasGarage;
        private boolean hasGarden;

        public EstateBuilder(EstateType type, float area, float price, HashMap<String, Integer> furnishing, Face face, Location location, int roomCount) {
            this.type = type;
            this.area = area;
            this.price = price;
            this.furnishing = furnishing;
            this.face = face;
            this.location = location;
            this.roomCount = roomCount;
        }
        public EstateBuilder garage(){
            this.hasGarage=true;
            return this;
        }
        public EstateBuilder garden(){
            this.hasGarden=true;
            return this;
        }
        public Estate build(){
            Estate estate=new Estate(this);
            return estate;
        }
    }
}

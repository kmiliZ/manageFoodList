package com.example.qzhou2_foodbook;

public class Food {
    private String name;
    private String description;
    private int count;
    private String bbd;
    private String location;
    private int unitCount;

    public Food(String name, String description, int count, String bbd, String location, int unitCount) {
        this.name = name;
        this.description = description;
        this.count = count;
        this.bbd = bbd;
        this.location = location;
        this.unitCount = unitCount;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getBbd() {
        return bbd;
    }

    public void setBbd(String bbd) {
        this.bbd = bbd;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(int unitCount) {
        this.unitCount = unitCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

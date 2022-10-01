package com.example.demo;

public class Water_areas {

    private final int id;
    private String title;
    private String category;
    private String salinity;
    private double square;

    private String measure_unit;

    public Water_areas(int id, String title, String category, String salinity, double square, String measure_unit) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.salinity = salinity;
        this.square = square;
        this.measure_unit = measure_unit;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getSalinity() {
        return salinity;
    }

    public double getSquare() {
        return square;
    }

    public String getMeasure_unit() {
        return measure_unit;
    }
}

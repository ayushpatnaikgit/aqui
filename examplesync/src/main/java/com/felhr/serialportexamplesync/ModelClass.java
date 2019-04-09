package com.felhr.serialportexamplesync;


public class ModelClass {

    String data;
    double latitude;
    double longitude;

    public ModelClass(String data, double latitude, double longitude) {
        this.data = data;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}

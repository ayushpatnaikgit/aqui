package com.felhr.serialportexamplesync;



public class Listdata {

    public String dateandtime;
    public String lattitude;
    public String longituude;
    public String value;


    public Listdata(String dateandtime, String lattitude, String longituude, String value) {
        this.dateandtime = dateandtime;
        this.lattitude = lattitude;
        this.longituude = longituude;
        this.value = value;
    }

    public String getDateandtime() {
        return dateandtime;
    }

    public void setDateandtime(String dateandtime) {
        this.dateandtime = dateandtime;
    }


    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongituude() {
        return longituude;
    }

    public void setLongituude(String longituude) {
        this.longituude = longituude;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
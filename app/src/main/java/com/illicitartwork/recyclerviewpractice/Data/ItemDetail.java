package com.illicitartwork.recyclerviewpractice.Data;

/**
 * Created by illic on 9/20/2017.
 */

public class ItemDetail {
    private String message;
    private String dateTime;
    private int colorResource;

    public ItemDetail(String message, String dateTime, int colorResource) {
        this.message = message;
        this.dateTime = dateTime;
        this.colorResource = colorResource;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public int getColorResource() {
        return colorResource;
    }

    public void setColorResource(int colorResource) {
        this.colorResource = colorResource;
    }
}

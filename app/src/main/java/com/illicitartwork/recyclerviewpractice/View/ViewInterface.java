package com.illicitartwork.recyclerviewpractice.View;

import com.illicitartwork.recyclerviewpractice.Data.ItemDetail;

import java.util.List;

/**
 * Created by illic on 9/20/2017.
 */

public interface ViewInterface {
    void startDetailActivity(String dateTime, String message, int colorResource);

    void setUpAdapterAndView(List<ItemDetail> id);
}

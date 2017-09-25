package com.illicitartwork.recyclerviewpractice.Logic;

import com.illicitartwork.recyclerviewpractice.Data.DataSourceInterface;
import com.illicitartwork.recyclerviewpractice.Data.ItemDetail;
import com.illicitartwork.recyclerviewpractice.View.ViewInterface;

/**
 * Created by illic on 9/20/2017.
 */


public class Controller {

    private ViewInterface view;
    private DataSourceInterface ds;


    public Controller(ViewInterface view, DataSourceInterface ds) {
        this.view = view;
        this.ds = ds;

        getListFromDataSource();
    }

    public void getListFromDataSource() {
        view.setUpAdapterAndView(ds.getDataList());
    }

    public void onListItemClicked(ItemDetail testItem) {
        view.startDetailActivity(testItem.getMessage(), testItem.getDateTime(), testItem.getColorResource());
    }
}

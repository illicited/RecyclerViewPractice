package com.illicitartwork.recyclerviewpractice;

import com.illicitartwork.recyclerviewpractice.Data.DataSourceInterface;
import com.illicitartwork.recyclerviewpractice.Data.ItemDetail;
import com.illicitartwork.recyclerviewpractice.Logic.Controller;
import com.illicitartwork.recyclerviewpractice.View.ViewInterface;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

    @Mock
    DataSourceInterface ds;

    @Mock
    ViewInterface vi;
    Controller ctrl;

    private static final ItemDetail testItem = new ItemDetail(
            "When your only tool is a hammer, all problems start looking like nails.", "December 7, 1941", R.color.red
    );

    @Before
    public void SetUpTest() {
        //this command initializes all the @mock stuff above
        MockitoAnnotations.initMocks(this);

        ctrl = new Controller(vi, ds);
    }

    @Test
    public void onGetDataSuccessful() {
        // set up any data for the test
        ArrayList<ItemDetail> dataList = new ArrayList<>();
        dataList.add(testItem);

        //set up mock to return data
        Mockito.when(ds.getDataList()).thenReturn(dataList);

        //call method/unit we're testing
        ctrl.getListFromDataSource();

        //test how the unit responds and verify its behavior
        Mockito.verify(vi).setUpAdapterAndView(dataList);

    }
    @Test
    public void onListItemClicked() {
        ctrl.onListItemClicked(testItem);
        Mockito.verify(vi).startDetailActivity(testItem.getMessage(), testItem.getDateTime(), testItem.getColorResource());
    }

}
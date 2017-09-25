package com.illicitartwork.recyclerviewpractice.Data;

import com.illicitartwork.recyclerviewpractice.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by illic on 9/20/2017.
 */

public class DataSource implements DataSourceInterface{

    public DataSource() {
    }

    private final String[] messages = {
        "When your only tool is a hammer, all problems start looking like nails.",
        "Letting the cat out of the bag is a whole lot easier than putting it back in.",
        "Time does'nt exist. Clocks exists.",
        "If nothing was learned, nothing was taught."
    };

    private final String[] dates = {
            "December 7, 1941",
            "September 11, 2001",
            "August 13, 1980",
            "July 4, 1776",
    };

    private final int[] colors = {
            R.color.red,
            R.color.blue,
            R.color.yellow,
            R.color.green
    };

    @Override
    public List<ItemDetail> getDataList() {
        ArrayList<ItemDetail> dataList = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 12; i++) {
            int randOne = rand.nextInt(4);
            int randTwo = rand.nextInt(4);
            int randThree = rand.nextInt(4);

            ItemDetail id = new ItemDetail(
                    dates[randOne], messages[randTwo], colors[randThree]
            );

            dataList.add(id);
        }
        return dataList;
    }
}

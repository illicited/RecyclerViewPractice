package com.illicitartwork.recyclerviewpractice.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.illicitartwork.recyclerviewpractice.Data.DataSource;
import com.illicitartwork.recyclerviewpractice.Data.ItemDetail;
import com.illicitartwork.recyclerviewpractice.Logic.Controller;
import com.illicitartwork.recyclerviewpractice.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewInterface{
    private static final String EXTRA_DATE_TIME = "EXTRA_DATE_TIME";
    private static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    private static final String EXTRA_COLOR = "EXTRA_COLOR";

    private List<ItemDetail> dataList;
    private LayoutInflater layoutInflator;
    private RecyclerView rv;
    private CustomAdapter adapter;
    private Controller ctrl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView)findViewById(R.id.recycleActivityMain);
        layoutInflator = getLayoutInflater();
        ctrl = new Controller(this, new DataSource());
    }

    @Override
    public void startDetailActivity(String dateTime, String message, int colorResource) {
        
    }

    @Override
    public void setUpAdapterAndView(List<ItemDetail> id) {

    }

    private class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
        @Override
        public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(CustomViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            public CustomViewHolder(View itemView) {
                super(itemView);
            }

            @Override
            public void onClick(View v) {

            }
        }
    }
}

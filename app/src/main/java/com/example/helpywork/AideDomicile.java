package com.example.helpywork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AideDomicile extends AppCompatActivity {

    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid"
    };

    LinearLayout layoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aide_domicile);

        Spinner spinnerNiveau = (Spinner) findViewById(R.id.spinnerNiveau);
        layoutList = (LinearLayout) findViewById(R.id.layoutList);

        layoutList.setVisibility(View.INVISIBLE);

        /* ----------------------------------------------------------------------- */

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.niveau_array, R.layout.spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNiveau.setAdapter(adapter);

        /* ----------------------------------------------------------------------- */

        ListView mListView = (ListView) findViewById(R.id.listView);
/*
        final ArrayAdapter<String> adaptername = new ArrayAdapter<String>(AideDomicile.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adaptername);*/


        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<10;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("flag", Integer.toString(R.drawable.anonyme) );
            hm.put("cur","Currency : " + prenoms[i]);
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "flag","cur" };

        // Ids of views in listview_layout
        int[] to = { R.id.flag,R.id.cur};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.activity_aide_domicile, from, to);

        // Setting the adapter to the listView
        mListView.setAdapter(adapter);

    }

    public void onClick(View v){

        layoutList.setVisibility(View.VISIBLE);
    }


}

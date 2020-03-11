package com.example.helpywork;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class ProposerDomicile extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListAdapter adaptateur = new ListAdapter(this);




        setListAdapter(adaptateur);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String[] values = new String[]{
                "Antoine      5km", "Benoit        7km", "Cyril           11km", "David         15km", "Eloise        17km", "Florent      24km",
                "Gerard       30km", "Hugo         33km", "Ingrid         40km", "Jonathan  51km"
        };
        Intent intent = new Intent(ProposerDomicile.this, FichePerso.class);
        intent.putExtra("name", values[position]);
        startActivity(intent);
    }
}
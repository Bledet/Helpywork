package com.example.helpywork;

import android.app.ListActivity;
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
        Toast.makeText(this, "Position : " + position, Toast.LENGTH_LONG).show();
    }
}
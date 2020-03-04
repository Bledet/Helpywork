package com.example.helpywork;

import android.app.ListActivity;
import android.os.Bundle;

public class ProposerDomicile extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[]{
                "Antoine      5km", "Benoit        7km", "Cyril           11km", "David         15km", "Eloise        17km", "Florent      24km",
                "Gerard       30km", "Hugo         33km", "Ingrid         40km", "Jonathan  51km"
        };

        ListAdapter adaptateur = new ListAdapter(this, values);
        setListAdapter(adaptateur);
    }
}
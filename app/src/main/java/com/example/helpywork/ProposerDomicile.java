package com.example.helpywork;

import android.app.ListActivity;
import android.os.Bundle;

public class ProposerDomicile extends ListActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] values = new String[]{
                "Antoine   15km", "Benoit    11km", "Cyril       20km", "David     23km", "Eloise    17km", "Florent   7km",
                "Gerard   5km", "Hugo     24km", "Ingrid   12km", "Jonathan  13km"
        };

        ListAdapter adaptateur = new ListAdapter(this, values);
        setListAdapter(adaptateur);
    }
}
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

        Integer[] tab_images_pour_la_liste = {
                R.drawable.img1, R.drawable.img2,
                R.drawable.img3, R.drawable.img4,
                R.drawable.img5, R.drawable.img6, R.drawable.img7,
                R.drawable.img8, R.drawable.img9, R.drawable.img10};

        Intent intent = new Intent(ProposerDomicile.this, FichePerso.class);
        intent.putExtra("name", values[position]);
        intent.putExtra("img", tab_images_pour_la_liste[position].toString());
        startActivity(intent);
    }
}
package com.example.helpywork;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapter extends BaseAdapter {

    @Override
    public long getItemId(int position) {
        Log.v("ltm","getItemId("+position+")=");
        return 10;
    }


    @Override
    public Object getItem(int position) {
        Log.v("ltm","getItem("+position+")");
        return position;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 12;
    }

    private Integer[] tab_images_pour_la_liste = {
            R.drawable.img1, R.drawable.img2,
            R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7,
            R.drawable.img8, R.drawable.img9, R.drawable.img10};

    String[] values = new String[]{
            "Antoine      5km", "Benoit        7km", "Cyril           11km", "David         15km", "Eloise        17km", "Florent      24km",
            "Gerard       30km", "Hugo         33km", "Ingrid         40km", "Jonathan  51km"
    };

    Context _context;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) _context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);

        //if( convertView == null ) {
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        textView.setText(values[position]);

        imageView.setImageResource(tab_images_pour_la_liste[position]);
        /*}else {
            rowView = (View)convertView;
        }*/

        Log.v("ltm", "Position = " + position);

        return rowView;
    }

    public ListAdapter(Context context) {
        super();
        _context = context;
    }
}
package com.agustinbergomi.list_view11;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    String[] presidents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView lstView = getListView();
        lstView.setChoiceMode(2);
        lstView.setTextFilterEnabled(true);

        presidents = getResources().getStringArray(R.array.presidents_array);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, presidents));
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);

        if (position == 0) {
            Intent intent = new Intent(MainActivity.this, VistaLugar.class);
            startActivity(intent);
        }

        }
    }





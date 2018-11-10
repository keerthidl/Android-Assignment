package com.example.user.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


class ViewActivity extends AppCompatActivity {


    ListView cityListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        cityListView = (ListView) findViewById(R.id.lists);


        final String[] Clinic = {
                "Doctors",
                "Nurses",
                "Patients",
                "CareTakers",
        };
        ListAdapter cityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Clinic);
        ListView cityListView = (ListView) findViewById(R.id.lists);
        cityListView.setAdapter(cityAdapter);

        cityListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String cities = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(ViewActivity.this, cities, Toast.LENGTH_LONG).show();

                        if (position == 0) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(),Doctors.class);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 1) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Nurses.class);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 2) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), Patients.class);
                            startActivityForResult(myIntent, 0);
                        }
                        if (position == 3) {
                            //code specific to first list item
                            Intent myIntent = new Intent(view.getContext(), CareTakers.class);
                            startActivityForResult(myIntent, 0);
                        }
                    }


                });


    }}

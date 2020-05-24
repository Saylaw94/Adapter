package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.list);

        String[] provinces = {"Andijan", "Buxara", "Fergana", "Jizzax", "Xorezm", "Namangan", "Navoiy", "Qahqadarya", "Qaraqalpaqstan Respublikasi", "Samarqand", "Sirdarya", "Surxandarya", "Tashkent"};

        ArrayAdapter<String> provinceAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, provinces);

        list.setAdapter(provinceAdapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        String province = parent.getItemAtPosition(position).toString();


        Intent intent = new Intent(MainActivity.this, Cities.class);

        intent.putExtra("cities", parent.getItemAtPosition(position).toString());
        startActivity(intent);
    }
}

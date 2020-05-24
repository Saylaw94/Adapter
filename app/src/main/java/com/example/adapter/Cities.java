package com.example.adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Cities extends AppCompatActivity {
    ListView lis_city;
    String[][] cities ={
            {"Asaka", "Bo`ston", "Izboskan", "Jalaquduq", "Marhamat", "Paxtaobod", "Ulug`nor"},
            {"G`ijdivon", "Jondor", "Kogon", "Olot", "Peshku", "Qorako`l", "Vobkent"},
            {"Bag`dod", "Beshariq", "Buvauda", "Dang`ara", "Oltiariq", "Rishton", "Toshloq"},
            {"Arnasoy", "Baxmal", "Do`stlik", "Forish", "Mirzacho`l", "Zomin"},
            {"Bog`ot", "Gurlan", "Xonqa", "Xiva", "Shovot", "Urganch"},
            {"Chortoq", "Chust", "Kosonsoy", "Norin", "Uchqo`rg`on", "Uychi"},
            {"Karmana", "Qiziltepa", "Xatirchi", "Navbahor", "Nurota", "Uchquduq"},
            {"Dehqonobod", "Kasbi", "Kitob", "Koson", "Nishon", "Chiroqchi", "Yakkabog`"},
            {"Amudarya", "Beruniy", "Shimbay", "Kegeyli", "Moynaq", "Qanliko`l", "Qon`irat", "Qarao`zek", "Shomanay", "To`rtku`l", "Xojeli"},
            {"Bulung`ur", "Ishtixon", "Jomboy", "Narpay", "Nurobod", "Paxtachi", "Payariq", "Toyloq"},
            {"Sardoba", "Boyovut", "Guliston", "Xovos", "Mirzaobod", "Oqoltin"},
            {"Angor", "Boysun", "Denov", "Qiziriq", "Sherobod", "Termiz", "Uzun"},
            {"Bektemir", "Chilonzor", "Mirzo Ulug`bek", "Sergeli", "Olmazor", "Yakkasaroy", "Yunusobod"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        lis_city = findViewById(R.id.list_city);

        Bundle bundle = getIntent().getExtras();

        switch (bundle.getString("cities")){
            case "Andijan":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[0]);
                lis_city.setAdapter(city);
                break;
            }
            case "Buxara":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[1]);
                lis_city.setAdapter(city);
                break;
            }
            case "Fergana":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[2]);
                lis_city.setAdapter(city);
                break;
            }
            case "Jizzax":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[3]);
                lis_city.setAdapter(city);
                break;
            }
            case "Xorezm":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[4]);
                lis_city.setAdapter(city);
                break;
            }
            case "Namangan":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[5]);
                lis_city.setAdapter(city);
                break;
            }
            case "Navoiy":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[6]);
                lis_city.setAdapter(city);
                break;
            }
            case "Qahqadarya":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[7]);
                lis_city.setAdapter(city);
                break;
            }
            case "Qaraqalpaqstan Respublikasi":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[8]);
                lis_city.setAdapter(city);
                break;
            }
            case "Samarqand":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[9]);
                lis_city.setAdapter(city);
                break;
            }
            case "Sirdarya":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[10]);
                lis_city.setAdapter(city);
                break;
            }
            case "Surxandarya":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[11]);
                lis_city.setAdapter(city);
                break;
            }
            case "Tashkent":{
                ArrayAdapter<String> city = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, cities[12]);
                lis_city.setAdapter(city);
                break;
            }
        }
    }
}
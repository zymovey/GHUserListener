package com.example.evgen.ghuserlistener;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<User> users = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();
        RecyclerView recyclerView = findViewById(R.id.listViews);

        DataAdapter dataAdapter = new DataAdapter(this, users);
        recyclerView.setAdapter(dataAdapter);

    }
    private void setData(){

        users.add(new User ("Bale", "Cristian Bale", R.drawable.bale));
        users.add(new User ("Elite z3", "HP", R.drawable.dicaprio));
        users.add(new User ("Galaxy S8", "Samsung", R.drawable.gosling));
        users.add(new User ("LG G 5", "LG", R.drawable.house));
        users.add(new User ("Bale", "Cristian Bale", R.drawable.bale));
        users.add(new User ("Elite z3", "HP", R.drawable.dicaprio));
        users.add(new User ("Galaxy S8", "Samsung", R.drawable.gosling));
        users.add(new User ("LG G 5", "LG", R.drawable.house));
        users.add(new User ("Bale", "Cristian Bale", R.drawable.bale));
        users.add(new User ("Elite z3", "HP", R.drawable.dicaprio));
        users.add(new User ("Galaxy S8", "Samsung", R.drawable.gosling));
        users.add(new User ("LG G 5", "LG", R.drawable.house));
        users.add(new User ("Bale", "Cristian Bale", R.drawable.bale));
        users.add(new User ("Elite z3", "HP", R.drawable.dicaprio));
        users.add(new User ("Galaxy S8", "Samsung", R.drawable.gosling));
        users.add(new User ("LG G 5", "LG", R.drawable.house));
    }
}

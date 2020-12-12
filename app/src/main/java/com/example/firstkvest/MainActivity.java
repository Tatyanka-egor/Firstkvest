package com.example.firstkvest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<User> users = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smile);
        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        // создаем адаптер
        DataAdapter adapter = new DataAdapter(this, users);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);

    }

    private void setInitialData() {
        users.add(new User ("человек",  R.drawable.ic_launcher_background));
        users.add(new User ("человек",  R.drawable.ic_launcher_background));
        users.add(new User ("человек",  R.drawable.ic_launcher_background));
        users.add(new User ("человек",  R.drawable.ic_launcher_background));
        users.add(new User ("человек",  R.drawable.ic_launcher_background));

    }
}
package com.richardo.uts_mobileprogramming_recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterRecycleView adapterRecycleView;
    RecyclerView.LayoutManager layoutManager;
    Vector<ItemModel> data = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        for(int i=0;i<MovieItem.MovieTitle.length;i++)
        {
            data.add(new ItemModel(MovieItem.MovieTitle[i],MovieItem.MovieYear[i],MovieItem.MoviePoster[i] ));
        }
        adapterRecycleView = new AdapterRecycleView(data);
        recyclerView.setAdapter(adapterRecycleView);

    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if(menu instanceof MenuBuilder)
        {
            ((MenuBuilder)menu).setOptionalIconsVisible(true);
        }
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_appbar,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    public void GoToAboutUsPage(MenuItem menuItem)
    {
        startActivity(new Intent(this,AboutUsActivity.class));
    }

}
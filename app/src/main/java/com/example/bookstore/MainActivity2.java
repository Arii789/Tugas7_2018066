package com.example.bookstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
public class MainActivity2 extends AppCompatActivity {
    private DrawerLayout dl;
    private ActionBarDrawerToggle abcd;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        dl = (DrawerLayout)findViewById(R.id.dl);
        abcd = new
                ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);
        abcd.setDrawerIndicatorEnabled(true);
        dl.addDrawerListener(abcd);
        abcd.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_novel){
                    Intent a = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(a);
                }else if (id == R.id.nav_anak){
                    Intent a = new Intent(MainActivity2.this, MainActivity2.class);
                    startActivity(a);
                }else if (id == R.id.nav_notif){
                    Intent a = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(a);
                }
                return true;
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return abcd.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}
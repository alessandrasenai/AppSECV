package br.com.rafaelleme.senai.appsecv;

import android.app.Activity;
import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import static android.support.v7.app.AlertDialog.*;
import static br.com.rafaelleme.senai.appsecv.R.id.itemUm;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        return false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpToolbar();
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Estatísticas");

        navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = findViewById(R.id.drawer_layout);
    }


    private void setUpToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
        private AlertDialog alerta;

    private void setNavigationView() {

    }

    {

        Builder builder = new Builder(this);
        builder.setTitle("titulo");
        builder.setMessage("digite");
        Builder  = new builder ("ic_helpoutline", new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                switch (MenuItem.OnMenuItemClickListener) {

                    case itemUm:
                        Toast.makeText(activity_main.this, "Clicou no item 1", Toast.LENGTH_SHORT).

                                show();
                        break;

                    case R.id.itemDois:

                        break;

                    case R.id.itemTres:

                        break;

                    case R.id.itemQuatro:
                        break;

                }


            }


        }
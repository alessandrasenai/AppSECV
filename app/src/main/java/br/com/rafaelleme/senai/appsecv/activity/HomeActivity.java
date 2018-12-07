package br.com.rafaelleme.senai.appsecv.activity;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;

import br.com.rafaelleme.senai.appsecv.BlankFragment;
import br.com.rafaelleme.senai.appsecv.R;


public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    AlertDialog alertDialog;
    FragmentManager fragmentManager;
    ActionBar actionBar;


    public void mostrarAjuda() {
        LayoutInflater li = getLayoutInflater();

        View view = li.inflate(R.layout.ajuda_dialog, null);
        view.findViewById(R.id.btFechar).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Para ajuda entre em contato:");
        builder.setView(view);
        alertDialog = builder.create();
        alertDialog.show();

    }




    public void mostrarEstatistica(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void mostrarEmpresas(){
        fragmentManager.beginTransaction().replace(R.id.fragment,new BlankFragment()).commit();
        actionBar.setTitle("Empresas");
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.estatistica:
                mostrarEstatistica();
                break;

            case R.id.gerenciar:
                mostrarEmpresas();
                break;

            case R.id.itemAjuda:
                mostrarAjuda();
                break;

            case R.id.itemSair:
                finish();

                break;

        }

        drawerLayout.closeDrawer(Gravity.LEFT);

        return false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpToolbar();
         actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Estatísticas");

        navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);

        drawerLayout = findViewById(R.id.drawer_layout);
        fragmentManager = getFragmentManager();
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


}



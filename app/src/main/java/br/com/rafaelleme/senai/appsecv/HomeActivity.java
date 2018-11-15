package br.com.rafaelleme.senai.appsecv;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import static br.com.rafaelleme.senai.appsecv.R.id.itemUm;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return false;
    }



    protected class void AlertDialog; alerta


    private void setNavigationView() {
        //Cria o gerador do AlertDialog
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //define o titulo
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
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

   

    @Override
        public boolean onNavigationItemSelected;(@NonNull MenuItem MenuItem());{
            switch (MenuItem;OnMenuItemClickListener);{
                case itemUm:
                    Toast.makeText(this, "Clicou no item 1", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.itemDois:

                    break;

                case R.id.itemTres:

                    break;

                case R.id.itemQuatro:

                    break;


            }
            return false;
        }

        private void OnNavigationItemSelectedDrawerLayout; {
            Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem; menu);
        {
            if (MenuItem. item;
            (menu) == android.R.id.home);{
                drawerLayout.openDrawer(GravityCompat.START);
            }
            return super.onOptionsItemSelected(menu);
        }

        //*private void exemplo_simples () {
       //*     //Cria o gerador do AlertDialog
       //*     AlertDialog.Builder builder = new AlertDialog.Builder(this);
            
       //*     builder.settitle("Ajuda");
            //define a mensagem
         //*   builder.setMessage("Qualifique este software");
            //define um botão como positivo
          //*  builder.setPositiveButton("Positivo", new DialogInterface.OnClickListener() {
            //*    public void onClick(DialogInterface arg0, int arg1) {
              //*      Toast.makeText(HomeActivity.this, "positivo=" + arg1, Toast.LENGTH_SHORT).show();
              //*  }
          //*  });
          //*  //define um botão como negativo.
         //*   builder.setNegativeButton("Negativo", new DialogInterface.OnClickListener() {
          //*      public void onClick(DialogInterface arg0, int arg1) {
              //*      Toast.makeText(Activity_main.this, "negativo=" + arg1, Toast.LENGTH_SHORT).show();
              //*  }
          //*  });
          //*  //cria o AlertDialog
           //* ajuda = builder.create();
            //Exibe
          //**  alerta.show();
        }












package br.com.rafaelleme.senai.appsecv;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TaskStackBuilder;
import android.content.ClipData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private ActionBar mode;
    private MenuItem menu;

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.itemUm:
                itemUm();
                return true;
            case R.id.itemDois:
                itemDois(item);
                return true;
            case R.id.itemTres:
                itemTres();
                return true;
            case R.id.itemQuatro:
                itemQuatro();
                return true;
            default:
                return super.onContextItemSelected(item);

        }
        public void showPopup;(View)(view);
        {
            PopupMenu MenuPopup;
            MenuInflater inflater = showPopup.getMenuInflater();
            inflater.inflate(R.menu.actions, showPopup.getMenu());
            new PopupMenu.OnMenuItemClickListener();
        }

        @Override boolean onCreateActionMode;
        {
            this.mode = mode;
            this.menu = menu;

            View inflater = new mode.getCustomView(item);
            inflater.inflate(R.menu.context, menu);
            return true;
        }

        @Override
        public void onCreateBundle;
            {
            super.onCreate(onNavigationItemSelected(View));
            setContentView(R.layout.activity_main);


        }

        public void abrirHome;
        View view = (View)(MainActivity);
        {

            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }


    }


}
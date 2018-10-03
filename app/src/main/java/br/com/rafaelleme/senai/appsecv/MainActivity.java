package br.com.rafaelleme.senai.appsecv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pagina2 (View view){

        Intent intent = new Intent(this, SegundaActivity.class);
        startActivity(intent);
    }
}






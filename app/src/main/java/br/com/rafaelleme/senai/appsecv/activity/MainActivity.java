package br.com.rafaelleme.senai.appsecv.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.rafaelleme.senai.appsecv.Client.UsuarioClient;
import br.com.rafaelleme.senai.appsecv.R;
import br.com.rafaelleme.senai.appsecv.application.RetrofitConfig;
import br.com.rafaelleme.senai.appsecv.entity.UsuarioADM;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private EditText edtNif, edtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNif = findViewById(R.id.edtNif);
        edtSenha = findViewById(R.id.edtSenha);

    }

    public void abrirHome(View view) {

        String nif = edtNif.getText().toString();
        final String senha = edtSenha.getText().toString();

        if (!nif.isEmpty() && !senha.isEmpty()) {

            UsuarioClient usuarioClient = new RetrofitConfig().getRetrofit().create(UsuarioClient.class);
            Call<UsuarioADM> call = usuarioClient.buscarUsuario(nif);
            call.enqueue(new Callback<UsuarioADM>() {
                @Override
                public void onResponse(Call<UsuarioADM> call, Response<UsuarioADM> response) {
                    if (response.isSuccessful()) {
                        UsuarioADM usuarioADM = response.body();

                        if (usuarioADM != null) {

                            if (usuarioADM.getSenha().equals(senha)) {
                                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(MainActivity.this, "Usuário/Senha incorretos!", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "Usuário/Senha incorretos!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call<UsuarioADM> call, Throwable t) {

                }
            });
        } else {
            edtNif.setError("Campo Vazio");
            edtSenha.setError("Campo Vazio");
        }
    }

}



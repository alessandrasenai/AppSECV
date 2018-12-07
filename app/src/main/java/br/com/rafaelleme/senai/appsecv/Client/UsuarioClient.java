package br.com.rafaelleme.senai.appsecv.Client;



import br.com.rafaelleme.senai.appsecv.entity.UsuarioADM;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UsuarioClient {

    @GET("usuario/{nif}")
    Call<UsuarioADM> buscarUsuario(@Path("nif") String nif);
}

package Client;


import entity.UsuarioADM;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface UsuarioClient {

    @GET("usuario/{email}")
    Call<UsuarioADM> buscarUsuario(@Path("email") Integer email);
}

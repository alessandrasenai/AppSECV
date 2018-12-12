package br.com.rafaelleme.senai.appsecv.application;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    public RetrofitConfig() {}

        public Retrofit getRetrofit(){
        return new Retrofit.Builder().baseUrl("http://10.87.210.5:81/api-secva/ws/")
                .addConverterFactory(JacksonConverterFactory.create()).build();

        }
}

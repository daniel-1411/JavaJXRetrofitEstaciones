/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafxretrofit;

import javafx.concurrent.Task;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;
import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;
 
/**
 *
 * @author FP Mañana A
 */
class MiTarea {

    public static void llamadaJSON() throws Exception {
       //Definimos la URL base del API REST que utilizamos
        String baseUrl = "http://datos.comunidad.madrid//";

        //Instancia a GSON
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        
        //Instancia a retrofit agregando la baseURL y el convertidor GSON
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        
        //Se crea el servicio
        OperacionInterface service = retrofit.create(OperacionInterface.class);

        //Se realiza la llamada
        Call<Estacion> call = service.estaciones();

        //la llamada es asincronica
        //Retrofit descarga y analiza los datos del API en un subproceso en
        //paralelo y entrega los resultados a traves de los metodos
        // onFailure o onResponse
          
        call.enqueue(new Callback<Estacion>() {

            @Override
            public void onFailure(Call<Estacion> call, Throwable t) {
               System.out.println("Network Error :: " + t.getLocalizedMessage());
            }

          
            @Override
            public void onResponse(Call<Estacion> call, Response<Estacion> response) {

                   Estacion  articulo = response.body();
                   MiVentana.pintarTabla(articulo);
            }
        });
        
        
    }
    
}

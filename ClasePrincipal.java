/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafxretrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;


/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal extends Application{
    static TableView tv;
    static VBox vbox=null;
   public static void main(String[] args) {
       launch(args);
       
/*
        */
        System.out.println("Terminado");
    }

   
    

    

    

    

    @Override
    public void start(Stage stage) throws Exception {
       
        VBox v=new VBox(30);
        vbox=v;
         Label lblinicio=new Label("ESTO ES INICIO");
        Label lbl=new Label("");
        
       
        
        MiTarea.llamadaJSON();
       //no se que estoy hadciendo para crear la tabla   
       
               
              
         v.getChildren().addAll(lblinicio,lbl);
        Scene escena=new Scene(v,500,400);
        stage.setScene(escena);
        stage.show();
    }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafxretrofit;

import static com.mycompany.javafxretrofit.ClasePrincipal.tv;
import static com.mycompany.javafxretrofit.ClasePrincipal.vbox;
import java.util.List;
import javafx.application.Platform;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author FP Mañana A
 */
public class MiVentana {
    static void pintarTabla(Estacion articulo) {
        
          tv=new TableView();
           TableColumn<String,Data> columna1 = new TableColumn<>("AnalizaNO2");
      columna1.setCellValueFactory(new PropertyValueFactory<>("estacionAnalizadorNO2"));
      TableColumn<String, Data> columna2 = new TableColumn<>("AnalizaSo2");
      columna2.setCellValueFactory(new PropertyValueFactory<>("estacion_analizador_SO2"));
      TableColumn<String, Data> columna3 = new TableColumn<>("Estacion municipio");
      columna3.setCellValueFactory(new PropertyValueFactory<>("estacionMunicipio"));
      TableColumn<String, Data> columna4 = new TableColumn<>("Direccion Postal");
      columna4.setCellValueFactory(new PropertyValueFactory<>("estacionDireccionPostal"));
      tv.getColumns().add(columna1);
      tv.getColumns().add(columna2);
      tv.getColumns().add(columna3);
      tv.getColumns().add(columna4);
      List<Data> articulos=articulo.getData();
        for (Data p : articulos) {
            tv.getItems().add(p);
        }
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                // Update UI here.
                vbox.getChildren().add(tv);
            }
        });
        
    }
}

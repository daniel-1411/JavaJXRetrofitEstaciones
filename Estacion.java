/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javafxretrofit;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 *
 * @author FP Mañana A
 */
public class Estacion {
    
@SerializedName("data")
@Expose

private List<Data> data = null;

public List<Data> getData() {
return data;
}

public void setData(List<Data> data) {
this.data = data;
}

    @Override
    public String toString() {
        return "Estacion{" + "data=" + data + '}';
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sanms.siso.eft.processor;

import java.util.Map;

/**
 *
 * @author salvador
 */
public class ProcessorTransaction {
    
public String ConstruirTrama(String nombreTxn, int pid){
    
    Map<String, String> params = null;
    
    try {
        params = ParametersTransaction.obtenerParametros(nombreTxn,pid);
    } catch (Exception e) {
    }
    
    return "";
}
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extra_2;

import com.mycompany.extra_2.Atributos.Puntos;
import com.mycompany.extra_2.Servicios.Servicio;

/**
 *
 * @author crowl
 */
public class Extra_2 {

    public static void main(String[] args) {
        Servicio serv=new Servicio();
        Puntos punt=serv.definirPuntos();
        serv.Distancia(punt);
    }
}

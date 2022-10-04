/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extra_2.Servicios;

import com.mycompany.extra_2.Atributos.Puntos;
import java.util.*;

/**
 *
 * @author crowl
 */
public class Servicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
   public Puntos definirPuntos(){
       Puntos punt=new Puntos();
       System.out.println("Ingrese un valor x para el primer punto");
       punt.setX1(leer.nextInt());
       System.out.println("Ingrese un valor y para el primer punto");
       punt.setY1(leer.nextInt());
        System.out.println("Ingrese un valor x para el segundo punto");
       punt.setX2(leer.nextInt());
       System.out.println("Ingrese un valor y para el segundo punto");
       punt.setY2(leer.nextInt());
       return punt;
   }
   public void Distancia(Puntos punt){
       double sumacuadra=Math.pow((punt.getX2()-punt.getX1()),2)+Math.pow((punt.getY2()-punt.getY1()),2);
       double distancia=Math.sqrt(sumacuadra);
       System.out.println("La diostancia entre los dos puntos es de: "+distancia);
               
   }
            
            
}

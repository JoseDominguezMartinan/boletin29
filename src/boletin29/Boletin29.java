/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin29
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        ArrayList <Barcos> barcos=new ArrayList();
        Veleros velero=new Veleros(2,2,"123A",5);
        Deportivos deportivo=new Deportivos(500,1,"222A",10);
        Yates yate=new Yates(2,400,2,"333B",12);
        barcos.add(velero);
        barcos.add(deportivo);
        barcos.add(yate);
       
        Barcos.factura(velero);
        Barcos.factura(yate);
    }
    
}

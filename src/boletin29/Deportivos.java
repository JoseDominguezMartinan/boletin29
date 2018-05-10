/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

/**
 *
 * @author jdominguezmartinan
 */
public class Deportivos extends Barcos
{
    int potencia;

    public Deportivos()
    {
    }

    public Deportivos(int potencia,int diasOcupacion,String matricula,int eslora)
    {
        super(diasOcupacion,matricula,eslora);
        this.potencia = potencia;
    }

    public int getPotencia()
    {
        return potencia;
    }

    public void setPotencia(int potencia)
    {
        this.potencia = potencia;
    }
    @Override
    public void calcularModulo(){
    super.setModulo((10*super.getEslora())+(potencia*3));
}
    
    
}

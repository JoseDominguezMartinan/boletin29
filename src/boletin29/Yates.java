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
public class Yates extends Barcos
{
    int numCamarotes;
    int potencia;

    public Yates()
    {
    }

    public Yates(int numCamarotes,int potencia,int diasOcupacion,String matricula,int eslora)
    {
        super(diasOcupacion,matricula,eslora);
        this.numCamarotes = numCamarotes;
        this.potencia = potencia;
    }

    public int getNumCamarotes()
    {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes)
    {
        this.numCamarotes = numCamarotes;
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
    public String toString()
    {
        return "Yates{"+"numCamarotes="+numCamarotes+", potencia="+potencia+'}';
    }
    
    @Override
    public void calcularModulo()
    {
        super.setModulo((super.getEslora()*10)+(potencia*3)+(numCamarotes*4));
    }
}

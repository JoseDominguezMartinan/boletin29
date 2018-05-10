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
public class Veleros extends Barcos
{
    int numeroMastiles;

    public Veleros()
    {
        
    }

    public Veleros(int numeroMastiles,int diasOcupacion,String matricula,int eslora)
    {
        super(diasOcupacion,matricula,eslora);
        this.numeroMastiles = numeroMastiles;
    }

    public int getNumeroMastiles()
    {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles)
    {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString()
    {
        return "Veleros{"+"numeroMastiles="+numeroMastiles+'}';
    }
    
    @Override
    public void calcularModulo(){
    super.setModulo((10*super.getEslora())+(numeroMastiles*2));
}
 
}

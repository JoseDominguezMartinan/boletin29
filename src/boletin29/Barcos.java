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
public abstract class Barcos
{
    private int diasOcupacion;
    private String matricula;
    private int eslora;
    private int modulo;

    public Barcos()
    {
    }

    public Barcos(int diasOcupacion,String matricula,int eslora)
    {
        this.diasOcupacion = diasOcupacion;
        this.matricula = matricula;
        this.eslora = eslora;
       
    }

    public int getDiasOcupacion()
    {
        return diasOcupacion;
    }

    public void setDiasOcupacion(int diasOcupacion)
    {
        this.diasOcupacion = diasOcupacion;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public int getEslora()
    {
        return eslora;
    }

    public void setEslora(int eslora)
    {
        this.eslora = eslora;
    }

    public int getModulo()
    {
        return modulo;
    }

    public void setModulo(int modulo)
    {
        this.modulo = modulo;
    }
    
    
    public abstract void calcularModulo();
        
    
    public int calcularPrezo(){
        int prezo=diasOcupacion*modulo;
        return prezo;
    }
    public static void factura(Barcos b){
        b.calcularModulo();
        int prezo=b.calcularPrezo();
        System.out.println("Matricula "+b.getMatricula()+" eslora "+b.getEslora()+" precio "+prezo);
    }
}

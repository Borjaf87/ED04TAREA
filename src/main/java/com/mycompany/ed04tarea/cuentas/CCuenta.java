package com.mycompany.ed04tarea.cuentas;
/**
 * Clase de representación de la cuenta bancaria
 * @author Borja
 */

public class CCuenta {

/**
 * Nombre del titular de la cuenta bacnaria, saldo y tipo de interés mostrado
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * saldo disponible
     * @return 
     */
    public double estado()
    {
        return saldo;
    }
    /**
     * ingresa dinero a la cuenta.
     * @param cantidad
     * @throws Exception 
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
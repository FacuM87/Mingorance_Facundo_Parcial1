
package model;

import java.time.LocalDate;


public class Gastronomia extends Servicio{
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public Gastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc) {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = this.precio;
        
        if (this.enPromocion && dia.getDayOfWeek().getValue() == this.diaSemDesc) { 
            precioFinal = precioFinal * (1 - this.porcentajeDescuento / 100);
        }
        
        return precioFinal;        

    }

    @Override
    public String toString() {
        return "Gastronomia{" + "gastronomia=" + gastronomia + ", precio=" + precio + ", diaSemDesc=" + diaSemDesc + '}';
    }
    
    
}


package model;

import java.time.LocalDate;


public abstract class Servicio {
    protected String codServicio;
    protected double porcentajeDescuento;
    protected boolean enPromocion;
    protected LocalDate dia;

    public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion, LocalDate dia) {
        if(codServicio.length() == 6){
            this.codServicio = codServicio;
        } else {
            throw new IllegalArgumentException("codServicio debe tener 6 caracteres");
        }
        
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
        this.dia = dia;
    }
    
    public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) {
        if(codServicio.length() == 6){
            this.codServicio = codServicio;
        } else {
            throw new IllegalArgumentException("codServicio debe tener 6 caracteres");
        }
        
        this.porcentajeDescuento = porcentajeDescuento;
        this.enPromocion = enPromocion;
        this.dia = null; 
    }
    
    public abstract double calcularPrecioFinal(LocalDate dia);

    public String getCodServicio() {
        return codServicio;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    @Override
    public String toString() {
        return "Servicio{" + "codServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
    }
    
    
        
}

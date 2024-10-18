package model;

import java.time.LocalDate;

public class Hospedaje extends Servicio {

    private String hospedaje;
    double precioPorNoche;

    public Hospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche) {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }

    public Hospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche, LocalDate dia) {
        super(codServicio, porcentajeDescuento, enPromocion, dia);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
        this.dia = dia;
    }

    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = this.precioPorNoche;
        
        if (this.enPromocion && dia.getDayOfWeek().getValue() <= 5) { 
            precioFinal = precioFinal * (1 - this.porcentajeDescuento / 100);
        }
        
        return precioFinal;

    }
    
    

}

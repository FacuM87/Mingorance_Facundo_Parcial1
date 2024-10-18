package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Servicio> lstServicio;

    public Sistema() {
        this.lstServicio = new ArrayList<>();
    }

    public Servicio traerServicio(String codServicio) throws Exception {
        for (Servicio s : this.lstServicio) {
            if (s.getCodServicio().equals(codServicio)) {
                return s;
            }
        }

        throw new Exception("El codigo de servicio es inexsitente");
    }

    public List<Servicio> traerServicio(boolean enPromocion) {
        List<Servicio> lstRetorno = new ArrayList<>();

        for (Servicio s : this.lstServicio) {
            if (s.isEnPromocion() == enPromocion) {
                lstRetorno.add(s);
            }
        }

        return lstRetorno;
    }

    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia) {
       List<Servicio> lstRetorno = new ArrayList<>();
       
       for (Servicio s : this.lstServicio){
           
       }
       
       return lstRetorno;
    }

    private void validarCodigoServicioUnico(String codServicio) throws Exception {
        for (Servicio s : this.lstServicio) {
            if (s.getCodServicio().equals(codServicio)) {
                throw new IllegalArgumentException("El código de servicio ya se encuentra utilizado");
            }
        }
    }

    public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc, LocalDate dia) throws Exception {
        validarCodigoServicioUnico(codServicio);

        Servicio s1 = new Gastronomia(codServicio, porcentajeDescuento, enPromocion, gastronomia, precio, diaSemDesc, dia);
        this.lstServicio.add(s1);
        return true;
    }

    public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc) throws Exception {
        validarCodigoServicioUnico(codServicio);

        Servicio s1 = new Gastronomia(codServicio, porcentajeDescuento, enPromocion, gastronomia, precio, diaSemDesc);
        this.lstServicio.add(s1);
        return true;
    }

    public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche, LocalDate dia) throws Exception {
        validarCodigoServicioUnico(codServicio);

        Servicio s1 = new Hospedaje(codServicio, porcentajeDescuento, enPromocion, hospedaje, precioPorNoche, dia);
        this.lstServicio.add(s1);
        return true;
    }

    public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche) throws Exception {
        validarCodigoServicioUnico(codServicio);

        Servicio s1 = new Hospedaje(codServicio, porcentajeDescuento, enPromocion, hospedaje, precioPorNoche);
        this.lstServicio.add(s1);
        return true;
    }

    @Override
    public String toString() {
        return "Sistema{" + "lstServicio=" + lstServicio + '}';
    }

}

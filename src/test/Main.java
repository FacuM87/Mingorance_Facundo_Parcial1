package test;

import java.time.LocalDate;
import model.Gastronomia;
import model.Hospedaje;
import model.Sistema;

public class Main {


    public static void main(String[] args) {
        try {
            System.out.println("1-1");
            
            Gastronomia g1 = new Gastronomia("4892", 15.0, true, "Hamburguesa criolla", 180.0, 4);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("1-2");
            Gastronomia g1 = new Gastronomia("489235", 15.0, true, "Hamburguesa criolla", 180.0, 4);
            System.out.println(g1);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("1-3");
            Hospedaje h1 = new Hospedaje("2872", 10.0, true, "Cabania 3 personas", 1500.0);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("1-4");
            Hospedaje h1 = new Hospedaje("287282", 10.0, true, "Cabania 3 personas", 1500.0);
            System.out.println(h1);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("2-1");
            Gastronomia g1 = new Gastronomia("489235", 15.0, true, "Hamburguesa criolla", 180.0, 4);

            LocalDate dia = LocalDate.of(2010, 10, 28);
            System.out.println("El precio final de la gastronomia es de $" + g1.calcularPrecioFinal(dia));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("2-2");
            Hospedaje h1 = new Hospedaje("287282", 10.0, true, "Cabania 3 personas", 1500.0);

            LocalDate dia = LocalDate.of(2020, 10, 27);
            System.out.println("El precio final del hospedaje es de $" + h1.calcularPrecioFinal(dia));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("3");
            Sistema s = new Sistema();

            s.agregarGastronomia("858927", 15.0, true, "Milanesa con pure", 350.0, 3);
            s.agregarHospedaje("489259", 10.0, true, "Habitacion triple", 2200.0);
            s.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3);
            s.agregarHospedaje("758972", 15.0, false, "Habitacion simple", 1000.0);

            System.out.println(s.toString());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("4-1");
            Sistema s = new Sistema();

            s.agregarGastronomia("858927", 15.0, true, "Milanesa con pure", 350.0, 3);
            s.agregarHospedaje("489259", 10.0, true, "Habitacion triple", 2200.0);
            s.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3);
            s.agregarHospedaje("758972", 15.0, false, "Habitacion simple", 1000.0);

            System.out.println(s.traerServicio(true));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("4-2");
            Sistema s = new Sistema();

            s.agregarGastronomia("858927", 15.0, true, "Milanesa con pure", 350.0, 3);
            s.agregarHospedaje("489259", 10.0, true, "Habitacion triple", 2200.0);
            s.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3);
            s.agregarHospedaje("758972", 15.0, false, "Habitacion simple", 1000.0);
            
            LocalDate dia = LocalDate.of(2020, 10, 28);
            
            System.out.println(s.traerServicio(true, dia));


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}

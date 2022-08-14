package com.mycompany.reto7;

import java.util.ArrayList;
import java.util.List;

public class Carretera {

    private List<TramoGenerico> tramos;

    public Carretera() {
        this.tramos = new ArrayList<>();
    }
    
    public void adicionarTramo(TramoGenerico tramo){
        this.tramos.add(tramo);
    }
    
    public double calcularLongitud() {
        double suma = 0;
        for (TramoGenerico tramo : tramos) {
            suma = suma + tramo.calcularLongitud();
        }
        return suma;
    }

    public double calcularArea() {
        double suma = 0;
        for (TramoGenerico tramo : tramos) {
            suma = suma + tramo.calcularArea();
        }
        return suma;
    }

    public double calcularVolumen() {
        double suma = 0;
        for (TramoGenerico tramo : tramos) {
            suma = suma + tramo.calcularVolumen();
        }
        return suma;
    }

    public double calcularVolumenAsfaltado() {
        double suma = 0;
        for (TramoGenerico tramo : tramos) {
            if ("Asfaltado".equals(tramo.getClass().getSimpleName())) {
                suma = suma + tramo.calcularVolumen();
            }
        }
        return suma;
    }

    public double calcularVolumenSinAsfaltar() {
        double suma = 0;
        for (TramoGenerico tramo : tramos) {
            if ("SinAsfaltar".equals(tramo.getClass().getSimpleName())) {
                suma = suma + tramo.calcularVolumen();
            }
        }
        return suma;
    }

    public boolean estaConectadaTodaLaCarretera() {
        boolean resultado = true;
        TramoGenerico tramoAnterior = this.tramos.get(0);
        
        for (int i = 1; i < tramos.size() ; i++ ) {
            TramoGenerico tramo = tramos.get(i);
            if ( tramo.coordenadaXinicial != tramoAnterior.coordenadaXfinal || 
                    tramo.coordenadaYinicial != tramoAnterior.coordenadaYfinal ){
                resultado = false;
            }
            tramoAnterior = tramo;
        }
        return resultado;       
    }

}

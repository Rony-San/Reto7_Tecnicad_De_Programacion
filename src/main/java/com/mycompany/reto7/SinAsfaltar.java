package com.mycompany.reto7;

public class SinAsfaltar extends TramoGenerico {

    private final double espesor;
    private final double ancho;
    private final String tipoDeMaterial;

    public SinAsfaltar(double coordenadaXinicial, double coordenadaYinicial,
            double coordenadaXfinal, double coordenadaYfinal,double espesor, String tipoDeMaterial) {
        this.espesor = espesor;
        this.ancho = 8;
        if ("piedra".equals(tipoDeMaterial) ||"arena".equals(tipoDeMaterial) ||"balastro".equals(tipoDeMaterial) ){
            this.tipoDeMaterial = tipoDeMaterial;
        } else{
            this.tipoDeMaterial ="no Especificado o invalido";
        }
        
        setCoordenadaXinicial(coordenadaXinicial);
        setCoordenadaYinicial(coordenadaYinicial);
        setCoordenadaXfinal(coordenadaXfinal);
        setCoordenadaYfinal(coordenadaYfinal);
        
    }

    @Override
    public double calcularLongitud() {
        double x = this.coordenadaXfinal;
        double y = this.coordenadaYinicial;
        double xf = this.coordenadaXfinal;
        double yf = this.coordenadaYfinal;
        double longitud;
        longitud = Math.sqrt(Math.pow((xf - x), 2) + Math.pow((yf - y), 2));
        return longitud;

    }

    @Override
    public double calcularArea() {
        double area;
        area = calcularLongitud() * this.ancho;
        return area;
    }

    @Override
    public double calcularVolumen() {
        double volumen;
        volumen = calcularLongitud() * this.ancho * this.espesor;
        return volumen;
    }
    
    public String obtenerMaterial(){
        return this.tipoDeMaterial;
    }
    
    public double obtenerEspeso(){
        return this.espesor;
    }

}

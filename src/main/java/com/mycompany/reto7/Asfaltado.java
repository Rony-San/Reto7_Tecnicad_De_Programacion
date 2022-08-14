package com.mycompany.reto7;

public class Asfaltado extends TramoGenerico {

    private final double espesor;
    private final double ancho;
    private final String proveedor;
    private final double velocidadMaxima;

    public Asfaltado(double coordenadaXinicial, double coordenadaYinicial,
            double coordenadaXfinal, double coordenadaYfinal,
            String proveedor, double velocidadMaxima) {
        setCoordenadaXinicial(coordenadaXinicial);
        setCoordenadaYinicial(coordenadaYinicial);
        setCoordenadaXfinal(coordenadaXfinal);
        setCoordenadaYfinal(coordenadaYfinal);
        this.espesor = 0.25;
        this.proveedor = proveedor;
        this.ancho = 8;
        this.velocidadMaxima = velocidadMaxima;
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

    public String obtenerProveedor() {
        return this.proveedor;
    }

    public double obtenerVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public boolean adelantarProhibicion() {
        boolean adelantamiento = false;
        if (this.velocidadMaxima > 30) {
            adelantamiento = true;
        }
        return adelantamiento;
    }
}

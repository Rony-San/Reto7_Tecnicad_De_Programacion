
package com.mycompany.reto7;


public abstract class TramoGenerico {
    protected double coordenadaXinicial;
    protected double coordenadaYinicial;
    protected double coordenadaXfinal;
    protected double coordenadaYfinal;
    
    public abstract double calcularLongitud();
    public abstract double calcularArea();
    public abstract double calcularVolumen();

    public void setCoordenadaXinicial(double coordenadaXinicial) {
        this.coordenadaXinicial = coordenadaXinicial;
    }

    public void setCoordenadaYinicial(double coordenadaYinicial) {
        this.coordenadaYinicial = coordenadaYinicial;
    }

    public void setCoordenadaXfinal(double coordenadaXfinal) {
        this.coordenadaXfinal = coordenadaXfinal;
    }

    public void setCoordenadaYfinal(double coordenadaYfinal) {
        this.coordenadaYfinal = coordenadaYfinal;
    }

    
    
}

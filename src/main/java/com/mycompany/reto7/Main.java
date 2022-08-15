
package com.mycompany.reto7;

public class Main {

    public static void main(String[] args) {
        Tramo a = new TramoConAsfalto("Juan", 100, true, 3, 3, 5, 3);
        Tramo b = new TramoConAsfalto("Carlos", 60, false, 3, 3, 7, 8);
        Tramo c = new TramoSinAsfalto(0.30, "Lodo", 3, 3, 7, 9);
        
        Carretera n = new Carretera();
        n.getVia().add(a);
        n.getVia().add(b);
        n.getVia().add(c);
        
        System.out.println("La longitud del tramo a es: " + a.longitud());
        System.out.println("El volumen del tramo b es: " + b.volumen());
        System.out.println("El area del tramo c es: " + c.area());
        System.out.println("El area total es: " + n.areaTotal());
        System.out.println("La longitud total es: " + n.longitudTotal());
        System.out.println("El volumen total es: " + n.volumenTotal());
        System.out.println("El volumen de tramos con asfalto es: " + n.volumenTotalAsfalto());
        System.out.println("El volumen de tramos sin asfalto es: " + n.volumenTotalSinAsfalto());
        System.out.println("¿Hay tramos conectados?,  Rta/: " + n.conectados());
        
    }
}

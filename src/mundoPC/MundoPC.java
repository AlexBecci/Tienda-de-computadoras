package mundoPC;

import arg.com.tienda.mundopc.*;

public class MundoPC {

    public static void main(String[] args) {
        //Venta a la orden 1
        Monitor monitorSamsung = new Monitor("Samsung", 13);
        Raton ratonLogitech = new Raton("Usb", "Logitech");
        Teclado tecladoRedDragon = new Teclado("Usb", "RedDragon");
        Computadora computadoraWindows = new Computadora("Computadora Windows", monitorSamsung, tecladoRedDragon, ratonLogitech);
        //Otra venta a la orden 1
        Monitor monitorHP = new Monitor("HP", 16);
        Raton ratonGamer = new Raton("Usb", "RedDragon");
        Teclado tecladoIsurus = new Teclado("Usb", "Isurus");
        Computadora computadoraSentey = new Computadora("Computadora Sentey", monitorHP, tecladoIsurus, ratonGamer);
        //Otra venta a la orden 2
        Monitor monitorGenerico = new Monitor("Argentum", 12);
        Raton ratonGenerico = new Raton("Usb", "Argentum");
        Teclado tecladoGenerico = new Teclado("Usb", "Argentum");
        Computadora computadoraGenerica = new Computadora("Computadora generica", monitorGenerico, tecladoGenerico, ratonGenerico);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraWindows);
        orden1.agregarComputadora(computadoraSentey);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraGenerica);
        orden2.mostrarOrden();

    }
}

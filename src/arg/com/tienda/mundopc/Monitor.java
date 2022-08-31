package arg.com.tienda.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return this.tamanio;
    }

    public void setTamaño(double tamaño) {
        this.tamanio = tamaño;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor= " + idMonitor + ", marca= " + marca + ", tamaño=" + tamanio + '}';
    }

}

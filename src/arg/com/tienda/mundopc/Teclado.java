package arg.com.tienda.mundopc;

public class Teclado extends dispositivoEntrada {

    private final int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado= " + idTeclado + "," + super.toString() + '}';
    }
}

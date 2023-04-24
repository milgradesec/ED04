package cuentas;

/**
 * Implementa la gestión de una cuenta bancaria.
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * Identificador de la cuenta.
     */
    private String cuenta;

    /**
     * Saldo actual en la cuenta.
     */
    private double saldo;

    /**
     * Tipo de interés que se aplica.
     */
    private double tipoInteres;

    /**
     * Constructor de CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor de CCuenta
     * 
     * @param nom  nombre del titular
     * @param cue  identificador de la cuenta.
     * @param sal  saldo
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return saldo
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa una cantidad específica en la cuenta.
     * 
     * @param cantidad cantidad a ingresar
     * @throws Exception si se provee una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad específica de la cuenta.
     * 
     * @param cantidad cantidad a retirar
     * @throws Exception si se intenta retirar una cantidad negativa o no hay saldo
     *                   suficiente para realizar la operación.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}

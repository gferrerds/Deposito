package cuentas;

/**
 * Clase que representa una cuenta bancaria con operaciones básicas
 * @author Guillermo
 * @version 1.0
 */
public class CCuenta {

	/**
     * Nombre del titular de la cuenta
     */
    private String nombre;
    
    /**
     * Número de cuenta bancaria
     */
    private String cuenta;
    
    /**
     * Saldo actual de la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés aplicado a la cuenta
     */
    private double tipoInteres;

    /**
     * Constructor por defecto de la clase CCuenta
     */
    public CCuenta() {
    }

    /**
     * Constructor parametrizado de la clase CCuenta
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        this.nombre =nom;
        this.cuenta=cue;
        this.saldo=sal;
    }
    
    
    /**
	 * @return Nombre del titular
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre Nuevo nombre del titular
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return Número de cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta Nuevo número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return Saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo Nuevo saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return Tipo de interés
	 */
	public double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * @param tipoInteres Nuevo tipo de interés
	 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
    
    
	/**
     * Obtiene el saldo actual de la cuenta
     * @return Saldo actual
     */
    public double estado()
    {
        return this.saldo;
    }

    /**
     * Ingresa una cantidad en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        this.saldo = this.saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        this.saldo = this.saldo - cantidad;
    }
}

package como.senati.mediateca;

public class Prestamo {
	int idprestamo;
	int idsocio;
	int idsoporte;
	int cantidad;
	float monto;
	
	
	
	public Prestamo(int idprestamo, int idsocio, int idsoporte, int cantidad, float monto) {
		super();
		this.idprestamo = idprestamo;
		this.idsocio = idsocio;
		this.idsoporte = idsoporte;
		this.cantidad = cantidad;
		this.monto = monto;
	}


	
	
	
	
	/**
	 * @return the idprestamo
	 */
	public int getIdprestamo() {
		return idprestamo;
	}






	/**
	 * @param idprestamo the idprestamo to set
	 */
	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}






	/**
	 * @return the idsocio
	 */
	public int getIdsocio() {
		return idsocio;
	}






	/**
	 * @param idsocio the idsocio to set
	 */
	public void setIdsocio(int idsocio) {
		this.idsocio = idsocio;
	}






	/**
	 * @return the idsoporte
	 */
	public int getIdsoporte() {
		return idsoporte;
	}






	/**
	 * @param idsoporte the idsoporte to set
	 */
	public void setIdsoporte(int idsoporte) {
		this.idsoporte = idsoporte;
	}






	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}






	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}






	/**
	 * @return the monto
	 */
	public float getMonto() {
		return monto;
	}






	/**
	 * @param monto the monto to set
	 */
	public void setMonto(float monto) {
		this.monto = monto;
	}






	@Override
	public String toString() {
		return "Prestamo [idprestamo=" + idprestamo + ", idsocio=" + idsocio + ", idsoporte=" + idsoporte
				+ ", cantidad=" + cantidad + ", monto=" + monto + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}






	

}

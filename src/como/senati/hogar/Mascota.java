package como.senati.hogar;

public class Mascota {
	int idmascota;
	String nombre;
	String raza;
	String color;
	String tipo;
	int edad;
	String genero;
	
	
	//Constructor lleno
	public Mascota(int idmascota, String nombre, String raza, String color, String tipo, int edad, String genero) {
		super();
		this.idmascota = idmascota;
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tipo = tipo;
		this.edad = edad;
		this.genero = genero;
	}
	
	//Constructor Vacio
	public Mascota() {
		
	}


	
	//Getters and Setters
	/**
	 * @return the idmascota
	 */
	public int getIdmascota() {
		return idmascota;
	}


	/**
	 * @param idmascota the idmascota to set
	 */
	public void setIdmascota(int idmascota) {
		this.idmascota = idmascota;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}


	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}


	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}


	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}


	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Mascota [idmascota=" + idmascota + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color
				+ ", tipo=" + tipo + ", edad=" + edad + ", genero=" + genero + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	

}

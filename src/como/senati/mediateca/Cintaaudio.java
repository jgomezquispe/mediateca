package como.senati.mediateca;

public class Cintaaudio extends Soporte{
	//Atributos de la clase Cintaaudio
	String lugar;
	int duracion;
	
	
    //Atributos llenos
	public Cintaaudio(String titulo, String autor, float precio, String lugar, int duracion) {
		super(titulo, autor, precio);
		this.lugar = lugar;
		this.duracion = duracion;
	}



	//Atributos vacios
	public Cintaaudio() {
		super();
	}

	

	//Getters y Setters
	

	
	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}

	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	/**
	 * @return the duracion
	 */
	public int getDuracion() {
		return duracion;
	}

	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cintaaudio [lugar=" + lugar + ", duracion=" + duracion + ", titulo=" + titulo + ", autor=" + autor
				+ ", precio=" + precio + "]";
	}
	
	
	

	
	
}

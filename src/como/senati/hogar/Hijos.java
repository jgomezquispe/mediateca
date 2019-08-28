package como.senati.hogar;

public class Hijos {
	String genero;

	
	//Constructor lleno
	public Hijos(String genero) {
		super();
		this.genero = genero;
	}
	
	//Constructor vacio
	public Hijos() {
		
	}

    //Getters and Setters

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
		return "Hijos [genero=" + genero + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	

}



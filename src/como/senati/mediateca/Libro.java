package como.senati.mediateca;

public class Libro extends Soporte{
	//Para heredar atributos de una clase superior 
	//extends Superclase
	int nropagina;
	int nroisbn;
	
	
	//Constructores llenos
	
	public Libro(String titulo, String autor, float precio, int nropagina, int nroisbn) {
		super(titulo, autor, precio);
		this.nropagina = nropagina;
		this.nroisbn = nroisbn;
	}

	//Constructores vacios
	public Libro() {
		super();
	}


	


	/**
	 * @return the nropagina
	 */
	public int getNropagina() {
		return nropagina;
	}


	/**
	 * @param nropagina the nropagina to set
	 */
	public void setNropagina(int nropagina) {
		this.nropagina = nropagina;
	}


	/**
	 * @return the nroisbn
	 */
	public int getNroisbn() {
		return nroisbn;
	}


	/**
	 * @param nroisbn the nroisbn to set
	 */
	public void setNroisbn(int nroisbn) {
		this.nroisbn = nroisbn;
	}


	//tostring ()
	@Override
	public String toString() {
		return "Libro [nropagina=" + nropagina + ", nroisbn=" + nroisbn + ", titulo=" + titulo + ", autor=" + autor
				+ ", precio=" + precio + "]";
	}
	
	
	
	
	
	
}

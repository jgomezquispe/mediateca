package como.senati.mediateca;

public class Soporte {
	//Atributos de la Clase Soporte
	public int id;
	public String titulo;
    public String autor;
    public float precio;
	
    //Constructores con atributos
    public Soporte(String titulo, String autor, float precio) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
    
    //Constructores sin atributos
      public Soporte() {
    	  
      }

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Soporte [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}

	//
    
    
    
    
    
    
    
}

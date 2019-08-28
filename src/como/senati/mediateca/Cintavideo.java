package como.senati.mediateca;

public class Cintavideo extends Soporte{
	String actores;
	int duracion;
	
	
	
	public Cintavideo(String titulo, String autor, float precio, String actores, int duracion) {
		super(titulo, autor, precio);
		this.actores = actores;
		this.duracion = duracion;
	}
	public Cintavideo() {
		super();
	}
	public String getActores() {
		return actores;
	}
	public void setActores(String actores) {
		this.actores = actores;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	@Override
	public String toString() {
		return "Cintavideo [actores=" + actores + ", duracion=" + duracion + ", id=" + id + ", titulo=" + titulo
				+ ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	
}

package como.senati.mediateca;

import java.util.HashSet;//Java colecciones para arrays con seguridad
import java.util.Set;//Java colecciones: matrices,listas,array

public class Implementa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Añadir nuevos socios
		// Clase objeto = new Clase()
		
		Socio socio1 = new Socio();
        socio1.id=100;
        socio1.nombre="Jorge Antonio";
        socio1.apellidos="Luque Chambi";
        socio1.distritos = "Los Olivos";
        
        Socio socio2 = new Socio();
        socio2.id=101;
        socio2.nombre="Esther";
        socio2.apellidos="Aquino Olivares";
        socio2.distritos="Los Olivos";
        
        System.out.println(socio1.toString());
        System.out.println(socio2.toString());
        
        Socio socio3 = new Socio(103,"Alicia","Gomez Avalos","Comas");
        System.out.println(socio3.toString());
        
        Libro libro1 = new Libro("Matalache", "Alvaro Vargas LLosa", 50f, 300, 123);
        System.out.println(libro1.toString());
        
        Libro libro2 = new Libro("Odisea", "Homero", 30f, 400, 456789);
        System.out.println(libro2.toString());
        
        System.out.println("Lista de Socios");
        
        Socio soc1 = new Socio(104,"Jorge","Luque","Comas");
		Socio soc2 = new Socio(105,"Maria","Luna","Comas");
		Socio soc3 = new Socio(106,"Gerardo","Luque","Comas");
		Socio soc4 = new Socio(107,"Alex", "Lopez","Comas");
		Socio soc5 = new Socio(108,"Alex", "Lopez","Comas");
        
        Set <Socio> sociosinscritos = new HashSet<Socio>();
        sociosinscritos.add(soc1);
		sociosinscritos.add(soc2);
		sociosinscritos.add(soc3);
		sociosinscritos.add(soc4);
		sociosinscritos.add(soc5);
		
		
		for (Socio socio : sociosinscritos) {
			System.out.println(socio.id + " " + socio.nombre + " " + socio.apellidos + " " +socio.distritos);
		}
		
		System.out.println("Lista de Libros");
		
		
		Libro lib1 = new Libro("Matalache","Alvaro Vargas LLosa", 50f, 300, 109);
		Libro lib2 = new Libro("Odisea", "Homero", 30f, 400, 110);
		Libro lib3 = new Libro("Las mil y una noche", "Mario Vargas LLosa", 25f, 500, 111);
		Libro lib4 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 60f, 600, 112);
		Libro lib5 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 70f, 700, 113);
        
		 Set <Libro> librosinscritos = new HashSet<Libro>();
	        librosinscritos.add(lib1);
			librosinscritos.add(lib2);
			librosinscritos.add(lib3);
			librosinscritos.add(lib4);
			librosinscritos.add(lib5);
			
			
			for (Libro libro : librosinscritos) {
				System.out.println( libro.nroisbn + " " + libro.titulo + " " + libro.autor +" "+
				 libro.precio);
			}
			

			System.out.println("Lista de Audios");
			Cintaaudio aud1 = new Cintaaudio("Musica orignal","Jhairo Gomez", 40, "El Agustino", 20);
			Cintaaudio aud2 = new Cintaaudio("Musica orignal","Jhairo Gomez", 40, "El Agustino", 20);
			Cintaaudio aud3 = new Cintaaudio("Musica orignal","Jhairo Gomez", 40, "El Agustino", 20);
			Cintaaudio aud4 = new Cintaaudio("Musica orignal","Jhairo Gomez", 40, "El Agustino", 20);
			Cintaaudio aud5 = new Cintaaudio("Musica orignal","Jhairo Gomez", 40, "El Agustino", 20);
			
			Set <Cintaaudio> audiosGrabados = new HashSet<Cintaaudio>();
			
			audiosGrabados.add(aud1);
			audiosGrabados.add(aud2);
			audiosGrabados.add(aud3);
			audiosGrabados.add(aud4);
			audiosGrabados.add(aud5);
			
			for (Cintaaudio audio : audiosGrabados) {
				System.out.println(audio.titulo + " " + audio.autor +" "+ audio.precio +" "+ audio.lugar+" "+ audio.duracion);
			}
			
      
			System.out.println("Lista de Videos");
			Cintavideo vid1 = new Cintavideo("Musica Variada", "Jhairo Gomez", 35, "juan y luis", 8);
			Cintavideo vid2 = new Cintavideo("Musica Variada", "Jhairo Gomez", 35, "juan y luis", 8);
		    Cintavideo vid3 = new Cintavideo("Musica Variada", "Jhairo Gomez", 35, "juan y luis", 8);
			Cintavideo vid4 = new Cintavideo("Musica Variada", "Jhairo Gomez", 35, "juan y luis", 8);
			Cintavideo vid5 = new Cintavideo("Musica Variada", "Jhairo Gomez", 35, "juan y luis", 8);
			
			Set <Cintavideo> VideosGrabados = new HashSet<Cintavideo>();
			
			VideosGrabados.add(vid1);
			VideosGrabados.add(vid2);
			VideosGrabados.add(vid3);
			VideosGrabados.add(vid4);
			VideosGrabados.add(vid5);
			
			for (Cintavideo video : VideosGrabados) {
				System.out.println( video.titulo + " " + video.autor +" "+ video.precio +" "+ video.actores+" "+ video.duracion);
			}
	}

}

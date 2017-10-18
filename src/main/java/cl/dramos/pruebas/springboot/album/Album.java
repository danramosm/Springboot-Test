package cl.dramos.pruebas.springboot.album;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//documento MONGODB album

@Document(collection = "album")
public class Album {
	
	@Id
	private String id;
	private String Artista;
	private String nombre;
	private String Rating;
	
	public String getId() {
		return this.id;	
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getArtista() {
		return Artista;
	}

	public void setArtista(String artista) {
		Artista = artista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRating() {
		return Rating;
	}

	public void setRating(String Rating) {
		this.Rating = Rating;
	}



}

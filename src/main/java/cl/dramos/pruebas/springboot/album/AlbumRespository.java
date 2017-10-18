package cl.dramos.pruebas.springboot.album;

import org.springframework.data.mongodb.repository.MongoRepository;

//Simple interfaz mongoDB para operar con la coleccion Albums
public interface AlbumRespository extends MongoRepository<Album, String> {

}

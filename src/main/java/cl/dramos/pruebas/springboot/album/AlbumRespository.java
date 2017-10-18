package cl.dramos.pruebas.springboot.album;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRespository extends MongoRepository<Album, String> {

}

package cl.dramos.pruebas.springboot.album;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//Servicio /albums
@RestController
public class AlbumService {
	
	@Autowired
	private AlbumRespository albumRepository;
	
	@GetMapping("/albums")
	public List<Album> getAlbumList(){
		return albumRepository.findAll();
	}

}

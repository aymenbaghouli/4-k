package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Director;




@Service
public interface IDirector {
		
	public List<Director> findAllDirectors();
	public void deleteDirectorById(int iduser );
	public Director updateDirector(Director director);
	public List<Director> FindDirectorByName(String username);

	
	
}
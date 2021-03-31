package tn.esprit.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Director;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.repository.DirectorRepository;


@Service
public class DirectorService implements IDirector{
	
	@Autowired
	private DirectorRepository directorRepository;

	@Override
	public List<Director> findAllDirectors() {
		
		  return (List<Director>) directorRepository.findAll();
	}

	@Override
	public void deleteDirectorById(int iduser) {
		directorRepository.deleteById(iduser);
		
	}

	@Override
	public Director updateDirector(Director director) {
		return directorRepository.save(director);
	}

	@Override
	public List<Director> FindDirectorByName(String username) {
		return directorRepository.FindDirectorByName(username);
	}
	

}
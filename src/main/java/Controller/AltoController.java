package Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.AltoEntity;
import Repo.AltoRepo;

@RestController
@RequestMapping("/admin")
public class AltoController {
	
	@Autowired
	private AltoRepo altoRepo;
	
	@PostMapping("/")
 AltoEntity AddData(@RequestBody AltoEntity alto) {
		return this.altoRepo.save(alto);
	}
	
	@GetMapping("/")
	public List<AltoEntity> getdata(){
		return this.altoRepo.findAll();
	}
	@GetMapping("/id")
	public Optional<AltoEntity> getRecord(@PathVariable("id") int id){
		return this.altoRepo.findById(id);
	}
	
	@PutMapping("/")
 AltoEntity updateRecord(@RequestBody AltoEntity alto) {
		return this.altoRepo.save(alto);
		}
	
	@DeleteMapping("/id")
	public String deleteRecord(@PathVariable("id") int id) {
		this.altoRepo.deleteById(id);
		return "record deleted";

}
}

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

import Entity.CarEntity;
import Repo.CarRepo;

@RestController
@RequestMapping("/User")

public class CarController {
	
@Autowired
private CarRepo carRepo;

@PostMapping("/")
 CarEntity addRecord(@RequestBody CarEntity car) {
	return this.carRepo.save(car);
}

@DeleteMapping("/id")
public String deleteRecord(@PathVariable("id") int id) {
	this.carRepo.deleteById(id);
	return"Record Deleted";
}


@PutMapping("/")
CarEntity updateRecord(@RequestBody CarEntity car) {
	return this.carRepo.save(car);
}

@GetMapping("/")
	public List<CarEntity> GetData(){
return this.carRepo.findAll();
}

@GetMapping("/id")
public Optional<CarEntity> GetRecord(@PathVariable("id") int id) {
return this.carRepo.findById(id);
}
}

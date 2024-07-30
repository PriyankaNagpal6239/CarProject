package Repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.CarEntity;

@Repository
public interface CarRepo extends JpaRepository<CarEntity, Integer> {



}

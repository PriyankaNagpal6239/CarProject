package Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.AltoEntity;

@Repository
public interface AltoRepo extends JpaRepository<AltoEntity, Integer> {

}

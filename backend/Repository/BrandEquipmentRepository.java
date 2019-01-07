package sut.sa.g16.Repository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sut.sa.g16.Entity.BrandEquipment;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface BrandEquipmentRepository extends JpaRepository<BrandEquipment, Long>{
    BrandEquipment findBybrandEquId(Long brandEquId);
}

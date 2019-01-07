package sut.sa.g16.Repository;

import org.springframework.web.bind.annotation.CrossOrigin;
import sut.sa.g16.Entity.BookingEquipment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface BookingRepository extends JpaRepository<BookingEquipment, Long>{
    BookingEquipment findByequipmentName(String equipmentName);
}

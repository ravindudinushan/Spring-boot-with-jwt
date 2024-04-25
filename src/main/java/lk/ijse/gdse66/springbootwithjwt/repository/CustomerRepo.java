package lk.ijse.gdse66.springbootwithjwt.repository;


import lk.ijse.gdse66.springbootwithjwt.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<CustomerEntity,String> {
}

package Genboot.demo.repository;

import Genboot.demo.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, Long> {
   Optional<CloudVendor> findByVendorPhoneNumber(String vendorPhoneNumber);

}

package Genboot.demo.services;

import Genboot.demo.model.CloudVendor;
import Genboot.demo.repository.CloudVendorRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServicelmpl implements CloudVendorService{

@Autowired
private CloudVendorRepository cloudVendorRepository;

    @Override
    public String create(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Vendor created";
    }

    @Override
        public String update(Long Id, CloudVendor cloudVendor) {
            cloudVendorRepository.findById(Id);
        cloudVendorRepository.save(cloudVendor);
        return "Vendor updated";
    }

    @Override
    public String updateAll(List<CloudVendor> cloudVendors) {
        cloudVendorRepository.saveAll(cloudVendors);
        return "Vendor Updated";
    }


    @Override
    public String delete(Long Id) {
        cloudVendorRepository.deleteById(Id);
        return "particular Vendor deleted";
    }

    @Override
    public CloudVendor get(Long Id) {
        return cloudVendorRepository.findById(Id).get();

    }

    @Override
    public List<CloudVendor> getAll() {
        return cloudVendorRepository.findAll();
    }
}

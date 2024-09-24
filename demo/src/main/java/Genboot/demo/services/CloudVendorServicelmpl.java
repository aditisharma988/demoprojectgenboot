package Genboot.demo.services;

import Genboot.demo.exception.CloudVendorAlreadyExistsException;
import Genboot.demo.exception.CloudVendorNotFoundException;
import Genboot.demo.model.CloudVendor;
import Genboot.demo.repository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServicelmpl implements CloudVendorService{

@Autowired
private CloudVendorRepository cloudVendorRepository;

    @Override
    public String create(CloudVendor cloudVendor) {
        if (cloudVendorRepository.findByVendorPhoneNumber(cloudVendor.getVendorPhoneNumber()).isPresent()) {
            throw new CloudVendorAlreadyExistsException("Cloud vendor already exists");
        }
        cloudVendorRepository.save(cloudVendor);
        return "Vendor created";
    }


    @Override
        public String update(Long Id, CloudVendor cloudVendor) {
            if (cloudVendorRepository.findById(Id).isEmpty())
            throw  new CloudVendorNotFoundException("Requested cloud vendor does not exists.");
        else{cloudVendorRepository.save(cloudVendor);
        return "Vendor updated";}
    }

    @Override
    public String updateAll(List<CloudVendor> cloudVendors) {
        cloudVendorRepository.saveAll(cloudVendors);
        return "Vendor Updated";
    }

    @Override
    public String delete(Long Id) {
        if (cloudVendorRepository.findById(Id).isEmpty())
            throw  new CloudVendorNotFoundException("Requested cloud vendor does not exists.");
        cloudVendorRepository.deleteById(Id);
        return "particular Vendor deleted";
    }

    @Override
    public CloudVendor get(Long Id) {
        if(cloudVendorRepository.findById(Id).isEmpty())
            throw  new CloudVendorNotFoundException("Requested cloud vendor does not exists.");
        return cloudVendorRepository.findById(Id).get();

    }

    @Override
    public List<CloudVendor> getAll() {
        return cloudVendorRepository.findAll();
    }
}

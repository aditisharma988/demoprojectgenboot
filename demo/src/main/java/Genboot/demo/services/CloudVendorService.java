package Genboot.demo.services;

import Genboot.demo.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String create(CloudVendor cloudVendor);
    public String update(Long Id, CloudVendor cloudVendor);
    public String updateAll(List<CloudVendor> cloudVendors);
    public String delete(Long Id);
    public CloudVendor get(Long Id);
    public List<CloudVendor> getAll();

}
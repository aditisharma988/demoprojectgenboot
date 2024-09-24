package Genboot.demo.controller;
import Genboot.demo.model.CloudVendor;
import Genboot.demo.services.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiServiceController {

    @Autowired
    private CloudVendorService cloudVendorService;

   //get specific cloud vendor
    @GetMapping("/{Id}")
    public CloudVendor getCloudVendorDetails(@PathVariable("Id") Long Id )
    {
        return cloudVendorService.get(Id);
    }

    //get all cloud vendors
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails()
    {
        return cloudVendorService.getAll();
    }

    //create a cloud vendor
    @PostMapping("/create")
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorService.create(cloudVendor);
        return " Cloud vendor created successfully";
    }


    //update a cloud vendor
    @PutMapping("/update/{Id}")
    public String updateCloudVendorDetails(@PathVariable("Id") Long Id,@RequestBody CloudVendor cloudVendor )
    {
        cloudVendorService.update(Id, cloudVendor);
        return "A Cloud vendor updated successfully";
    }


    //update all cloud vendors
    @PutMapping("/update")
    public String updateAllCloudVendorDetails(@RequestBody List<CloudVendor> cloudVendors )
    {
        cloudVendorService.updateAll(cloudVendors);
        return "All Cloud vendors updated successfully";
    }


    //delete a cloud vendor
    @DeleteMapping("/delete/{Id}")
    public String deleteCloudVendorDetails(@PathVariable("Id") Long Id )
    {
         cloudVendorService.delete(Id);
         return "Cloud vendor deleted successfully";

    }

}

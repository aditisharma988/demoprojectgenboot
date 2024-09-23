package Genboot.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table( name ="cloudVendor")
public class CloudVendor extends BaseEntity {

    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNumber;

}

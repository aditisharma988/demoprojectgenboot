package Genboot.demo.exception;

public class CloudVendorAlreadyExistsException extends RuntimeException {

    public CloudVendorAlreadyExistsException(String message){
        super(message);
    }

public CloudVendorAlreadyExistsException(String message, Throwable cause){
    super(message,cause);

}}
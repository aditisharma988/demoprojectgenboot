package Genboot.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {


    @ExceptionHandler(value ={CloudVendorNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundException(CloudVendorNotFoundException cloudVendorNotFoundException)
    {
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudVendorNotFoundException.getMessage(),
                cloudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
                );
        return new ResponseEntity<>(cloudVendorException, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(value ={CloudVendorAlreadyExistsException.class})
    public ResponseEntity<Object> handleCloudVendorAlreadyExistsException(CloudVendorAlreadyExistsException cloudVendorAlreadyExistsException)
    {
        CloudVendorException cloudVendorException = new CloudVendorException(
                cloudVendorAlreadyExistsException.getMessage(),
                cloudVendorAlreadyExistsException.getCause(),
                HttpStatus.CONFLICT
        );
        return new ResponseEntity<>(cloudVendorException, HttpStatus.CONFLICT);
    }
}

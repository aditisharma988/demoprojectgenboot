package Genboot.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Data
public class CloudVendorException {

    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}

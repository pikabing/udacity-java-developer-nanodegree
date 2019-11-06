package security.spring.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dog Not Found")
public class DogNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 5505022954069360527L;

    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
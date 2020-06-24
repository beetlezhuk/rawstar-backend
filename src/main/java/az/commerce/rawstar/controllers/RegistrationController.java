package az.commerce.rawstar.controllers;

import az.commerce.rawstar.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class RegistrationController {

    @PostMapping("/registration")
    public ResponseEntity<String> registrationController(@RequestBody User user) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

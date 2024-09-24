package inshining.applydemo.controller;

import inshining.applydemo.dto.UserDto;
import inshining.applydemo.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
public class RegistrationController {

    private RegistrationService registrationService;

    @PostMapping("/registration")
    public String registration(@RequestBody UserDto userDto) {
        return registrationService.registration(userDto);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}

package org.example.controller;

import org.example.dto.AppleDto;
import org.example.service.AppleService;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@RestController
//@RequestMapping("/apples/")
public class AppleController {

    private final AppleService appleService;

    public AppleController(AppleService appleService) {
        this.appleService = appleService;
    }

    @GetMapping("/getAll")
    public List<AppleDto> getAllCars() {
        return appleService.getAllApples();
    }
}

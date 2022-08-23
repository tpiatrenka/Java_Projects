package com.example.apple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "apples")
public class AppleController {

    private final AppleService appleService;
    @Autowired
    public AppleController(AppleService appleService) {
        this.appleService = appleService;
    }
    @PostMapping("/save")
    public long save(@RequestBody AppleDto appleDto) {
        return appleService.save(appleDto);
    }

    @GetMapping("/all")
    public List<AppleDto> findAll(){
        return appleService.findAll();
    }

}

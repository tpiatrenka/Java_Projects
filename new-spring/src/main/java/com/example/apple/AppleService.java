package com.example.apple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppleService {

    private final AppleRepository appleRepository;
    private final AppleConverter appleConverter;
    @Autowired
    public AppleService(AppleRepository appleRepository, AppleConverter laptopConverter) {
        this.appleRepository = appleRepository;
        this.appleConverter = laptopConverter;
    }
    public long save(AppleDto appleDto) {
        Apple apple = appleConverter.toLocal(appleDto);
        Apple savedApple = appleRepository.save(apple);
        return savedApple.getId();
    }

    public List<AppleDto> findAll() {
        List<Apple> apples = appleRepository.findAll();
        return apples.stream().map(appleConverter::toFront).toList();
    }
}

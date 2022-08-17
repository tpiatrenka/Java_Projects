package org.example.service;

import org.example.converter.AppleConverter;
import org.example.dto.AppleDto;
import org.example.entity.Apple;
import org.example.repository.AppleRepository;

import java.util.List;
//@Service
public class AppleService {
    private final AppleRepository appleRepository;
    private final AppleConverter appleConverter;

    public AppleService(AppleRepository appleRepository, AppleConverter appleDtoConverter) {
        this.appleRepository = appleRepository;
        this.appleConverter = appleDtoConverter;
    }

    public List<AppleDto> getAllApples() {
        List<Apple> allCars = appleRepository.getAll();
        return allCars.stream().map(appleConverter::convert).toList();
    }
}

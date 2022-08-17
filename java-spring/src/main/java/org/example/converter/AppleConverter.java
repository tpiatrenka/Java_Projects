package org.example.converter;

import org.example.entity.Apple;
import org.example.dto.AppleDto;
import org.springframework.stereotype.Component;

@Component
public class AppleConverter {
    public AppleDto convert(Apple apple){
        return new AppleDto(apple.getName(),apple.getColor(),apple.getQuantity(),apple.getPrice());
    }
}

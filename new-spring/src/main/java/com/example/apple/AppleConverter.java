package com.example.apple;

import org.springframework.stereotype.Component;

@Component
public class AppleConverter {
    public Apple toLocal(AppleDto dto) {
        Apple apple = new Apple();

        apple.setId(dto.id());
        apple.setName(dto.name());
        apple.setColor(dto.color());
        apple.setQuantity(dto.quantity());
        apple.setPrice(dto.price());
        return apple;
    }
    public AppleDto toFront(Apple apple) {
        return new AppleDto(apple.getId(), apple.getName(), apple.getColor(), apple.getQuantity(), apple.getPrice());
    }
}

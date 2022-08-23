package com.example.apple;

import java.math.BigDecimal;

public record AppleDto(Long id, String name, String color, Integer quantity, BigDecimal price) {

}

package com.example.user.dto;

import com.example.user.dto.AvatarDto;
import com.example.user.dto.SubscriptionDto;

import java.util.List;

public record UserDto(Long id,
                      String login,
                      String password,
                      AvatarDto avatar,
                      List<SubscriptionDto> subscriptions,
                      List<CommentDto> comments){
}

package com.example.user.converter;

import com.example.user.dto.UserDto;
import com.example.user.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
        private final AvatarConverter avatarConverter;
        private final SubscriptionConverter subscriptionConverter;
        private final CommentConverter commentConverter;


    public UserConverter(SubscriptionConverter subscriptionConverter, AvatarConverter avatarConverter, CommentConverter commentConverter) {
        this.avatarConverter = avatarConverter;
        this.subscriptionConverter = subscriptionConverter;
        this.commentConverter = commentConverter;
    }

    public User toLocal(UserDto dto) {
        User user = new User();
        user.setId(dto.id());
        user.setLogin(dto.login());
        user.setPassword(dto.password());
        user.setAvatar(avatarConverter.toLocal(user,dto.avatar()));
     //   user.setAvatar(dto.avatar());
        user.setSubscriptions(subscriptionConverter.toLocal(user,dto.subscriptions()));
        user.setComments(commentConverter.toLocal(user,dto.comments()));
        return user;
    }

    public UserDto toFront(User user) {
        return new UserDto(user.getId(), user.getLogin(), user.getPassword(), avatarConverter.toFront(user.getAvatar()),
                subscriptionConverter.toFront(user.getSubscriptions()),
                commentConverter.toFront(user.getComments()));
    }
}

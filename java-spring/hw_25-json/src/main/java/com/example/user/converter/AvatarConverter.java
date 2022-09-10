package com.example.user.converter;

import com.example.user.dto.AvatarDto;
import com.example.user.entity.Avatar;
import com.example.user.entity.User;
import org.springframework.stereotype.Component;

@Component
public class AvatarConverter {
    public AvatarDto toFront(Avatar avatar){
        if (avatar == null){
            return null;
        }
        return new AvatarDto(avatar.getId(), avatar.getUrl());
    }

    public Avatar toLocal(User user, AvatarDto dto){
        if (dto == null){
            return null;
        }
        Avatar avatar = new Avatar();
        avatar.setId(dto.id());
        avatar.setUrl(dto.url());
        avatar.setUser(user);
        return avatar;
    }
}

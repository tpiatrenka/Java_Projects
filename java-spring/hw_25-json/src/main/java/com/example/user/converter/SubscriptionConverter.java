package com.example.user.converter;

import com.example.user.dto.SubscriptionDto;
import com.example.user.entity.Subscription;
import com.example.user.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubscriptionConverter {
    public Subscription toLocal(User user, SubscriptionDto dto) {
        if (dto == null) {
            return null;
        }
        Subscription subscription = new Subscription();

        subscription.setType(dto.type());
        subscription.setUsers(user);

        return subscription;
    }

    public SubscriptionDto toFront(Subscription subscription) {
        if (subscription == null) {
            return null;
        }

        return new SubscriptionDto(subscription.getId(), subscription.getType());
    }

    public List<Subscription> toLocal(User user, List<SubscriptionDto> subscriptionDtos) {
        if (subscriptionDtos == null) {
            return null;
        }

        return subscriptionDtos.stream()
                .map(dto -> toLocal(user, dto))
                .toList();
    }

    public List<SubscriptionDto> toFront(List<Subscription> subscriptions) {
        if (subscriptions == null) {
            return null;
        }

        return subscriptions.stream()
                .map(this::toFront)
                .toList();
    }
}

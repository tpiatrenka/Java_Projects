package com.example.user.entity;

import javax.persistence.*;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private Type type;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }


}

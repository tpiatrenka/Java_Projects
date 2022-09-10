package com.example.user.entity;

import javax.persistence.*;
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

}

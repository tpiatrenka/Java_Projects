package com.example.user.entity;

import com.example.user.entity.Avatar;
import com.example.user.entity.Subscription;

import javax.persistence.*;
import java.util.List;

@Entity(name = "my_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "avatar_id", referencedColumnName = "id")
    private Avatar avatar;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private List<Subscription> subscriptions;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private List<Comment> comments;

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public List<Comment> getComments() {return comments;}

    public void setComments(List<Comment> comments) {this.comments = comments;}
}

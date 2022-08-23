package com.app.self.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Getter @Setter
@Entity(name = "USER_EO")
public class User_EO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    @ManyToMany
    @JoinTable(
            name = "USER_ROLE_EO",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Collection<Role_EO> roles;
    public User_EO() {}
    public User_EO(String username, String password, Collection<Role_EO> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}

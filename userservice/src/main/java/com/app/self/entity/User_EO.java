package com.app.self.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter @Builder
@Entity(name = "USER_EO")
public class User_EO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    @OneToMany @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<USER_ROLE_EO> roles;

}

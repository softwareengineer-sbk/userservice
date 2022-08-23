package com.app.self.entity;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Builder
@Entity(name = "USER_ROLE_EO")
public class USER_ROLE_EO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne(optional = false)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role_EO role_eo;
}

package com.example.osutournament.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class UserModel extends BaseEntity {
    @Column(unique = true)
    private String name;

    @Column(unique = true)
    private Long discordId;
}

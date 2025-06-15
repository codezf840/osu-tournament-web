package com.example.osutournament.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
    name = "roles",
    indexes = {
        @Index(columnList = "tournament_id, name",  unique = true),
        @Index(columnList = "tournament_id, short_name"),
    }
)
@Setter
@Getter
public class RoleModel extends TournamentEntity {
    @Column(nullable = false)
    private String name;

    @Column(name = "short_name")
    private String shortName;

    @Column(nullable = false)
    private Integer permissions;

    @Column(nullable = false)
    private Integer sort;
}

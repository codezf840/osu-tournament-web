package com.example.osutournament.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "creator_id")
    private Long creatorId;

    @Column(name = "create_at")
    private LocalDateTime createAt;

    @Column(name = "modifier_id")
    private Long modifierId;

    @Column(name = "modified_at")
    private LocalDateTime modifiedAt;
}

@MappedSuperclass
abstract class NamedEntity extends BaseEntity {
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "short_name", nullable = false, length = 10)
    private String shortName;
}

@MappedSuperclass
abstract class TournamentEntity extends BaseEntity {
    @Column(name = "tournament_id")
    private Long tournamentId;
}

@MappedSuperclass
abstract class TournamentNamedEntity extends NamedEntity {
    @Column(name = "tournament_id")
    private Long tournamentId;
}

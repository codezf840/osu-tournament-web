package com.example.osutournament.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
    name = "participants",
    indexes = {
        @Index(columnList = "tournament_id, user_id", unique = true)
    }
)
@Setter
@Getter
public class ParticipantModel extends TournamentEntity {

    @Column(name = "user_id")
    private String userId;

    @Column(name = "team_id")
    private Long teamId;

    @Column
    private Boolean checked;
}

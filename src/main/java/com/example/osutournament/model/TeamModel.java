package com.example.osutournament.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
    name = "teams",
    indexes = {
        @Index(columnList = "tournament_id, name", unique = true),
        @Index(columnList = "tournament_id, short_name", unique = true),
    }
)
@Setter
@Getter
public class TeamModel extends TournamentNamedEntity {
}

package com.example.osutournament.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(
    name = "tournaments",
    indexes = {
        @Index(columnList = "name"),
        @Index(columnList = "short_name"),
    }
)
@Getter
@Setter
public class TournamentModel extends NamedEntity {
    @Column(name = "info_md")
    private String infoMd;

    @Column(name = "rule_md")
    private String ruleMd;

    @Column(name = "prize_md")
    private String prizeMd;
}

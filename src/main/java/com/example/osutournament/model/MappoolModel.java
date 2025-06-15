package com.example.osutournament.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Entity
@Table(
    name = "mappools",
    indexes = {
        @Index(columnList = "tournament_id, name", unique = true),
        @Index(columnList = "tournament_id, short_name", unique = true),
    }
)
@Setter
@Getter
public class MappoolModel extends TournamentNamedEntity {

}

@Entity
@Table(
    name = "mappool_maps"
)
@Setter
@Getter
class MappoolMap extends BaseEntity {
    @Column(name = "mappool_id")
    private Integer mappoolId;

    @Column(name = "beatmap_id")
    private Integer beatmapId;

    @Column(name = "mods_id")
    private Integer modsId;

    @Column(name = "selector_id")
    private Integer selectorId;

    @Column(name = "beatmap_info")
    private String beatmapInfo;
}
package com.example.osutournament.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(
    name = "matches",
    indexes = {

    }
)
@Setter
@Getter
public class MatchModel extends TournamentEntity {
    @Column(name = "stage_id")
    private Integer stageId;

    @Column(name = "mappool_id")
    private Integer mappoolId;

    @Column
    private String tag;

    @Column
    private LocalDateTime startTime;

    @Column
    private String mplink;

    @Column(name = "team1_id")
    private Long team1Id;

    @Column(name = "team1_score")
    private Integer team1Score;

    @Column(name = "team2_id")
    private Integer team2Id;

    @Column(name = "team2_score")
    private Integer team2Score;

    @Column
    private String vod;
}


class MatchStaffId {
    private Long matchId;
    private Long staffId;
    private String job;

    public MatchStaffId(Long matchId, Long staffId, String job) {
        this.matchId = matchId;
        this.staffId = staffId;
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MatchStaffId that = (MatchStaffId) o;
        return Objects.equals(matchId, that.matchId) && Objects.equals(staffId, that.staffId) && Objects.equals(job, that.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matchId, staffId, job);
    }
}


@Entity
@Table(name = "match_staff")
@IdClass(MatchStaffId.class)
@Setter
@Getter
class MatchStaff {
    @Column(name = "match_id")
    @Id
    private Long matchId;

    @Column(name = "staff_id")
    @Id
    private Long staffId;

    @Column
    @Id
    private String job;
}
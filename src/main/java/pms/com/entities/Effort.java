package pms.com.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Effort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int projectMemberId;

    private float calendarEffort;

    private float actualEffort;

    private float buildableEffort;

    private Date reportDate;

    private int positionId;

    private String createdBy;

    private Date createdAt;

    private String approvedBy;

    private Date approvedAt;
}
